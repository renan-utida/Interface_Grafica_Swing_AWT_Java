# 📝 Formulário de Contato - Java Swing

## 📖 Descrição
Este projeto implementa uma interface gráfica de formulário de contato utilizando **Java Swing** e **AWT**. O formulário foi desenvolvido como parte do desafio da disciplina de **Domain Driven Design (DDD)** e demonstra conceitos fundamentais de criação de GUIs em Java.

## 🎯 Objetivo
Criar uma aplicação desktop que permita ao usuário inserir informações de contato através de uma interface gráfica amigável, aplicando conceitos de programação orientada a objetos e refatoração de código.

## 🛠️ Tecnologias Utilizadas
- **Java SE**
- **Javax.Swing** - Para componentes de interface gráfica
- **Java.awt** - Para layout e eventos
- **IDE**: Qualquer IDE Java (IntelliJ IDEA, Eclipse, VS Code, etc.)

## 📋 Funcionalidades

### Componentes da Interface:
- **JFrame**: Janela principal da aplicação
- **JTextField**: Campo para inserção do nome
- **JTextArea**: Área para comentários extensos
- **JCheckBox**: Opção de interesse em AWS
- **JRadioButton**: Escolha única (Sim/Não) para receber novidades
- **JButton**: Botão de envio do formulário

### Funcionalidades Implementadas:
- ✅ Captura de dados do formulário
- ✅ Validação básica de entrada
- ✅ Feedback visual no botão (hover effect)
- ✅ Exibição dos dados no console
- ✅ Interface responsiva e centralizada

## 🏗️ Arquitetura do Código

### Refatoração Aplicada:
O código foi **refatorado** seguindo princípios de **código limpo** e **programação orientada a objetos**:

```
Main.java
├── inicializarAplicacao()     # Método principal que orquestra a criação
├── criarFrame()              # Configuração da janela principal
├── criarPainel()             # Configuração do container
├── criarComponentes()        # Criação dos elementos da interface
├── criarRadioButtons()       # Configuração específica dos radio buttons
├── adicionarComponentesAoPainel() # Organização dos componentes
├── configurarEventos()       # Configuração de todos os listeners
├── configurarActionListener() # Ação do botão enviar
├── configurarMouseListener()  # Efeito hover do botão
└── finalizarConfiguracao()   # Exibição da janela
```

### Padrões Aplicados:
- **Separação de Responsabilidades**: Cada método tem uma função específica
- **Encapsulamento**: Atributos privados com métodos específicos
- **Organização**: Código estruturado e fácil de manter

## 🚀 Como Executar

### Pré-requisitos:
- Java JDK 8 ou superior instalado
- IDE Java ou terminal configurado

### Passos:
1. Clone ou baixe o arquivo `Main.java`
2. Compile o código:
   ```bash
   javac Main.java
   ```
3. Execute a aplicação:
   ```bash
   java Main
   ```

## 🖥️ Interface do Usuário

### Layout:
- **Título**: 📝 Formulário de Contato
- **Campo Nome**: Entrada de texto simples
- **Campo Comentário**: Área de texto multilinha
- **Checkbox AWS**: ☁️ Tem interesse em AWS?
- **Radio Buttons**: ✅ Sim / ❌ Não (para receber novidades)
- **Botão Enviar**: 📤 Com efeito hover 🚀

### Características Visuais:
- Janela centralizada na tela
- Tamanho: 450x500 pixels
- Layout: FlowLayout para simplicidade
- Emojis para melhor experiência visual

## 📊 Eventos Implementados

### ActionListener:
```java
// Captura e exibe os dados inseridos
enviarButton.addActionListener(e -> {
    String nome = nomeField.getText();
    String comentario = comentarioArea.getText();
    System.out.println("Nome: " + nome + ", Comentário: " + comentario);
});
```

### MouseListener:
```java
// Efeito hover no botão
mouseEntered() -> "🚀 Clique para Enviar"
mouseExited()  -> "📤 ENVIAR FORMULÁRIO"
```

## 🎓 Conceitos Aplicados

### Swing Components:
- **JFrame**: Container principal
- **JPanel**: Container intermediário
- **JLabel**: Rótulos de texto
- **JTextField/JTextArea**: Entrada de dados
- **JCheckBox/JRadioButton**: Seleções
- **JButton**: Ações

### Event Handling:
- **ActionListener**: Cliques em botões
- **MouseListener**: Movimentos do mouse
- **Lambda Expressions**: Sintaxe moderna Java

### Layout Management:
- **FlowLayout**: Organização sequencial dos componentes

## 🔄 Melhorias Futuras
- [ ] Validação de campos obrigatórios
- [ ] Persistência de dados em arquivo
- [ ] Layout mais avançado (GridBagLayout)
- [ ] Customização visual (cores, bordas, fontes)
- [ ] Internacionalização (i18n)
- [ ] Testes unitários

## 👨‍💻 Desenvolvedor
**Estudante**: Renan Dias Utida - RM 558540
**Disciplina**: Domain Driven Design - Java  
**Professor**: Salatiel Marinho  
**Instituição**: FIAP

## 📄 Licença
Este projeto foi desenvolvido para fins educacionais como parte do desafio da disciplina de DDD.

