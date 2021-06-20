# poo-2021-1

Este repositório foi criado para auxiliar estudantes a trabalhar com hospedagem de código fonte e controle de versão usando git.
Antes de qualquer coisa, você deve criar uma conta no github e instalar o git na sua máquina.

Instalação do Git:
[Clique aqui para ver o passo-a-passo de instalação](https://docs.github.com/pt/desktop/installing-and-configuring-github-desktop/installing-and-authenticating-to-github-desktop/installing-github-desktop)

Gerar chave SSH e conectar no github:

[Clique aqui para ver o passo-a-passo](https://docs.github.com/pt/github/authenticating-to-github/connecting-to-github-with-ssh)

Depois de tudo certo, vamos aos próximos passos.

Primeiros passos:

Passo 1: Fazer um fork deste repositório (poo-2021-1) - [Na dúvida, clique aqui](https://github.com/UNIVALI-LITE/Portugol-Studio/wiki/Fazendo-um-Fork-do-repositório)

Passo 2: Fazer um clone do repositório que você acabou de fazer o fork - [Na dúvida, clique aqui](https://docs.github.com/pt/github/creating-cloning-and-archiving-repositories/cloning-a-repository-from-github/cloning-a-repository?query=fork+github)

Passo 3: Criar uma branch dentro do repositório para trabalhar nela
Abra o git bash (botão direito > git bash here) na pasta que está o repositório e digite os comandos a seguir:

> git checkout -b <coloque aqui seu nome>

Passo 4: criar uma pasta com nome-sobrenome (exemplo: cleon-xavier-pereira-junior) dentro do projeto, 

Passo 5: criar uma classe (Hello.java) dentro da pasta que você acabou de criar

Passo 6 - adicionar as alterações que você realizou para posteriormente permitir commit
> git add .

Passo 6: realizar um commit
> git commit -m "meu primeiro commit"

Passo 7: fazer push para o repositório
> git push origin <coloque aqui o nome da branch que você criou>

Passo 8: criar uma pull request: [Na dúvida, clique aqui](https://docs.github.com/pt/github/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)