#language: pt
#encoding: UTF-8
#date: 31/05/2021
#author: Jardeson Santos
#version: 1.0
  Funcionalidade: Cursos no site da Trios de Capacitação
    Como um usuário no site da Trios de Capacitação
    Quero realizar a matrícula
    Para que eu possa participar dos cursos ofertados.

  Contexto:
    Dado que estou no site da Trios de Capacitação "https://triosdecapacitacao.eadplataforma.com/planos/"

    Esquema do Cenário: Validar os tipos de Cursos
      Quando valido as informações de <TipoDoCurso>, <NomeDoCurso>, <PeriodoDoCurso>
      Então eu tenho as informações de <TipoDoCurso> disponiveis.

      Exemplos:
        | TipoDoCurso                | NomeDoCurso           | PeriodoDoCurso |
        | COMBO DE TESTES FUNCIONAIS | WEB,MOBILE E API      | (ABRIL/2021)   |
        | COMBO DE TESTES FUNCIONAIS | WEB+MOBILE+API        | (ABRIL/2021)   |
        | COMBO DE TESTES FUNCIONAIS | WEB E MOBILE          | (ABRIL/2021)   |
        | COMBO DE TESTES FUNCIONAIS | REST ASSURED + SOAPUI | (ABRIL/2021)   |
        | COMBO DE TESTES FUNCIONAIS | REST ASSURED + KARATE | (ABRIL/2021)   |
        | COMBO DE TESTES FUNCIONAIS | POSTMAN + RESTASSURED | (ABRIL/2021)   |
        | TESTES AUTOMATIZADOS       |
        | TESTES AUTOMATIZADOS       |
        | TESTES AUTOMATIZADOS       |


