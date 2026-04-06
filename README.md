# Controle de Entrega

## Link do Repositório

<https://github.com/Querley/controle-entrega-java>

## Descrição

Sistema simples em Java para controle de entrega de mercadorias.

## Funcionalidades

- Login com senha fixa (12345678)
- Cadastro de mercadoria (nome, preço, quantidade, código, descrição)
- Cadastro de endereço (logradouro, complemento, número, CEP, cidade, estado)
- Vínculo 1 para 1 entre mercadoria e endereço

## Como executar

Compilar:
javac src/*.java

Executar:
java -cp src Main

## Fluxo utilizado

O repositório foi iniciado pela branch **main**, onde foi feito apenas o commit inicial com o README.

Depois disso, foi criada a branch **release-dev**, onde todo o desenvolvimento do sistema foi realizado.

Durante o desenvolvimento, foram feitos múltiplos commits com as implementações do sistema (login, classes, cadastro e menu).

Após a finalização, foi feito o merge da branch **release-dev** para a **main**, utilizando o fluxo padrão de integração.

## Observação

Projeto desenvolvido para fins acadêmicos.
