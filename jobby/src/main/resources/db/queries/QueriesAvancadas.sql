-- 4) Contar quantos candidatos possuem a habilidade JAVA
select count(*) as quantidade_candidatos
from cadastro
where 'Java' = any(habilidades);

-- 5) Identificar quais candidatos NÃO possuem habilidade relacionadas
select nome, habilidades 
from cadastro c 
where not 'C#: Java, AWS, 
           Python, JavaScript, Azure,
           SQL, C++, Google Cloud,
           HTML, CSS, Firebase,
           PHP, Ruby, Heroku,
           React, Vue.js, Netlify,
           TypeScript, Angular, Vercel,
           Java Spring, Django, IBM Cloud,
           Node.js, Express, AWS Lambda,
           Kotlin, Swift, Microsoft Azure' = any(habilidades);

-- 6) Selecionar os candidatos que são do sexo FEMININO e que moram nas cidades do estado sigla SP informando o nome, cpf, dados de endereço e nome da cidade
select c.nome, c1.nome, c.cpf
from cadastro c	
inner join cidade c1 
	on c.cidade_id = c1.id  
where sexo_enum = 'FEMININO'
and cidade_id = 1;

-- 7) Agrupar por profissão e contar quantos profissionais que moram na cidade de nome SÃO PAULO
select COUNT(*) as profissionais_sp, p.nome, c.nome, c1.nome
from cadastro c 
inner join cidade c1 
	on c.cidade_id = c1.id
inner join profissao p 
	on c.profissao_id = p.id
where cidade_id = 1
group by p.nome, c.nome, c1.nome;

-- 8) Selecionar candidatos que registram experiências com data de contratação entre 01/01/2023 a 31/12/2023
select ce.data_contratacao 
from cadastro c 
inner join cadastro_experiencia ce 
	on c.id = ce.cadastro_id
where ce.data_contratacao between '2023-01-01' and '2023-12-31';

-- 9) Selecionar candidatos que trabalharam na empresa MICROSOFT
select *
from cadastro c 
inner join cadastro_experiencia ce
	on c.id = ce.cadastro_id 
inner join empresa e 
	on ce.empresa_id = e.id 
where e.id = 1
and ce.emprego_atual = false;
	
-- 10) Selecionar candidatos que AINDA trabalham na empresa MICROSOFT
select *
from cadastro c 
inner join cadastro_experiencia ce
	on c.id = ce.cadastro_id 
inner join empresa e 
	on ce.empresa_id = e.id 
where e.id = 1
and ce.emprego_atual = true;

-- 11) Selecionar candidatos que estão trabalhando atualmente
select *
from cadastro c 
inner join cadastro_experiencia ce
	on c.id = ce.cadastro_id 
inner join empresa e 
	on ce.empresa_id = e.id 
and ce.emprego_atual = false;

-- 12) Criar uma consulta que retorne todos os candidatos e nome da sua profissão correspondentemente
select *
from cadastro c 
inner join profissao p 
	on c.profissao_id = p.id;

-- 13) Criar uma consulta que retorne todos os candidatos e nome da sua profissão onde o id da profissão corresponda ao registro ANALISTA DE SISTEMAS
select *
from cadastro c 
inner join profissao p 
	on c.profissao_id = p.id;

-- 14) Criar uma consulta que conte a quantidade de profissionais por profissão
select COUNT(c.profissao_id) as qtde,
             p.nome as nome_profissao
from cadastro c 
inner join profissao p 
	on c.profissao_id = p.id
where c.profissao_id = c.id 
group by  p.nome;

-- 15) Criar uma consulta que retorne os candidatos ordenados por profissão e salário máximo de forma decrescente
select *
from cadastro c 
inner join cadastro_experiencia ce 
	on c.id = ce.cadastro_id 
inner join profissao p 
	on c.profissao_id = p.id 
order by p.nome, ce.salario desc;