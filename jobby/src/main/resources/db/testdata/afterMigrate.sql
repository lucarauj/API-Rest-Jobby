TRUNCATE TABLE cidade, empresa, cadastro, profissao, cadastro_experiencia RESTART IDENTITY;

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
VALUES ('Microsoft'),
       ('Google'),
       ('Apple'),
       ('Amazon'),
       ('Facebook'),
       ('Tesla'),
       ('Netflix'),
       ('Adobe'),
       ('IBM'),
       ('Intel');

INSERT INTO public.profissao(nome)
VALUES ('Engenheiro'),
       ('Desenvolvedor'),
       ('Designer'),
       ('Analista de Sistemas'),
       ('Médico'),
       ('Professor'),
       ('Advogado'),
       ('Arquiteto'),
       ('Cientista'),
       ('Consultor');

INSERT INTO public.cadastro(contato, whatsapp, cpf, data_nascimento, email, bairro, cep, complemento, logradouro, numero, habilidades, nome, sexo_enum, telefone, cidade_id, valor_minimo, valor_maximo, profissao_id)
VALUES (1, true, '11223344556', '1990-01-01 00:00:00', 'joao.silva@email.com', 'Centro', 12345, 'Sala 101', 'Rua das Flores', '123', '{"C#", "Java", "AWS"}', 'Joana da Silva', 'FEMININO', 987654321, 1, 1500, 5000, 1),
       (2, false, '22334455667', '1995-05-10 12:34:56', 'maria.souza@email.com', 'Jardins', 54321, 'Apto 202', 'Avenida das Palmeiras', '456', '{"Python", "JavaScript", "Azure"}', 'Maria Souza', 'FEMININO', 123456789, 2, 3000, 5400, 2),
       (3, true, '44556677889', '1988-12-15 10:20:30', 'joao.santos@email.com', 'Copacabana', 67890, 'Casa 3', 'Rua das Gaivotas', '789', '{"SQL", "C++", "Google Cloud"}', 'João Santos', 'MASCULINO', 987654321, 3, 2000, 6000, 3),
       (4, true, '55667788990', '1992-03-20 08:15:45', 'ana.rodrigues@email.com', 'Ipanema', 13579, 'Bloco 4', 'Rua das Palmeiras', '101', '{"HTML", "CSS", "Firebase"}', 'Ana Rodrigues', 'FEMININO', 123456789, 4, 2500, 4500, 4),
       (5, false, '66778899001', '1985-11-25 15:30:00', 'carlos.oliveira@email.com', 'Tijuca', 24680, 'Casa 5', 'Avenida das Acácias', '202', '{"PHP", "Ruby", "Heroku"}', 'Carlos Oliveira', 'MASCULINO', 987654321, 5, 1800, 5500, 5),
       (6, true, '77889900112', '1987-09-12 18:45:30', 'amanda.martins@email.com', 'Barra da Tijuca', 98765, 'Apto 606', 'Rua dos Coqueiros', '303', '{"React", "Vue.js", "Netlify"}', 'Amanda Martins', 'FEMININO', 123456789, 6, 2800, 5200, 6),
       (7, false, '88990011223', '1998-07-05 14:00:15', 'lucas.silveira@email.com', 'Lapa', 54321, 'Casa 10', 'Rua das Flores', '404', '{"TypeScript", "Angular", "Vercel"}', 'Lucas Silveira', 'MASCULINO', 987654321, 7, 2200, 4800, 7),
       (8, true, '99001122334', '1991-06-30 16:10:20', 'patricia.santos@email.com', 'Moema', 67890, 'Apto 404', 'Rua dos Jasmins', '505', '{"Java Spring", "Django", "IBM Cloud"}', 'Patricia Santos', 'FEMININO', 123456789, 8, 3200, 5800, 8),
       (9, true, '00112233445', '1986-04-18 11:11:11', 'eduardo.rocha@email.com', 'Ipiranga', 13579, 'Casa 7', 'Avenida das Orquídeas', '606', '{"Node.js", "Express", "AWS Lambda"}', 'Eduardo Rocha', 'MASCULINO', 987654321, 9, 2400, 5200, 9),
       (10, false, '11223344557', '1993-02-28 20:00:45', 'fernanda.silva@email.com', 'Savassi', 24680, 'Apto 101', 'Rua das Oliveiras', '707', '{"Kotlin", "Swift", "Microsoft Azure"}', 'Fernanda Silva', 'FEMININO', 123456789, 10, 2800, 5500, 10);

INSERT INTO public.cadastro_experiencia(data_contratacao, desligamento, emprego_atual, regime_contratacao_enum, salario, empresa_id, cadastro_id)
VALUES ('2021-01-01 00:00:00', '2022-03-15 00:00:00',  false,  'CLT',  5000.0, 1, 1),
       ('2020-05-10 00:00:00', '2023-07-01 00:00:00',  true,  'PJ',  8000.0, 2, 2),
       ('2019-07-20 00:00:00', '2021-09-30 00:00:00',  false,  'COP',  4000.0, 3, 1);