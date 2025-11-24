package sistemaBiblioteca;

import java.util.ArrayList;

public class SistemaBiblioteca {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Exemplar> exemplares = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p){
        if(p != null){
            pessoas.add(p);
            System.out.println("Pessoa cadastrada com sucesso!");
        }
    }

    public void caddastrarLivro(Livro l){
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

    public void listarPessoa(){
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }

    public void listrarLivros(){
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

}
