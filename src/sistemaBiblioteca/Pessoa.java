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
        throw new IllegalArgumentException("CPF inválido");
        }this.cpf = cpf;
    }

    public abstract String getTipoPessoa();
}
