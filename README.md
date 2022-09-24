# Forum

## 📝 Sobre

Spring Boot API REST

## Demonstração

https://andersonfariasdev-forum.herokuapp.com/swagger-ui.html

## 🧪 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- Java 1.8
- Spring Boot 2.5.2
- Spring security
- Testes automatizados com JUnit e Spring Test
- Documentação com Swagger
- Docker
- Deploy em cloud com Heroku


## 🚀 Como executar

Clone o projeto e acesse a pasta do mesmo.

```bash
$ git clone https://github.com/andfarias/forum
```

Para iniciá-lo, siga os passos abaixo:
```bash
$ docker build -t andersonfariasdev-forum .
```

```bash
$ docker run -p 8080:8080 -e FORUM_DATABASE_URL='jdbc:h2:mem:alura-forum' -e FORUM_DATABASE_USERNAME='sa' -e FORUM_DATABASE_PASSWORD='' -e FORUM_JWT_SECRET='123456' andersonfariasdev-forum
```

A API estará disponível no seu browser pelo endereço http://localhost:8080

---

Feito com 🤍 by Anderson Farias.
