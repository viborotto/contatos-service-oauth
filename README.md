# :closed_lock_with_key: contatos-service-oauth
Aplicação em que contatos são salvos no DB utilizando Spring JPA, e cada contato pertence a um usuário autenticado pelo OAuth(Resource Server)

# **_Enunciado_** :octocat:
Crie um microsserviço que guarde contatos telefônicos dos usuários. Quando o usuário chamar POST /contato, ele deve criar um contato para o usuário logado. Quando o usuário chamar o GET /contatos, ele deve listar todos os contatos deste usuário. Obs: O objetivo principal aqui, é gerir os contatos por usuário, de maneira transparente. 


# ToDo
- [X] Model, DTO Contato e Mapper
- [X] ContatoService e ContatoRepository
- [X] ContatoController
- [X] Principal
- [X] ResourceServerConfig
- [ ] Vincular Usuario com Contatos
