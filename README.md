# Java_Loja_de_Informatica
Projeto de java, 2º sem 2017, prof.º Hamilton

# Descrição dos requisitos do projeto:


Comandos básicos do git:

Configuração inicial para ser feita no GitBash.
``` bash
$ git config --global user.name "nomeUser"

$ git config --global user.email  "seuEmail"
```
Iniciar o Git em um repositório (rastrear).
```bash
$ git init
```

Verificar o status do rastreio:
```bash
$ git status
```
Git add (adicionar para "staging area").
```bash
$ git add . #adicionar todos
$ git add *.java | *.doc | *.png #adicionar todos com uma extensão
$ git add nome_do_arquivo
```
Confirmar transferência da staging para o repositório local.
```bash
$ git commit -m "Base inicial de arquivos"
```

Pular etapa de add e fazer o commit direto:
```bash
$ git commit -a -m "mensagem de commit"
```

Enviar para o repositório compartilhado:
```bash
$ git push origin master
```

Atualizar repositório local quando for alterado ao mesmo tempo
```bash
$ git pull origin master #Efetua "merge" automático
```

# Links úteis:

## Playlist de referência sobre GIT Youtube canal rbtech. [1 - 8]
* [1º Assunto](https://www.youtube.com/watch?v=WVLhm1AMeYE&list=PLInBAd9OZCzzHBJjLFZzRl6DgUmOeG3H0&index=1)
* [Tutorial inicial do próprio github:](https://guides.github.com/activities/hello-world/)
* [Mais um guia de referência Git:](http://rogerdudler.github.io/git-guide/index.pt_BR.html)
* [Download do GIT](git-scm.com) - Git --distributed-is-the-new-centralized
