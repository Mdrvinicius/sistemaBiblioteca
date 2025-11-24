package sistemaBiblioteca;

public class Exemplar {
    private int id;
    private Livro livro;
    private boolean disponivel = true;

    public Exemplar() {
    }

    public Exemplar(int id, Livro livro) {
        setId(id);
        setLivro(livro);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID do exemplar inválido");
        }
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("Livro não pode ser nulo");
        }
        this.livro = livro;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Exemplar " + id +
                " | Livro: " + livro.getTitulo() +
                " | Disponível: " + disponivel;
    }
}




