# 🎬 ScreenMatch 2.0

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![REST API](https://img.shields.io/badge/API-REST-blue?style=for-the-badge)

## 📖 Sobre o projeto

O **ScreenMatch 2.0** é uma aplicação backend desenvolvida em **Java** com **Spring Boot** que permite pesquisar filmes e séries utilizando a **API OMDb**.

A aplicação realiza consultas em tempo real e retorna informações detalhadas sobre os títulos pesquisados, como nome, avaliação, ano de lançamento e outras informações disponibilizadas pela API.

O objetivo do projeto foi praticar conceitos de desenvolvimento backend, consumo de APIs REST, organização em camadas e manipulação de dados em Java.

---

## ✨ Funcionalidades

- 🔍 Buscar filmes pelo título
- 📺 Buscar séries
- ⭐ Consultar avaliações
- 📅 Visualizar ano de lançamento
- 🎬 Exibir informações detalhadas dos títulos
- 🌐 Consumo da API OMDb
- 📦 Retorno dos dados em formato JSON

---

## 🛠 Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- Spring Web
- Jackson
- API REST
- OMDb API

---

## 🏗 Arquitetura

O projeto segue uma arquitetura em camadas para manter o código organizado e de fácil manutenção.

```
src
├── controller
├── service
├── model
├── dto
├── repository
└── config
```

---

## 🚀 Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- Maven

### Clone o repositório

```bash
git clone https://github.com/mamoto22/ScreenMatch2.0.git
```

### Entre na pasta

```bash
cd ScreenMatch2.0
```

### Execute a aplicação

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

---

## 🔗 API utilizada

Este projeto consome a API pública **OMDb (Open Movie Database)** para obter informações sobre filmes e séries.

É necessário gerar uma chave de acesso gratuita para utilizar a API.

Site oficial:

https://www.omdbapi.com/

---

## 📷 Exemplo de funcionamento

**Pesquisa**

```
Harry Potter
```

**Resposta**

```
Título: Harry Potter and the Sorcerer's Stone

Ano: 2001

Avaliação: 7.6

Gênero: Fantasy

Duração: 152 min
```

---

## 📚 Objetivos do projeto

Durante o desenvolvimento foram aplicados conceitos como:

- Programação Orientada a Objetos (POO)
- Consumo de APIs REST
- Desserialização de JSON
- Organização em camadas
- Boas práticas em Java
- Utilização do Spring Boot
- Manipulação de requisições HTTP

---

## 🚀 Melhorias futuras

- Sistema de autenticação
- Histórico de pesquisas
- Favoritos
- Cache das consultas
- Banco de dados
- Testes automatizados
- Docker
- Documentação com Swagger

---

## 👨‍💻 Autor

**Jonathan Gomes do Nascimento**

- GitHub: https://github.com/mamoto22
- LinkedIn: https://www.linkedin.com/in/jonathannasciment0/
