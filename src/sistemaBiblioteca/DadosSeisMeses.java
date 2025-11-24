package sistemaBiblioteca;

import java.time.LocalDate;

public class DadosSeisMeses {
    public static void gerar(SistemaBiblioteca sistema){

        // Criando pessoas
        Pessoa p1 = new Cliente("Maria", "11122233344");
        Pessoa p2 = new Cliente("João", "55566677788");

        sistema.cadastrarPessoa(p1);
        sistema.cadastrarPessoa(p2);

        // Criando livro
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        sistema.cadastrarLivro(l1);

        // Criando exemplares
        Exemplar ex1 = new Exemplar(1, l1);
        Exemplar ex2 = new Exemplar(2, l1);

        sistema.cadastrarExemplar(ex2);
        sistema.cadastrarExemplar(ex2);

        // Criando empréstimos MANUAIS (6 meses)
        Emprestimo e1 = new Emprestimo(p1, ex1);
        e1.registrarDevolucao();
        e1.setDataEmprestimo(LocalDate.of(2024, 1, 10));
        sistema.registrarEmprestimo(e1);

        Emprestimo e2 = new Emprestimo(p2, ex2);
        e2.registrarDevolucao();
        e2.setDataEmprestimo(LocalDate.of(2024, 2, 5));
        sistema.registrarEmprestimo(e2);

        Emprestimo e3 = new Emprestimo(p1, ex1);
        e3.registrarDevolucao();
        e3.setDataEmprestimo(LocalDate.of(2024, 3, 18));
        sistema.registrarEmprestimo(e3);

        Emprestimo e4 = new Emprestimo(p2, ex2);
        e4.registrarDevolucao();
        e4.setDataEmprestimo(LocalDate.of(2024, 4, 2));
        sistema.registrarEmprestimo(e4);

        Emprestimo e5 = new Emprestimo(p1, ex1);
        e5.registrarDevolucao();
        e5.setDataEmprestimo(LocalDate.of(2024, 5, 9));
        sistema.registrarEmprestimo(e5);

        System.out.println("Dados iniciais de 6 meses foram carregados.");
    }
}
