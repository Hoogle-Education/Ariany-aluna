# Projeto School System

## Objetivo

Criar um sistema capaz de fazer um CRUD todos os alunos de uma escola.

**crud** = (**CREATE | RETRIEVE | UPDATE | DELETE**)

Além disso, cada aluno possui um modelo de pagamento inerente a sua entidade.

## Estado atual

Melhorando o menu e a interação com o usuário e adicionando a opção de adicionar um novo aluno.

## Problemas atuais

1. Capacidade máxima de alunos (1000 alunos no máximo).
2. A cada vez que o programa roda a escola é refeita e os alunos são descartados.
3. A remoção de um aluno é problemática por causa do tipo `Aluno[]` usado para guardar alunos.