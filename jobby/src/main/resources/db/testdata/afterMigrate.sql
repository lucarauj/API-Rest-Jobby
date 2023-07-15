INSERT INTO profissao (nome) VALUES
  ('Desenvolvedor de Software'),
  ('Engenheiro de Dados'),
  ('Arquiteto de Software'),
  ('Analista de Sistemas'),
  ('Cientista de Dados'),
  ('Gerente de Projetos de Tecnologia'),
  ('Especialista em Segurança Cibernética'),
  ('Administrador de Banco de Dados'),
  ('Analista de Testes de Software'),
  ('UX/UI Designer');

INSERT INTO pretensao_salarial (valor_minimo, valor_maximo) VALUES
  (1000, 2000),
  (2500, 3500),
  (4000, 5000);

INSERT INTO empresa (nome) VALUES
  ('Google'),
  ('Microsoft'),
  ('Apple'),
  ('Amazon'),
  ('Facebook'),
  ('IBM'),
  ('Oracle'),
  ('Intel'),
  ('Adobe'),
  ('Cisco');

INSERT INTO cidade (nome, estado, sigla) VALUES
  ('São Paulo', 'São Paulo', 'SP'),
  ('Rio de Janeiro', 'Rio de Janeiro', 'RJ'),
  ('Belo Horizonte', 'Minas Gerais', 'MG'),
  ('Salvador', 'Bahia', 'BA'),
  ('Brasília', 'Distrito Federal', 'DF');


INSERT INTO public.cadastro_experiencia (data_contratacao, desligamento, emprego_atual, regime_contratacao_enum, salario, empresa_id, cadastro_id)
VALUES ('2022-01-01 09:00:00', '2022-12-31 18:00:00', true, 'CLT', 5000.00, 1, 1);


INSERT INTO cadastro (nome, cpf, data_nascimento, telefone, email, habilidades, sexo_enum, celular_contato, celular_whatsapp, endereco_cep, endereco_logradouro, endereco_numero, endereco_complemento, endereco_bairro) VALUES
  ('João Gabriel', '12345678901', '1990-01-01 00:00:00', 1234567890, 'joao@example.com', ARRAY['Java', 'Python'], 'MASCULINO', 987654321, true, 12345678, 'Rua A', '123', 'Ap. 101', 'Centro'),
  ('Juan Cassiano', '98765432109', '1995-02-15 10:30:00', 9876543210, 'maria@example.com', ARRAY['C++', 'JavaScript'], 'FEMININO', 123456789, false, 98765432, 'Avenida B', '456', 'Ap. 202', 'Bairro X');
