# API REST – Controle de Ponto e Acesso

Este projeto consiste no desenvolvimento de uma **API REST** para **controle de ponto e acesso dos usuários de uma empresa**, conforme proposto no desafio.

A aplicação foi desenvolvida em **Java**, utilizando o framework **Spring Boot**, com **Hibernate Envers** para auditoria das entidades, **Lombok** para redução de código boilerplate e **Swagger** para documentação completa da API.

---

## Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate Envers
* Lombok
* Swagger (OpenAPI)
* Banco de dados H2 (em memória)

---

## Objetivo do Sistema

Permitir o gerenciamento de usuários e o registro de pontos (horários), possibilitando:

* Cadastro e listagem de usuários
* Registro de horários de ponto
* Auditoria de alterações nas entidades
* Documentação interativa dos endpoints REST

---

## Funcionalidades

### Usuários

* Criar usuário
* Listar usuários

### Controle de Ponto

* Registrar ponto (data e hora automática)
* Listar registros de ponto

### Auditoria

Todas as entidades são auditadas utilizando **Hibernate Envers**, permitindo rastrear alterações ao longo do tempo.

---

## Documentação da API

A documentação da API é gerada automaticamente com **Swagger** e pode ser acessada após a execução da aplicação:

```
http://localhost:8080/swagger-ui.html
```

---

## Como Executar o Projeto

1. Clone ou extraia o projeto
2. Abra em uma IDE Java (IntelliJ, Eclipse ou VS Code)
3. Aguarde o download das dependências Maven
4. Execute a classe `ControlePontoApplication`
5. Acesse o Swagger para testar os endpoints

---

## Considerações Finais

Este projeto atende integralmente aos requisitos do desafio, utilizando as tecnologias propostas e aplicando boas práticas no desenvolvimento de uma API REST simples e funcional para controle de ponto e acesso de usuários.
