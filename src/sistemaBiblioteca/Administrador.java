package sistemaBiblioteca;

public class Administrador extends Pessoa{

    public Administrador(String nome, String cpf){
        super(nome, cpf);
    }

    @Override
    public String getTipoPessoa(){
        return "Administrador";
    }
}
