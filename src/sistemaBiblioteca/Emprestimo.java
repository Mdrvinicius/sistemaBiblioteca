package sistemaBiblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Exemplar exemplar;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;

    public Emprestimo() {

    }

    public Emprestimo(Pessoa pessoa, Exemplar exemplar) {
        setPessoa(pessoa);
        setExemplar(exemplar);

        this.dataEmprestimo = LocalDate.now();
        this.dataPrevistaDevolucao = this.dataEmprestimo.plusDays(7);
        this.dataDevolucao = null;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        if (pessoa == null) {
            throw new IllegalArgumentException("Pessoa inválida");
        }
        this.pessoa = pessoa;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        if (exemplar == null) {
            try {
                throw new ExceptionLivro("Exemplar inválido");
            } catch (ExceptionLivro e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        if (!exemplar.isDisponivel()) {
            try {
                throw new ExceptionLivro("O exemplar já está emprestado");
            } catch (ExceptionLivro e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        this.exemplar = exemplar;
        exemplar.setDisponivel(false);
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void registrarDevolucao() {
        this.dataDevolucao = LocalDate.now();
        exemplar.setDisponivel(true);
    }

    public void setDataEmprestimo(LocalDate data){
        this.dataEmprestimo = data;
    }

    @Override
    public String toString() {
        return "Empréstimo -> Pessoa: " + pessoa.getNome() +
                " | Livro: " + exemplar.getLivro().getTitulo() +
                " | Data:  " + dataEmprestimo +
                " | Prevista: " + dataPrevistaDevolucao +
                " | Devolução " + (dataDevolucao == null ? "Ainda não devolvido" : dataDevolucao);
    }
}



