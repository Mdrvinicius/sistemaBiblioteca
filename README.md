Sistema de Biblioteca (Java POO)
Integrantes

César Vinicius
Célio 

Descrição

Sistema simples de biblioteca feito em Java.
Permite cadastrar pessoas, livros, exemplares, registrar empréstimos e listar todas as informações.
Os dados são salvos automaticamente em arquivo .txt por serialização.

Como Executar

Abra o projeto na IDE (IntelliJ/Eclipse).
Rode a classe Main.java.
O sistema carrega os dados do arquivo biblioteca_dados.txt (se existir).
Caso contrário, cria um novo sistema.

 Conceitos Implementados

Construtores, getters/setters e encapsulamento
Herança: Pessoa (abstract) → Cliente, Administrador, Bibliotecário, Fornecedor
Polimorfismo com ArrayList<Pessoa>
Relacionamentos 1:N (Livro → Exemplar)
Relacionamentos N:N (Pessoa ↔ Empréstimo ↔ Exemplar)
Serialização para .txt (SalvarDados / CarregarDados)
Exceptions e try/catch (CPF inválido, exemplar indisponível)
Estruturas: if/else, switch, loops

Dados Iniciais (6 meses)

A classe DadosSeisMeses.java gera:
3 pessoas
3 livros
6 exemplares
Empréstimos distribuídos entre janeiro e junho

Arquivo gerado: biblioteca_dados.txt
