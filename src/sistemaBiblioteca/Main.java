package sistemaBiblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        SistemaBiblioteca sistema = CarregarDados.carregar();
        Scanner input = new Scanner(System.in);
        int opcao = -1;


        while (opcao != 0){

            System.out.println("     -MENU-     ");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Adicionar Exemplar");
            System.out.println("4. Registrar Emprestimo");
            System.out.println("5. Listar Pessoas");
            System.out.println("6. Listar Livros");
            System.out.println("7. Listar Exemplares");
            System.out.println("8. Listar Emprestimos");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(input.nextLine());
            } catch (Exception e){
                System.out.println("Apenas números!");
                continue;
            }
            switch (opcao){
                case 1:
                    System.out.println("---- Cadastro de Cliente ----");

                    System.out.println("Nome: ");
                    String nome = input.nextLine();

                    System.out.println("CPF:  ");
                    String cpf = input.nextLine();

                    Cliente c = new Cliente(nome, cpf);
                    sistema.cadastrarPessoa(c);
                    break;

                case 2:
                    System.out.println("---- Cadastro Livro ----");

                    System.out.println("Titulo: ");
                    String titulo = input.nextLine();

                    System.out.println("Autor: ");
                    String autor = input.nextLine();

                    System.out.println("Ano: ");
                    int ano = Integer.parseInt(input.nextLine());

                    Livro livro = new Livro(titulo, autor, ano);
                    sistema.cadastrarLivro(livro);
                    break;

                case 3:
                    System.out.println("---- Adicionar Exemplar ----");

                    System.out.println("Digite o título do livro: ");
                    String tituloBusca = input.nextLine();

                    Livro livroEncontrado = sistema.buscarLivroPorTitulo(tituloBusca);

                    if(livroEncontrado == null){
                        System.out.println("Livro não encontrado!");
                        break;
                    }

                    int novoIdExemplar = sistema.getExemplares().size() + 1;

                    Exemplar ex = new Exemplar(novoIdExemplar, livroEncontrado);
                    sistema.cadastrarExemplar(ex);
                    break;

                case 4:
                    System.out.println("----Registrar Empréstimo----");

                    System.out.print("Nome da pessoa: ");
                    String nomePessoa = input.nextLine();

                    Pessoa pessoa = sistema.buscarPessoaPorNome(nomePessoa);

                    if(pessoa == null){
                        System.out.println("Pessoa não encontrada!");
                        break;
                    }

                    System.out.print("Título do livro: ");
                    String t = input.nextLine();

                    Livro liv = sistema.buscarLivroPorTitulo(t);

                    if(liv == null){
                        System.out.println("Livro não encontrado!");
                        break;
                    }

                    Exemplar disp = null;
                    for(Exemplar exx : sistema.getExemplares()){
                        if(exx.getLivro().equals(liv) && exx.isDisponivel()){
                            disp = exx;
                            break;
                        }
                    }

                    if(disp == null){
                        System.out.println("Nenhum exemplar disponível!");
                        break;
                    }

                    Emprestimo emp = new Emprestimo(pessoa, disp);
                    sistema.registrarEmprestimo(emp);

                    System.out.println("Empréstimo registrado!");
                    break;


                case 5:
                    SistemaBiblioteca sb1 = sistema;
                    System.out.println("----Pessoas----");
                    sistema.listarPessoas();
                    break;

                case 6:
                    System.out.println("----Livros----");
                    sistema.listarLivros();
                    break;

                case 7:
                    System.out.println("----Exemplares----");
                    sistema.listarExemplares();
                    break;

                case 8:
                    System.out.println("----Empréstimos----");
                    sistema.listarEmprestimos();
                    break;

                case 0:
                    SalvarDados.salvar(sistema);
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        input.close();
    }
}


