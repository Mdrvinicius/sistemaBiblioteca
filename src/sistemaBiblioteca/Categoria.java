package sistemaBiblioteca;

public class Categoria {
    private String nome;

    public Categoria(){

    }

    public Categoria(String nome){
        setNome(nome);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome da categoria inválido");
        }this.nome=nome;
    }

    @Override
    public String toString(){
        return "Categoria " + nome;
    }

}
