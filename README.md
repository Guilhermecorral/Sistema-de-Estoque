# Sistema de Estoque em Java

<h1 align="center">📦 Sistema de Controle de Estoque (Console)</h1>

Projeto prático para treinar **Programação Orientada a Objetos** em Java. Um gerenciador de estoque simples via terminal, com foco em encapsulamento, separação de responsabilidades e código organizado.

## ✨ Funcionalidades
- Cadastro de novos produtos (com ID automático)
- Listagem de todos os produtos
- Atualização de estoque (entrada e saída de quantidades)
- Busca de produto por ID
- Validações básicas (quantidade positiva, campos obrigatórios)

## 🏗️ Estrutura do Projeto
- `Principal`: Interface com o usuário (menu e interações)
- `Stock`: Gerencia a coleção de produtos (`ArrayList<Produto>`)
- `Produto`: Entidade com atributos (ID, nome, preço, quantidade) + regras de negócio

## 🛠️ Conceitos Praticados
- Encapsulamento (getters/setters, atributos private)
- Separação de responsabilidades (MVC-like: Controller → Service → Model)
- Coleções: `ArrayList`
- Estruturas de repetição e `switch-case`
- Validação de dados
- Geração automática de IDs

## 🚀 Tecnologias
<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="40" alt="Java" />
</p>

## ⚡ Como Executar
1. Clone o repositório
   ```bash
   git clone https://github.com/Guilhermecorral/Sistema-de-Estoque.git
   cd Sistema-de-Estoque
Abra no IntelliJ e execute a classe Principal
OU via terminal:
javac src/*.java
java -cp src Principal  # ajuste se o pacote for diferente
