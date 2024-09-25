-- SUBQUERYS
	Select P.nome_Professor,
    (Select COUNT(D.id_Professor) from Disciplina D where d.id_Professor = p.id_professor) as Quantidade_Disciplina
    from Professor P
    group by p.id_Professor;
    
	-- SUBQUERY como filtro
    select * from professor p where
    p.id_Professor not in (select d.id_Professor from Disciplina D);
    
    -- EXERCICIO SUBQUERYS QUESTAO 1
    Select a.nome_aluno,
    (Select COUNT( distinct n.id_Disciplina) from Disciplina D, Notas n 
    where a.id_aluno = n.id_Aluno 
    and n.id_disciplina = d.id_Disciplina) as Quantidade_Disciplina
    from Aluno a;
    
    -- Exercicio SUBQUERYS QUESTAO 2
    select a.nome_aluno, a.id_aluno
	from aluno a where
    a.id_Aluno not in (select n.id_aluno from notas n);
    
    -- Exercício SUBQUERYS QUESTAO 3
    select S.nome_aluno, S.Quantidade_Disciplina
    From (select a.nome_aluno,
    (select  count(N.id_Disciplina) from Notas N, Disciplina d
    where a.id_aluno = N.id_aluno 
    and n.id_disciplina = d.id_Disciplina) as Quantidade_Disciplina
    from Aluno a group by a.id_aluno) S 
    where S.Quantidade_Disciplina <2;
    
    