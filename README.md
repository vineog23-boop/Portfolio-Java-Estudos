# ☕ Minha Jornada em Java

Este repositório reúne minha evolução no estudo da linguagem Java e Orientação a Objetos, desenvolvido durante o curso de Análise e Desenvolvimento de Sistemas (ADS).

## 📂 Estrutura do Repositório

O projeto está dividido em níveis de aprendizado:

### 1. 🟢 TreinoJavaIniciante
Coleção de 10 exercícios práticos focados na sintaxe fundamental do Java.
- **Entrada e Saída:** Manipulação da classe `Scanner` e formatação com `printf`.
- **Estruturas Condicionais:** Uso de `if/else`, `switch case` e operador ternário.
- **Laços de Repetição:** Estruturas `while` e `for`.
- **Arrays:** Introdução a vetores e manipulação de listas básicas.

### 2. 🟡 TreinoJavaIntermediario
Transição para o paradigma de **Orientação a Objetos**.
- **Classes e Objetos:** Criação da classe `Carros` representando uma entidade do mundo real.
- **Atributos e Métodos:** Definição de estados e comportamentos com e sem retorno (`void` vs `return`).
- **Instanciação:** Manipulação de múltiplos objetos na memória.

### 3. 🧙‍♂️ HarryPotterPoo (Projeto Avançado)
Sistema complexo que simula o universo de Hogwarts, focado em **Herança, Polimorfismo e Abstração**.

- **Hierarquia de Classes:**
  - `Pessoa` (Superclasse): Define atributos comuns a todos os personagens (trouxas ou bruxos).
  - `Bruxo` (Classe Abstrata): Herda de Pessoa e adiciona atributos mágicos (varinha, casa). Não pode ser instanciada diretamente.
  - `Estudante` e `Professor` (Subclasses): Especializações que herdam toda a estrutura anterior.

- **Interfaces e Polimorfismo:**
  - `FeiticoPrincipal` (Interface): Contrato que obriga as classes a implementarem o método `lancarFeitico()`.
  - **Comportamento Polimórfico:** O método `lancarFeitico()` reage diferente dependendo do objeto (Estudantes lançam *"Expelliarmus"*, enquanto Magos das trevas lançam *"Sectumsempra"*).

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java (JDK)
- **IDE:** IntelliJ IDEA
- **Controle de Versão:** Git & GitHub

---
*Desenvolvido por [Seu Nome]*
