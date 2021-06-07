#language: pt
#encoding: UTF-8
#date: 31/05/2021
#author: Jardeson Santos
#version: 1.0
  Funcionalidade: Planos no site da Trios de Capacitação
    Como um usuário no site da Trios de Capacitação
    Quero realizar a assinatura
    Para que eu possa adquirir os planos ofertados.

  Contexto:
    Dado que estou no site da Trios de Capacitação "https://triosdecapacitacao.eadplataforma.com/planos/"

    Esquema do Cenário: Validar os tipos de Planos
      Quando valido as informações de <Plano>
      Então eu tenho as informações de <Plano> disponiveis.

      Exemplos:
        | Plano                                          |
        | PLANO TESTES FUNCIONAIS WEB E MOBILE           |
        | PLANO TESTES AUTOMATIZADOS WEB                 |
        | PLANO TESTES FUNCIONAIS WEB SERVE-API(POSTMAN) |
        | PLANO TESTES AUTOMATIZADOS MOBILE ANDROID      |
        | PLANO TESTES AUTOMATIZADOS MOBILE IOS          |
        | PLANO TESTES AUTOMATIZADOS DE API SOAPUI       |
        | PLANO TESTES AUTOMATIZADOS DE API SWAGGER      |
        | PLANO TESTES AUTOMATIZADOS DE API REST ASSURED |
        | PLANO TESTES AUTOMATIZADOS DE API POSTMAN      |

    Esquema do Cenário: Validar as assinaturas dos Planos
        Quando valido a assinatura de <Plano>
        Então eu tenho o <Plano> disponibilizado.

        Exemplos:
          | Plano                                          |
          | PLANO TESTES FUNCIONAIS WEB E MOBILE           |
          | PLANO TESTES AUTOMATIZADOS WEB                 |
          | PLANO TESTES FUNCIONAIS WEB SERVE-API(POSTMAN) |
          | PLANO TESTES AUTOMATIZADOS MOBILE ANDROID      |
          | PLANO TESTES AUTOMATIZADOS MOBILE IOS          |
          | PLANO TESTES AUTOMATIZADOS DE API SOAPUI       |
          | PLANO TESTES AUTOMATIZADOS DE API SWAGGER      |
          | PLANO TESTES AUTOMATIZADOS DE API REST ASSURED |
          | PLANO TESTES AUTOMATIZADOS DE API POSTMAN      |
