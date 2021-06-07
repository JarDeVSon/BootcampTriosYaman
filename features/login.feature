#language: pt
#encoding: UTF-8
#date: 31/05/2021
#author: Jardeson Santos
#version: 1.0
  Funcionalidade: Login no site da Trios de Capacitação

    Como um usuário previamente cadastrado no site da Trios de Capacitação
    Quero entrar na minha conta
    Para que eu possa acessar os cursos disponíveis

    Contexto:
      Dado que possuo uma conta no site da Trios de Capacitação "https://triosdecapacitacao.eadplataforma.com/login/"

    Cenário: Verificar o preenchimento do E-mail
      Quando verifico o preenchimento do E-mail "Email"
      Então o sistema deve retornar "E-mail"

    Cenário: Verificar o preenchimento da Senha
      Quando verifico o preenchimento da Senha "Senha"
      Então o sistema deve retornar "Senha"

    Cenário: Validar o Lembre-me da conta
      Quando valido o Lembre-me "sim"
      Então o sistema deve retornar "sim"

      @acessar @web @mobile @sprint @regressivo
    Cenário: Validar o Acesso a conta no site da Trios.
      Quando preencho as informações com "E-mail" e "Senha"
        E seleciona o "Entrar"
      Entao o sistema deve redirecionar para a página inicial.

    Cenário: Validar o redirecionamento de Esqueceu sua senha
      Quando valido o redirecionamento Esqueceu sua senha? "Esqueceu sua senha?"
      Entao o sistema deve redirecionar para Recuperar Senha "Recuperar Senha"

    Cenário: Validar o redirecionamento de Não consegue se autenticar
      Quando valido o redirecionamento "Não consegue se autenticar?"
      Entao o sistema deve redirecionar para Reenviar Confirmação "Reenviar Confirmação"
