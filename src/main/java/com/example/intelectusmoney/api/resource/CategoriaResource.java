package com.example.intelectusmoney.api.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.intelectusmoney.api.event.RecursoCriadoEvent;
import com.example.intelectusmoney.api.model.Categoria;
import com.example.intelectusmoney.api.repository.CategoriaRepository;

@RestController
//como estamos utilizando a anotação @RestController,
//nosso método não precisou da anotação @ResponseBody.
//Para o caso da construção de APIs, essa última opção com @RestController, fica mais elegante. :)
@RequestMapping("/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ApplicationEventPublisher publisher;
	@GetMapping
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
//@Valid Estou falando para o spring q a categoria tem q ser validada
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
		//Quem criou o evento? categoriaRepository então enviamos o this
		publisher.publishEvent(new RecursoCriadoEvent(this, response, categoriaSalva.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
	}
	@GetMapping("/{codigo}")
	public Categoria buscarPeloCodigo(@PathVariable Long codigo) {
		return categoriaRepository.findOne(codigo);
	}
	@ResponseBody
	@GetMapping("/categoriaPorCodigo/{codigo}")
	public ResponseEntity<Categoria> buscarPeloCodigoRetorno(@PathVariable Long codigo){
		Categoria categoria = categoriaRepository.findOne(codigo);
		return categoria != null ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
	}
	//@ResponseBody
	//Veja que já devolvemos a lista de funcionários diretamente.
	//Isso é porque estamos utilizando a anotação @ResponseBody.
	//Ela diz ao Spring MVC para jogar o retorno do método na resposta.
}