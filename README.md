# FamilyPay

## Sobre o projeto

O **FamilyPay** é um projeto desenvolvido em Java que simula um sistema de autorização de compras para famílias.

A ideia principal é permitir que um filho realize uma solicitação de compra e que o responsável possa analisar essa solicitação e decidir se ela será **aprovada ou rejeitada**.

O projeto começou como uma aplicação simples para praticar conceitos de Java e Programação Orientada a Objetos. A proposta é evoluí-lo gradualmente até se tornar uma aplicação completa, com banco de dados, API REST e interface própria.

---

## Funcionalidades atuais

Atualmente, o FamilyPay possui:

* Cadastro de filho com nome e número da conta;
* Cadastro de responsável;
* Solicitação de compras;
* Validação do valor solicitado;
* Controle do status da solicitação;
* Aprovação de compras pelo responsável;
* Rejeição de compras pelo responsável;
* Bloqueio de alterações em solicitações que já foram aprovadas ou rejeitadas.

### Status das compras

Uma solicitação pode possuir três estados:

```text
PENDENTE
APROVADA
REJEITADA
```

O fluxo atual funciona da seguinte forma:

```text
Filho
  │
  └── Solicita uma compra
          │
          ▼
       PENDENTE
        /     \
       /       \
      ▼         ▼
APROVADA    REJEITADA
```

---

## Próximas atualizações

O projeto será desenvolvido gradualmente, adicionando novas funcionalidades e tecnologias.

### Banco de dados

A primeira grande evolução será deixar de armazenar os dados apenas em memória.

Pretendo implementar:

* Persistência dos filhos e responsáveis;
* Armazenamento das solicitações de compra;
* Histórico de compras;
* Consultas e atualização dos dados;
* Modelagem do banco de dados.

### API REST

Depois, o sistema será transformado em uma aplicação com uma API REST utilizando **Spring Boot**.

A API deverá permitir:

* Cadastro de usuários;
* Criação de solicitações de compra;
* Consulta de solicitações;
* Aprovação e rejeição de compras;
* Consulta do histórico;
* Comunicação entre a aplicação e o banco de dados.

### Interface

Após a implementação da API, será desenvolvida uma interface para permitir que o sistema seja utilizado de forma visual.

A interface deverá possuir:

* Tela de login;
* Área do filho;
* Área do responsável;
* Tela para solicitar compras;
* Tela para aprovação ou rejeição;
* Histórico de solicitações;
* Comunicação com a API REST.

### Funcionalidades avançadas

Em etapas posteriores, poderão ser adicionados:

* Sistema de autenticação e autorização;
* Notificações para o responsável;
* Limites de gastos;
* Histórico detalhado de transações;
* Melhorias de segurança;
* Testes automatizados;
* Deploy da aplicação.

---

## Tecnologias

### Atualmente

* Java
* Programação Orientada a Objetos
* Git
* GitHub

### Planejadas

* Spring Boot
* API REST
* Banco de dados SQL
* Front-end
* Testes automatizados
* Deploy

---

## Estrutura atual

```text
FamilyPay/
├── src/
│   ├── Filho.java
│   ├── Main.java
│   ├── Responsavel.java
│   └── StatusCompra.java
│
├── .gitignore
└── README.md
```

---

## Objetivo

O FamilyPay é um projeto de aprendizado contínuo. A cada versão, novas tecnologias e conceitos serão incorporados ao sistema, acompanhando minha evolução no desenvolvimento de software.
