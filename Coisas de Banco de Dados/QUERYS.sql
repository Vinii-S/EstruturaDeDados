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
