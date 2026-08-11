# 📝 API REST To-Do List com Spring Boot

API RESTful para gerenciamento de tarefas (To-Do List) desenvolvida com **Java 17** e **Spring Boot 3**. O projeto foi construído seguindo boas práticas de desenvolvimento backend (DRY, Bean Validation, Testes de Integração e Documentação com Swagger).

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Data JPA**
* **Bean Validation**
* **H2 Database** (em memória)
* **WebTestClient** (testes de integração)
* **Springdoc OpenAPI / Swagger** (documentação)

## 📌 Funcionalidades & Regras de Negócio

* **Criar tarefa:** Cadastra uma nova tarefa e retorna a lista atualizada.
* **Listar tarefas:** Retorna todas as tarefas registradas ordenadas por **prioridade (descendente)** e **nome (ascendente)**.
* **Atualizar tarefa:** Atualiza os campos de uma tarefa existente.
* **Remover tarefa:** Remove uma tarefa pelo ID.
* **Validação:** Não permite criação/atualização de tarefas sem `nome` ou `descricao`.

## 🛠️ Como Executar a Aplicação

1. Clone o repositório:
2.  A aplicação estará disponível em `http://localhost:8080`.

## 📖 Documentação da API (Swagger UI)

Com a aplicação rodando, acesse a interface interativa do Swagger no navegador:
👉 **`http://localhost:8080/swagger-ui.html`**

## 🧪 Como Executar os Testes Automatizados

Para rodar a suíte de testes de integração:
