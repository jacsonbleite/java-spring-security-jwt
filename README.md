# Java Spring Security com Token JWT

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%23316192.svg?style=for-the-badge&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

Nesse projeto foi criado rota de autenticação via token JWT. 

Para testar a aplicação insira as informações no arquivo `application.properties`

Após isso, inicie o projeto. A Classe `AdminUserConfig` criará um usuário padrão para que possa ser realizado o teste
*usuário*: admin
*senha*: 123456

Para testar o login e receber o token, o que confirma que a autenticação foi realizada, pode ser fito o teste:
`localhost:8080/login`
envinado os dados de login, no formato JSON
`{"username":"admin","senha":"123456"}`