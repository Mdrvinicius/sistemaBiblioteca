package sistemaBiblioteca;

public class Bibliotecario extends Pessoa{

    public Bibliotecario(String nome, String cpf){
        super(nome, cpf);
    }

    @Override
    public String getTipoPessoa(){
        return "Bibliotecario";
    }
}
