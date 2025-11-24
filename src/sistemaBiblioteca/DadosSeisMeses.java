package sistemaBiblioteca;

import java.time.LocalDate;

public class DadosSeisMeses {

    public static void gerar(SistemaBiblioteca sistema){


        Pessoa p1 = new Cliente("Maria", "11122233344");
        Pessoa p2 = new Cliente("João", "55566677788");
        Pessoa p3 = new Cliente("Claudio", "87765565433");

        sistema.cadastrarPessoa(p1);
        sistema.cadastrarPessoa(p2);
        sistema.cadastrarPessoa(p3);


        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l2 = new Livro("O Pequeno Príncipe", "Saint-Exupéry", 1943);
        Livro l3 = new Livro("Harry Potter", "J. K. Rowling", 1997);

        sistema.cadastrarLivro(l1);
        sistema.cadastrarLivro(l2);
        sistema.cadastrarLivro(l3);


        Exemplar ex1 = new Exemplar(1, l1);
        Exemplar ex2 = new Exemplar(2, l1);

        Exemplar ex3 = new Exemplar(3, l2);
        Exemplar ex4 = new Exemplar(4, l2);

        Exemplar ex5 = new Exemplar(5, l3);
        Exemplar ex6 = new Exemplar(6, l3);

        sistema.cadastrarExemplar(ex1);
        sistema.cadastrarExemplar(ex2);
        sistema.cadastrarExemplar(ex3);
        sistema.cadastrarExemplar(ex4);
        sistema.cadastrarExemplar(ex5);
        sistema.cadastrarExemplar(ex6);


        registrar(sistema, p1, ex1, 2024, 1, 10);  // Janeiro
        registrar(sistema, p2, ex2, 2024, 1, 22);

        registrar(sistema, p3, ex3, 2024, 2, 5);   // Fevereiro
        registrar(sistema, p1, ex4, 2024, 2, 19);

        registrar(sistema, p2, ex5, 2024, 3, 2);   // Março
        registrar(sistema, p3, ex6, 2024, 3, 27);

        registrar(sistema, p1, ex2, 2024, 4, 8);   // Abril
        registrar(sistema, p3, ex3, 2024, 4, 21);

        registrar(sistema, p1, ex5, 2024, 5, 4);   // Maio
        registrar(sistema, p2, ex6, 2024, 5, 30);

        registrar(sistema, p3, ex1, 2024, 6, 11);  // Junho
        registrar(sistema, p2, ex4, 2024, 6, 25);

        System.out.println("Dados iniciais de 6 meses foram carregados com sucesso!");
    }

    private static void registrar(SistemaBiblioteca sistema, Pessoa p, Exemplar ex, int ano, int mes, int dia){
        Emprestimo emp = new Emprestimo(p, ex);

        emp.registrarDevolucao();

        emp.setDataEmprestimo(LocalDate.of(ano, mes, dia));
        sistema.registrarEmprestimo(emp);
    }
}