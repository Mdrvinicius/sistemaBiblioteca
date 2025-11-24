package sistemaBiblioteca;

import java.util.ArrayList;

public class Livro {

     private String titulo;
     private String autor;
     private int ano;
     private ArrayList<Categoria> categorias = new Arraylist <>();

     public Livro() {}

    public Livro(String titulo, String autor,int ano) {
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
         if(titulo == null || titulo.trim().isEmpty ()) {
             throw new IllegalArgumentException("titulo inválido");
         }
         this.titulo = titulo;
         }
         public String getAutor(){
         return autor;
    }
public void setAutor(String autor) {
    if (autor == null || autor.trim().isEmpty()) {
        throw new IllegalArgumentException("Autor inválido");
    }
    this.autor = autor;
}
public int getAno() {
    return ano;
}
public void setAno (int ano) {
    if (ano <= 0) {
        throw new IllegalArgumentException("Ano inválido");
    }
    this.ano = ano;
}
public void adicionarCategoria(Categoria c) {
    if (c != null) {
        categorias.add(c);
    }
}
public ArrayList<Categoria> getCategorias() {
    return categorias
}

@Override
public String toString(){
         return "Livro " + titulo + " - " + autor + " ("+ ano + ")";

}


}
