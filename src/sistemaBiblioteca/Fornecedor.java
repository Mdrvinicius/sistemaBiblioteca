package sistemaBiblioteca;

public class Fornecedor extends Pessoa{
    private String empresa;

    public Fornecedor(String nome, String cpf, String empresa){
        super(nome, cpf);
        setEmpresa(empresa);
    }

    public String getEmpresa(){
        return empresa;
    }

    public void setEmpresa(String empresa){
        if (empresa == null || empresa.trim().isEmpty()){
            throw new IllegalArgumentException("Empresa Inválida");
        }this.empresa = empresa;
    }

    @Override
    public String getTipoPessoa(){
        return "Fornecedor";
    }
}


