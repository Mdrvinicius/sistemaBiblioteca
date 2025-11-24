package sistemaBiblioteca;

import java.io.Serializable;
import java.util.ArrayList;

public class SistemaBiblioteca implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Exemplar> exemplares = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public ArrayList<Exemplar> getExemplares(){
        return exemplares;
    }

    public void cadastrarPessoa(Pessoa p){
        if(p != null){
            pessoas.add(p);
            System.out.println("Pessoa cadastrada com sucesso!");
        }
    }

    public void cadastrarLivro(Livro l){
        if(l != null){
            livros.add(l);
            System.out.println("Livro cadastrada com sucesso!");
        }
    }

    public void cadastrarEmplar(Exemplar ex){
        if(ex != null){
            exemplares.add(ex);
            System.out.println("Exemplar cadastrada com sucesso!");
        }
    }

    public void registrarEmprestimo(Emprestimo emp){
        if(emp != null){
            emprestimos.add(emp);
            System.out.println("Emprestimo registrado!");
        }
    }

    public void listarPessoas(){
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }

    public void listarLivros(){
        for(Livro l : livros){
            System.out.println(l);
        }
    }

    public void listarExemplares(){
        for(Exemplar e : exemplares){
            System.out.println(e);
        }
    }

    public void listarEmprestimos(){
        for(Emprestimo e : emprestimos){
            System.out.println(e);
        }
    }

    public Pessoa buscarPessoaPorNome(String nome){
        for(Pessoa p : pessoas){
            if(p.getNome().equalsIgnoreCase(nome)){
                return p;
            }
        }return null;
    }

    public Livro buscarLivroPorTitulo(String titulo){
        for(Livro l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                return l;
            }
        }return null;
    }

    public Exemplar buscarExemplarPorTitulo(int id){
        for(Exemplar e : exemplares){
            if(e.getId() == id){
                return e;
            }
        }return null;
    }

    public void cadastrarExemplar(Exemplar ex){
        if(ex != null){
            exemplares.add(ex);
            System.out.println("Exemplar cadastrado!");
        }
    }

    public Exemplar buscarExemplarPorId(int id){
        for(Exemplar ex : exemplares){
            if(ex.getId() == id){
                return ex;
            }
        }
        return null;
    }




}
