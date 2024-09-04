
 -- Todos os alunos de uma determinada disciplina
 select d.nome_disciplina as DISCIPLINA, a.nome_aluno as ALUNO from aluno a, disciplina d, notas n where
 d.id_Disciplina = n.id_Disciplina and
 a.id_aluno = n.id_Aluno and
 n.id_disciplina=2;

-- Os alunos aprovados em um determinada disciplina
select d.nome_disciplina as DISCIPLINA, a.nome_aluno as ALUNO, n.Nota as NOTA from aluno a, disciplina d, notas n where
 d.id_Disciplina = n.id_Disciplina and
 a.id_aluno = n.id_Aluno and
 n.id_disciplina=6 and
 n.Nota >=6;
 -- A quantidade de professores que um determinado aluno tenha;
  Select a.nome_Aluno as ALUNO, COUNT(DISTINCT p.id_professor) as Quantidade_Professor From aluno a, notas n, disciplina d, professor p where
 a.id_Aluno = n.id_Aluno and
 d.id_Disciplina = n.id_Disciplina and
 d.id_Professor = p.id_Professor and
 a.id_Aluno >=1
  group by a.nome_Aluno;
  -- Quantos alunos tem uma determinada disciplina.
  Select d.nome_Disciplina as DISCIPLINA, COUNT(DISTINCT a.id_Aluno) as Quantidade_Alunos from aluno a, notas n, disciplina d where
  a.id_aluno = n.id_Aluno and
  n.id_disciplina = d.id_Disciplina and
  a.id_aluno >= 1
  group by d.nome_Disciplina;