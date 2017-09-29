package com.example.intelectusmoney.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

//Para dizer q a classe é uma de configuração, mas a anotação enable abaixo já vem com essa anotação
@Configuration
//para habilitar a segurança
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ROLES");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//todas as requisições precisam de autenticação
		//menos o /categorias
		http.authorizeRequests()
			.antMatchers("/categorias").permitAll()
			.anyRequest()
			.authenticated()
			.and().httpBasic()
			.and()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //quero q a api rest n mantenha o estado de nada
			.and().csrf().disable();//desabilitando o sql injection  feito no serviço em javascript
	}
}
