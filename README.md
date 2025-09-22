Gerenciador de Tarefas - Projeto Java Spring Boot

Requisitos:

- Java JDK 17 ou 21

- IntelliJ IDEA

- Maven (opcional, pode usar o do IntelliJ)

- Git

- Docker Desktop

- GitHub

- Postman (ou outro cliente HTTP)

Rodando localmente:

1. Importe o projeto no IntelliJ pelo pom.xml

2. Abra GerenciadorTarefasApplication.java e clique em Run

3. API rodando em http://localhost:8080/api/tarefas

4. H2 Console em http://localhost:8080/h2-console/login.jsp?jsessionid=29e58ea0ed595e14ddbcfa35d5cc76f0

user:sa senha: "sem senha"

Endpoints:

- GET /api/tarefas

- GET /api/tarefas/{id}

- POST /api/tarefas

- PUT /api/tarefas/{id}

- DELETE /api/tarefas/{id}

Git e GitHub:

- git init, git add ., git commit -m "Primeiro commit"

- git remote add origin <URL_REPO>

- git push -u origin main

CI/CD:

- Pasta .github/workflows/ com arquivo cicd-pipeline.yml

- Jobs: build-and-test, build-and-push-docker, deploy-staging, deploy-production

- Deploy em producao requer aprovacao manual

Docker:

- Dockerfile na raiz do projeto (build Maven, copia jar, expõe porta 8080, entrypoint java -jar)

Testando API:

- Use Postman para adicionar, editar, listar e deletar tarefas

- Banco H2 armazena dados em memoria
