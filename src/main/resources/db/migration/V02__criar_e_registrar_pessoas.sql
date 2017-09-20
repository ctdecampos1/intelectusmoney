create TABLE pessoa (
	codigo 		BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	ativo 		TINYINT(1) NOT NULL,
        nome     	VARCHAR(50),
	logradouro 	VARCHAR(50),
	numero 		VARCHAR(15),
	complemento 	VARCHAR(50),
	bairro 		VARCHAR(50),
	cep 		VARCHAR(10),
	cidade 		VARCHAR(50),
	estado 		VARCHAR(30)
		
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO pessoa(ativo, nome, logradouro, numero, complemento, bairro, cep, cidade, estado) values (true, 'Maria', 'Avenida 3', '123', null, 'centro', '38400394', 'Uberlandia', 'Minas Gerais');

INSERT INTO pessoa(ativo, nome,logradouro, numero, complemento, bairro, cep, cidade, estado) values (false,  'João', 'Avenida 32', '1323',null, 'Rezende', '38400111', 'Uberlandia', 'Minas Gerais');

INSERT INTO pessoa(ativo, nome,logradouro, numero, complemento, bairro, cep, cidade, estado) values (true, 'José', 'Avenida 443', '23123', null, 'Minas', '32400394', 'Uberlandia', 'Minas Gerais');

INSERT INTO pessoa(ativo, nome,logradouro, numero, complemento, bairro, cep, cidade, estado) values (true, 'Antônio', 'Avenida 33', '1323', null, 'centro', '38400394', 'Uberlandia', 'Minas Gerais');

INSERT INTO pessoa(ativo, nome,logradouro, numero, complemento, bairro, cep, cidade, estado) values (true, 'Carla', 'Rua 34', '1243', null, 'Lago', '38400394', 'Uberlandia', 'Minas Gerais');

INSERT INTO pessoa(ativo, nome,logradouro, numero, complemento, bairro, cep, cidade, estado) values (true, 'franchico', 'Rua palmeira', '1223', null, 'centro', '38400394', 'Uberlandia', 'Minas Gerais');


