# 🏭 Teste Prático de Programação

Este projeto foi desenvolvido como parte de um teste prático de programação, implementando funcionalidades para manipulação de uma lista de funcionários em Java.  

## 📌 Requisitos  

- Java 17+  
- IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.)  

## 🚀 Funcionalidades Implementadas  

1️⃣ **Cadastro de funcionários** com nome, data de nascimento, salário e função.  
2️⃣ **Remoção de um funcionário específico** da lista.  
3️⃣ **Exibição formatada** da lista de funcionários.  
4️⃣ **Ajuste de salários** com aumento de 10%.  
5️⃣ **Agrupamento de funcionários por função**.  
6️⃣ **Filtragem de funcionários por mês de aniversário** (outubro e dezembro).  
7️⃣ **Identificação do funcionário mais velho** e cálculo da idade.  
8️⃣ **Ordenação da lista por nome (ordem alfabética)**.  
9️⃣ **Cálculo do total de salários pagos pela empresa**.  
🔟 **Cálculo da quantidade de salários mínimos que cada funcionário recebe**.  

## 🛠️ Como Executar  

1️⃣ Clone o repositório:  
```bash
git clone https://github.com/renanmello/desafioinflex
```
2️⃣ Navegue até a pasta do projeto:
```bash
cd desafioiniflex
```

3️⃣ Compile e execute o programa:
```bash
javac src/Main.java  
java src.Main
```
Ou, se estiver utilizando uma IDE, basta rodar a classe Main.

📂 Estrutura do Projeto
* 📂src 
    * 📂┣  Pessoa.java
    * 📂┣  Funcionario.java
    * 📂┣  Main.java

 
Pessoa.java → Classe base representando uma pessoa.
Funcionario.java → Extende Pessoa, adicionando atributos específicos de funcionários.
Main.java → Contém a lógica principal do programa e execução dos requisitos.

📜 Exemplo de Saída
```bash
📌 Lista de funcionários cadastrados:
Nome: Ana - Nascimento: 15/03/1990 - Função: Gerente - Salário: 5.000,00  

📌 Total de salários pagos: R$ 25.000,00  
📌 Maria recebe 3.30 salários mínimos.  
```

📌 Observações

Este projeto foi desenvolvido para avaliação técnica, seguindo boas práticas de programação e organização de código.
