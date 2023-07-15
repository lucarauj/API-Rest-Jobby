TRUNCATE TABLE cidade, empresa, pretensao_salarial, cadastro, profissao, cadastro_experiencia RESTART IDENTITY;


INSERT INTO public.cidade(estado, nome, sigla)
VALUES ('São Paulo', 'São Paulo', 'SP'),
	   ('Rio de Janeiro', 'Rio de Janeiro', 'RJ'),
	   ('Bahia', 'Salvador', 'BA'),
	   ('Minas Gerais', 'Belo Horizonte', 'MG'),
	   ('Paraná', 'Curitiba', 'PR'),
	   ('Ceará', 'Fortaleza', 'CE'),
	   ('Rio Grande do Sul', 'Porto Alegre', 'RS'),
	   ('Pernambuco', 'Recife', 'PE'),
	   ('Amazonas', 'Manaus', 'AM'),
	   ('Distrito Federal', 'Brasília', 'DF'),
	   ('Alagoas', 'Maceió', 'AL'),
	   ('Amapá', 'Macapá', 'AP'),
	   ('Amazonas', 'Manaus', 'AM'),
	   ('Bahia', 'Salvador', 'BA'),
	   ('Ceará', 'Fortaleza', 'CE'),
	   ('Espírito Santo', 'Vitória', 'ES'),
	   ('Goiás', 'Goiânia', 'GO'),
	   ('Maranhão', 'São Luís', 'MA'),
	   ('Mato Grosso', 'Cuiabá', 'MT'),
	   ('Mato Grosso do Sul', 'Campo Grande', 'MS'),
	   ('Minas Gerais', 'Belo Horizonte', 'MG'),
	   ('Pará', 'Belém', 'PA'),
	   ('Paraíba', 'João Pessoa', 'PB'),
	   ('Paraná', 'Curitiba', 'PR'),
	   ('Pernambuco', 'Recife', 'PE'),
	   ('Piauí', 'Teresina', 'PI'),
	   ('Rio de Janeiro', 'Rio de Janeiro', 'RJ'),
	   ('Rio Grande do Norte', 'Natal', 'RN'),
	   ('Rio Grande do Sul', 'Porto Alegre', 'RS'),
	   ('Rondônia', 'Porto Velho', 'RO'),
	   ('Roraima', 'Boa Vista', 'RR'),
	   ('Santa Catarina', 'Florianópolis', 'SC'),
	   ('São Paulo', 'São Paulo', 'SP'),
	   ('Sergipe', 'Aracaju', 'SE'),
	   ('Tocantins', 'Palmas', 'TO');

INSERT INTO public.empresa(nome)
VALUES ('Empresa A'),
	   ('Empresa B'),
	   ('Empresa C');

INSERT INTO public.pretensao_salarial(valor_maximo, valor_minimo)
VALUES (5000.0, 3000.0),
	   (8000.0, 6000.0),
	   (4000.0, 2500.0);

INSERT INTO public.cadastro(contato, whatsapp, cpf, data_nascimento, email, bairro, cep, complemento, logradouro, numero, habilidades, nome, sexo_enum, telefone, cidade_id, pretensao_salarial_id)
VALUES (1, true, '12345678901', '1990-01-01 00:00:00', 'exemplo1@email.com', 'Bairro 1', 12345, 'Complemento 1', 'Rua 1', '123', '{"Habilidade 1", "Habilidade 2"}', 'João Silva', 'MASCULINO', 987654321, 1, 1),
	   (2, false, '98765432109', '1995-05-10 12:34:56', 'exemplo2@email.com', 'Bairro 2', 54321, 'Complemento 2', 'Rua 2', '456', '{"Habilidade 3", "Habilidade 4"}', 'Maria Souza', 'FEMININO', 123456789, 2, 2);

INSERT INTO public.profissao(nome, cadastro_id)
VALUES ('Engenheiro', 1),
	   ('Desenvolvedor', 2);

INSERT INTO public.cadastro_experiencia(data_contratacao, desligamento, emprego_atual, regime_contratacao_enum, salario, empresa_id, cadastro_id)
VALUES ('2021-01-01 00:00:00', '2022-03-15 00:00:00',  false,  'CLT',  5000.0,  1,  1),
	   ('2020-05-10 00:00:00', '2023-07-01 00:00:00',  true,  'PJ',  8000.0,  2,  2),
	   ('2019-07-20 00:00:00', '2021-09-30 00:00:00',  false,  'COP',  4000.0,  3,  1);
