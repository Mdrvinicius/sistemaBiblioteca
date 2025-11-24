package sistemaBiblioteca;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {
    private String nome;
    private String cpf;

    public Pessoa(){

    }

    public Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome inválido");
        }this.nome = nome;
    }


    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        if (cpf == null || cpf.length() != 11){
        try{
            throw new ExceptionCpf("CPF inválido");
        }catch (ExceptionCpf e){
            System.out.println(e.getMessage());
            return;
            }
        }
        this.cpf = cpf;
    }

    public abstract String getTipoPessoa();

    @Override
    public String toString(){
        return getTipoPessoa() + " | Nome: " + nome + " | CPF: " + cpf;
    }
}
