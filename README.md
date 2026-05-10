# 👔 Sistema de Cadastro de Funcionários

Sistema em Java para gerenciar funcionários de uma empresa. Inclui autenticação de usuário (criação de conta e login) e operações completas de CRUD (cadastrar, consultar, listar e remover funcionários). Desenvolvido para praticar **Programação Orientada a Objetos (POO)**, **ArrayList** e **estruturas de controle**.

## 🚀 Funcionalidades

- ✅ Criação de conta única (usuário e senha)
- ✅ Login com validação de credenciais
- ✅ Cadastrar funcionário (nome, setor, tarefa, idade, salário)
- ✅ Consultar funcionário por nome (ignora maiúsculas/minúsculas)
- ✅ Listar todos os funcionários cadastrados
- ✅ Remover funcionário por nome
- ✅ Menu interativo com `do-while` e `switch-case`
- ✅ Validação de estado (`conta_criada`, `login`) em todas as ações

## 🛠️ Tecnologias utilizadas

- Java (JDK 11 ou superior)
- `ArrayList` para armazenamento em memória
- Eclipse IDE (compatível com qualquer IDE Java)
- Git e GitHub para versionamento

## 📂 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/GugaXLTI/sistema-funcionarios-java.git
2. Abra o projeto em sua IDE Java favorita.
3. Compile e execute a classe Main.java.
4. Siga as instruções do menu para criar conta, fazer login e gerenciar funcionários.

## Exemplo de uso das telas

Escolha uma das opções abaixo:

[1] - CRIAR CONTA.
[2] - LOGIN.
[3] - CADASTRAR FUNCIONÁRIO.
[4] - CONSULTAR FUNCIONÁRIO.
[5] - LISTAR FUNCIONÁRIOS
[6] - REMOVER FUNCIONÁRIO.
[7] - SAIR

## Criar conta

Crie seu usuário: 
admin
Crie sua senha: 
1234

Conta criada com sucesso!

### LOGIN ###

Digite seu usuário: 
admin
Digite sua senha: 
1234

Login realizado com sucesso!

### CADASTRAR FUNCIONÁRIO ###

Nome: 
Gustavo Piteira
Setor: 
TI
Tarefa: 
Desenvolvedor Java
Idade: 
28
Salário: 
4500.00

Funcionário cadastrado!

Digite o nome do funcionário: 
Gustavo Piteira

Funcionário encontrado!

Nome: Gustavo Piteira
Setor: Testes de Software
Tarefa: Desenvolvedor Java
Idade: 19
Salário: 4500.0

### LISTAR FUNCIONÁRIO ###

Nome: Gustavo Piteira
Setor: TI
Tarefa: Desenvolvedor Java
Idade: 28
Salário 4500.00

Digite o nome do funcionário: 
Gustavo Piteira
Funcionário removido com sucesso!

## Status do projeto

✅ Concluído – versão estável para estudos e demonstração.

## 🔄 Próximos passos (melhorias sugeridas)

. Encapsular a classe Funcionario (atributos private, getters/setters)
. Adicionar construtor na classe Funcionario
. Limitar número de tentativas de login (ex: 3 tentativas)
. Validar entradas (idade positiva, salário mínimo)
. Persistência em arquivo (salvar os dados ao sair do programa)
. Permitir múltiplas contas de usuário

## 👨‍💻 Autor

Gustavo Piteira
GitHub
