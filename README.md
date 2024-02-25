# LabSchool

O LabSchool é um Mini-projeto desenvolvido como exercício prático, com intuito de aplicar os conhecimentos adquiridos até a sexta semana do Módulo Back-End do Curso FullStack oferecido pelo Lab365 e SESI/SENAI.

## Instruções de Uso

### Funcionamento Geral do Programa

O programa oferece funcionalidades para gerenciar dados de alunos, professores, cursos, turmas e diretores em uma instituição educacional. Ele é interativo e orientado a menus, permitindo que diferentes tipos de usuários acessem e executem operações específicas.

### Menu Principal

O menu principal apresenta opções para escolher o tipo de usuário:
- **1 - Funcionário**
  - Opções relacionadas aos funcionários da instituição.
- **2 - Aluno**
  - Opções específicas para os alunos.
- **0 - Sair**
  - Encerra o programa.

### Menu Funcionário

#### Opção 1 - Login
Permite que um funcionário faça login no sistema.

#### Opção 2 - Cadastro
Permite o cadastro de novos funcionários.

#### Menu Tipo Funcionário
Após selecionar a opção de login ou cadastro, é apresentado um sub-menu para escolher o tipo de funcionário:
- **1 - Diretor**
  - Operações específicas para diretores.
- **2 - Professor**
  - Operações específicas para professores.
- **0 - Voltar Menu Inicial**
  - Retorna ao menu principal.

### Menu Aluno

#### Opção 1 - Login
Permite que um aluno faça login no sistema.

#### Opção 2 - Cadastro
Permite o cadastro de novos alunos.

#### Menu Entrada Aluno
Após selecionar a opção de login ou cadastro, é apresentado um sub-menu para escolher a operação desejada:
- **1 - Listar Cursos**
  - Lista todos os cursos disponíveis.
- **2 - Ativar Matrícula**
  - Ativa a matrícula do aluno.
- **3 - Trancar Matrícula**
  - Tranca a matrícula do aluno.
- **4 - Entrar Turma**
  - Permite ao aluno entrar em uma turma.
- **0 - Voltar Menu Inicial**
  - Retorna ao menu principal.

### Menu Professor

#### Menu Professor
Oferece operações específicas para professores:
- **1 - Adicionar Aluno a Turma**
  - Adiciona um aluno a uma turma.
- **2 - Remover Aluno da Turma**
  - Remove um aluno de uma turma.
- **3 - Listar Alunos**
  - Lista todos os alunos.

### Menu Diretor

#### Menu Diretor
Oferece operações específicas para diretores:
- **1 - Adicionar**
  - Sub-menu para adicionar professores, alunos, cursos, turmas e diretores.
- **2 - Remover**
  - Sub-menu para remover professores, alunos, cursos, turmas e diretores.
- **3 - Listar**
  - Sub-menu para listar professores, diretores, alunos, cursos e turmas.
- **4 - Promover Professor**
  - Promove um professor.
- **0 - Voltar Menu Inicial**
  - Retorna ao menu principal.

### Funcionalidade Padrão
Antes de iniciar o uso do sistema, alguns dados são adicionados automaticamente para fins de demonstração.

Para utilizar as funcionalidades do programa, siga as instruções apresentadas nos menus e sub-menus.
## Requisitos
### [M1S06] Ex 1 - GitFlow
Todo o sistema deve ser criado usando o gitflow:
- `master` → entrega final
- `develop` → junção de código criado pelo grupo
- `feature/` → deve ter o nome da funcionalidade após o '/', deve ter um push para a develop a cada fim do desenvolvimento desta funcionalidade.

### [M1S06] Ex 2 - Classes principais
Criar as classes para entidades principais:
- Aluno - atributos: Nome, idade
- Professor - atributos: Nome, idade, tempo de trabalho
- Curso - atributos: Nome do Curso, Professor do Curso
- Turma - atributos: Lista de alunos, Ano, Curso
  - métodos: listar alunos, adicionar aluno, remover aluno

### [M1S06] Ex 3 - Encapsulamento
Implemente os construtores, defina os modificadores de acesso e utilize encapsulamento e sobrecarga de métodos.

### [M1S06] Ex 4 - Interface e Herança
Crie a interface IFuncionario esse Funcionario deve ter os métodos: promover
Cria a Classe Funcionário e Professor deverá herdar dele.
Também devemos ter a classe Diretor, que irá herdar de Funcionário.
Funcionário - atributos: Nome, Salario
Diretor - atributos: Tempo de cargo

### [M1S06] Ex 5 - Enums
Crie um enum para representar Status de Matrícula e adicione ele como atributo a Aluno.
Valores: ATIVO, TRANCADO, FORMADO
Crie um enum para representar o Cargo do Funcionário. Adicione um campo cargo em Funcionário que receba esse Enum como tipo.
Valores: Iniciante, Experiente, Avançado
Demonstrar o uso de values() e valueOf().

### [M1S06] Ex 6 - Override
Utilize o @‌Override e adicione um toString() personalizado a cada classe descrita anteriormente.

### [M1S06] Ex 7 - Tratamento de erros
Identifique diferentes tipos de erro Runtime
Implemente tratamento de exceções com try, catch, finally.
Utilize throws quando necessário.

### [M1S06] Ex 8 - Listas de Dados
Crie uma classe DadosProfessores, essa classe terá uma lista de professores.
Métodos: adicionar professores, remover professores, buscar professores por id (id é a posição do professor)
Crie uma classe DadosDiretores, essa classe terá uma lista de diretores.
Métodos: adicionar diretores, remover diretores por id, buscar diretores por id (id é a posição do diretor)
Crie uma classe DadosAlunos, essa classe terá uma lista de alunos.
Métodos: adicionar alunos, remover alunos por id, buscar alunos por id (id é a posição do aluno)

### [M1S06] Ex 9 - Fluxo de login
Ao entrar no sistema ele deve perguntar se você é funcionário ou aluno,
Ao selecionar uma opção, você deve se identificar ou criar um novo usuário
O usuário criado deve receber os dados necessários para criar um objeto da classe escolhida (professor, diretor ou aluno)
Adicione esse usuários a lista correspondente
Essa tela também deve dar a opção de Encerrar o programa.
O aluno deve poder selecionar uma turma ao iniciar o programa. Caso não selecione uma turma ele deve ser adicionar pelo diretor a uma turma posteriormente.

### [M1S06] Ex 10 - Fluxo de Ações
Após criação ou seleção o usuário deve ter as seguinte opções:
aluno pode: listar curso, adicionar curso, remover curso, também pode trancar ou ativar sua conta
o professor pode: listar alunos, adicionar aluno, remover aluno da sua turma
o professor pode também mudar um aluno para formado
diretor pode: realizar a promoção de um professor, pode adicionar ou remover um professor aos DadosProfessores e pode remover ou adicionar alunos aos DadosAlunos
o diretor também pode listar todos os professores e todos os alunos, juntos dos ids deles
o diretor deve poder criar uma turma, listar alunos da turma, adicionar alunos e remover alunos da turma
Após selecionar e executar uma ação o programa deve perguntar se o usuário deseja selecionar outra ação ou se deseja sair do sistema. Ao sair ele deve voltar às opções de login.

## Equipe

- **[Arthur Ferreira Borba](https://github.com/ArthurFerreiraBorba)**
  
- **[Felipe Longarai Trisotto](https://github.com/Trisotto)**

- **[Gabriela Almeida Silva](https://github.com/gabiAlmeidaDev)**

- **[Geovani Andrade](https://github.com/G3ovani-Andrade)**

- **[Suene Souza](https://github.com/SueneVS)**