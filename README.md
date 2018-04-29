# O PROJETO
Criar uma aplicação para Gerenciamento de chamados de Help-Desk, com intuído de colocar em pratica todo contudo aprendido na disciplina Engenharia de Software.

## Atividade de Requisitos​

Funcionais:​
- O administrador terá a opção de cadastrar de usuários e analistas de suporte;​
- O administrador terá a opção de cadastrar os módulos para suporte;​
- O usuário poderá abrir um chamado;​
- O analista de suporte terá acesso ao chamado para atende-lo e altera-lo;​
- Os usuários poderão pesquisar um determinado chamado e ter acesso aos chamados aberto por eles;​
- O analista de suporte poderá acessar sua fila de chamados, onde terá a opção de filtrar por status;​
- O sistema irá enviar um e-mail ao usuário que abriu o chamado quando o mesmo tiver seu status alterado;​

Não-funcionais:​

- Separação de Interesses (Separation of Concerns - SoC): separar corretamente lógica, interação com o usuário e comportamentos na aplicação.​
- Utilizar a Arquitetura de Software  MVC (Model-View-Controller)​
- Utilizar orientação a objeto​
- Usabilidade: desenvolver o sistema para a plataforma web. O mesmo deverá ser responsivo, ou seja, ser acessado de qualquer dispositivo, tanto computador, quanto de dispositivos móveis.​
- Utilizar o framework Bootstrap para a criação da interface responsiva
- Desempenho: melhorar a performance da aplicação, por exemplo.​
- Utilizar banco de dados NoSQL (MongoDB)​
- Minificar os códigos fonte ao subir o sistema para o servidor​
- Segurança: garantir que apenas os usuários habilitados acessarão a aplicação e que os dados serão transmitidos de forma segura, por exemplo.​ Por exemplo, ver https://github.com/pac4j/spark-pac4j​
- Expirar a sessão após 20 minutos de inatividade​
- Separação de Interesses: definir uma arquitetura de aplicação com modelo MVC (separando assim lógica de negócios, comportamentos e interação com usuário);​
- Usabilidade: criar uma interface de simples acesso e uso às funções do sistema e funcional para diversos navegadores.​

## Atividade de Projeto  (princípios norteadores)​

Projeto de Interação com o Usuário​

- Visibilidade do status do sistema (1): ​
Quando o chamado for aberto/alterado, será enviado um e-mail para os usuários envolvidos informando da alteração do chamado.​
Na página inicial do sistema, serão listados os últimos chamados abertos e seus status.​

- Prevenção de erros (5): ​
Mostrar valores fixos para o status na abertura/alteração do chamado. Ex: Novo, Aguardando atendimento, Em atendimento, Resolvido, Fechado.​
No campo de Módulo do chamado, trazer uma lista com todos os módulos cadastrados para que o usuário não inclua um valor inexistente.​
Deixar claro para o usuário quais são os campos obrigatórios no sistema, colocando um * na frente dos mesmos.​

- Reconhecimento ao invés de lembrança (6): ​
Ao buscar o chamado por usuário responsável, mostrar sugestões de nomes conforme o usuário digita.​
Design minimalista (8): ​
Mostrar na tela somente os campos relevantes para preenchimento.​
Colocar a cor do botão referente a ação. Ex: botão verde para salvar e vermelho para cancelar.​
Criar um menu que também possua ícones referentes à opção. Ex: ícone de um boneco na frente da opção "Usuários".​

- Ajuda e documentação (10):​
Quando o usuário estiver entrando no sistema pela primeira vez, exibir uma opção para que seja exibido um tutorial de como utilizar o sistema.​
Criar uma página de auxilio em como utilizar o sistema.
