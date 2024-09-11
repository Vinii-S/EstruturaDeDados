select cr.nome_Curso, cr.descricao_Curso from campus c, curso cr where c.id_Campus = cr.id_Campus and c.id_Campus = 2;

 Select distinct a.nome_Aluno as ALUNO, d.descricao_Disciplina as DISCIPLINA, p.nome_Professor as PROFESSOR From aluno a, professor p, notas n, disciplina d where
 a.id_Aluno = n.id_Aluno and
 d.id_Disciplina = n.id_Disciplina and
 d.id_Professor = p.id_Professor and
 a.id_Aluno >=1 ;
 
 select c.nome_campus as CAMPUS, p.nome_Professor as PROFESSOR, COUNT(*) from campus c, curso cr, cursodisciplina cd, disciplina d, professor p where
 c.id_Campus = cr.id_Campus and
 cr.id_Curso = cd.id_Curso and
 d.id_Disciplina = cd.id_Disciplina and
 d.id_Professor = p.id_Professor and
 c.id_Campus>=1
 group by c.nome_campus, p.nome_professor;

 -- A quantidade de professores que um determinado aluno tenha;
  Select a.nome_Aluno as ALUNO, COUNT(DISTINCT p.id_professor) as Quantidade_Professor From aluno a, notas n, disciplina d, professor p where
 a.id_Aluno = n.id_Aluno and
 d.id_Disciplina = n.id_Disciplina and
 d.id_Professor = p.id_Professor and
 a.id_Aluno =6;
 
 -- A quantidade de professores que um determinado aluno tenha usando JOIN;
 select a.nome_Aluno as ALUNO, COUNT(Distinct p.id_professor) as Quantidade_Professor
 from Aluno a inner join Notas n on a.id_Aluno = n.id_Aluno 
 inner join Disciplina d on n.id_Disciplina = d.id_Disciplina
 inner join Professor p on d.id_Professor = p.id_Professor
 where a.id_Aluno=6;

  
  -- Todos os alunos de uma determinada disciplina
 select d.nome_disciplina as DISCIPLINA, a.nome_aluno as ALUNO from aluno a, disciplina d, notas n where
 d.id_Disciplina = n.id_Disciplina and
 a.id_aluno = n.id_Aluno and
 n.id_disciplina=9;
 
 -- Todos os alunos de uma determinada disciplina usando JOIN
 select d.nome_disciplina as DISCIPLINA, a.nome_aluno as Aluno 
 from Disciplina d inner join Notas n on d.id_Disciplina = n.id_Disciplina
 inner join Aluno a on n.id_aluno = a.id_aluno
 where n.id_disciplina=9;
 
 -- Os alunos aprovados em um determinada disciplina
select d.nome_disciplina as DISCIPLINA, a.nome_aluno as ALUNO, n.Nota as NOTA from aluno a, disciplina d, notas n where
 d.id_Disciplina = n.id_Disciplina and
 a.id_aluno = n.id_Aluno and
 n.id_disciplina=1 and
 n.Nota >=6;
 
 -- Os alunos aprovados em um determinada disciplina usando JOIN
 select d.nome_disciplina as DISCIPLINA, a.nome_aluno as ALUNO, n.Nota as NOTA 
 from Disciplina d inner join Notas n on d.id_disciplina = n.id_disciplina
 inner join Aluno a on n.id_aluno = a.id_aluno
 where n.id_disciplina=1 and
 n.Nota>=6;
 
 -- Quantos alunos tem uma determinada disciplina.
  Select d.nome_Disciplina as DISCIPLINA, COUNT(DISTINCT a.id_Aluno) as Quantidade_Alunos from aluno a, notas n, disciplina d where
  a.id_aluno = n.id_Aluno and
  n.id_disciplina = d.id_Disciplina and
  a.id_aluno >= 1
  group by d.nome_Disciplina;
  
-- Quantos alunos tem uma determinada disciplina usando JOIN.
  Select d.nome_Disciplina as DISCIPLINA, COUNT(DISTINCT a.id_Aluno) as Quantidade_Alunos 
  from Aluno a inner join Notas n on a.id_aluno = n.id_aluno
  inner join disciplina d on n.id_Disciplina = d.id_Disciplina
  where a.id_aluno >= 1
  group by d.nome_Disciplina;
  
 
 select * from Professor P right join Disciplina d
 on (P.id_Professor = d.id_Professor);
 
 select * from Aluno a inner join notas n on a.id_Aluno = n.id_Aluno
 join disciplina d on n.id_Disciplina = d.id_Disciplina 
 join Professor p on d.id_Professor = p.id_Professor;
 
