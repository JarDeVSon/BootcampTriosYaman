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
      Quando valido as informações de <TipoDoCurso>, <NomeDoCurso>, <PeriodoDoCurso>, <CargaHoraria>,<ValorDoCurso>
      Então eu tenho as informações de <TipoDoCurso> disponiveis.

      Exemplos:
        | TipoDoCurso                   | NomeDoCurso                              | PeriodoDoCurso | CargaHoraria | ValorDoCurso  |
        | COMBO DE TESTES FUNCIONAIS    | WEB,MOBILE E API                         | (ABRIL/2021)   | 60 horas     | 10x R$351,30  |
        | COMBO DE TESTES FUNCIONAIS    | WEB+MOBILE+API                           | (ABRIL/2021)   | 60 horas     | 10x R$351,30  |
        | COMBO DE TESTES FUNCIONAIS    | WEB E MOBILE                             | (ABRIL/2021)   | 30 horas     | ESGOTADO      |
        | COMBO DE TESTES FUNCIONAIS    | REST ASSURED + SOAPUI                    | (ABRIL/2021)   | 30 horas     | 10x R$257,62  |
        | COMBO DE TESTES FUNCIONAIS    | REST ASSURED + KARATE                    | (ABRIL/2021)   | 30 horas     | 10x R$257,62  |
        | COMBO DE TESTES FUNCIONAIS    | POSTMAN + RESTASSURED                    | (ABRIL/2021)   | 30 horas     | 10x R$257,62  |
        | TESTES AUTOMATIZADOS          | AUTOMATIZAÇÃO WEB                        | (JULHO/2021)   | 24 horas     | 10x R$234,20  |
        | TESTES AUTOMATIZADOS          | MOBILE IOS                               | (JULHO/2021)   | 24 horas     | 10x R$292,20  |
        | TESTES AUTOMATIZADOS          | AUTOMATIZAÇÃO WEB                        | (JULHO/2021)   | 30 horas     | 10x R$234,20  |
        | TESTES AUTOMATIZADOS          | MOBILE IOS                               | (JULHO/2021)   | 30 horas     | 10x R$292,75  |
        | TESTES AUTOMATIZADOS          | AUTOMATIZAÇÃO MOBILE ANDROID             | (JULHO/2021)   | 30 horas     | 10x R$292,75  |
        | TESTES AUTOMATIZADOS          | API SOAPUI                               | (JULHO/2021)   | 24 horas     | 10x R$175,65  |
        | TESTES AUTOMATIZADOS          | API SWAGGER                              | (JULHO/2021)   | 24 horas     | 10x R$175,65  |
        | TESTES AUTOMATIZADOS          | API REST ASSURED                         | (JULHO/2021)   | 24 horas     | 10x R$175,65  |
        | TESTES AUTOMATIZADOS          | API POSTMAN                              | (JULHO/2021)   | 18 horas     | 10x R$175,65  |
        | TESTES AUTOMATIZADOS          | AUTOMAÇÃO POSTMAN                        | (JULHO/2021)   | 24 horas     | 10x R$175,65  |
        | TESTES AUTOMATIZADOS          | TESTE AUTOMATIZADO API KARATE            | (JULHO/2021)   | 24 horas     | 10x R$175,65  |
        | TESTES FUNCIONAIS             | METODOLOGIA AGIL + BDD CUCUMBER + GHENKI | (JULHO/2021)   | 10 horas     | 10x R$93,68   |
        | TESTES FUNCIONAIS             | FUNCIONAL MOBILE                         | (JULHO/2021)   | 24 horas     | 10x R$175,65  |
        | TESTES FUNCIONAIS             | FUNCIONAL WEB                            | (JULHO/2021)   | 24 horas     | 10x R$175,65  |
        | TESTES FUNCIONAIS             | API REST ASSURED                         | (JULHO/2021)   | 18 horas     | 10x R$117,10  |
        | TESTES FUNCIONAIS             | WEB + MOBILE                             | (JULHO/2021)   | 30 horas     | 10x R$257,62  |
        | TESTES FUNCIONAIS             | API SWAGGER                              | (JULHO/2021)   | 18 horas     | 10x R$117,10  |
        | TESTES FUNCIONAIS             | API SOAPUI                               | (JULHO/2021)   | 18 horas     | 10x R$117,10  |
        | TESTES FUNCIONAIS             | API POSTMAN                              | (MAIO/2021)    | 18 horas     | ESGOTADO      |
        | TESTES FUNCIONAIS             | FUNCIONAL API KARATE                     | (JULHO/2021)   | 18 horas     | 10x R$117,10  |
        | TESTES FUNCIONAIS             | API POSTMAN                              | (JULHO/2021)   | 18 horas     | 10x R$117,10  |
        | COMBO DE TESTES AUTOMATIZADOS | AUTOMATIZAÇÃO WEB + MOBILE + API         | (JULHO/2021)   | 72 horas     | 10x R$585,50  |
        | COMBO DE TESTES AUTOMATIZADOS | AUTOMATIZAÇÃO WEB + MOBILE               | (JULHO/2021)   | 48 horas     | 10x R$468,40  |
        | COMBO DE TESTES AUTOMATIZADOS | AUTOMATIZAÇÃO WEB + API                  | (JULHO/2021)   | 48 horas     | 10x R$351,30  |
        | COMBO DE TESTES AUTOMATIZADOS | AUTOMATIZAÇÃO WEB + MOBILE + API         | (JULHO/2021)   | 72 horas     | 10x R$,585,50 |
        | COMBO DE TESTES AUTOMATIZADOS | AUTOMATIZAÇÃO WEB + MOBILE               | (JULHO/2021)   | 48 horas     | 10x R$468,40  |
        | COMBO DE TESTES AUTOMATIZADOS | AUTOMATIZAÇÃO WEB + MOBILE + API         | (JULHO/2021)   | 48 horas     | 10x R$351,30  |



