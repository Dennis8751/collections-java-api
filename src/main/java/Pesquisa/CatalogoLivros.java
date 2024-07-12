package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel García Marquez", 1967);
        catalogoLivros.adicionarLivro("It: A Coisa", "Stephen King", 1986);
        catalogoLivros.adicionarLivro("Moby Dick", "Herman Melville", 1851);
        catalogoLivros.adicionarLivro("Moby Dick", "Autor desconhecido", 1950);
        catalogoLivros.adicionarLivro("Ulisses", "James Joyce", 1922);
        catalogoLivros.adicionarLivro("Gerra e Paz", "Liev Tolstoi", 1869);
        catalogoLivros.adicionarLivro("O Apanhador no Campo de Centeio", "J. D. Salinger", 1951);
        catalogoLivros.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
        catalogoLivros.adicionarLivro("O Ilumindado", "Stephen King", 1974);

        System.out.println("Autor Pesquisado \n" + catalogoLivros.pesquisarPorAutor("Stephen King"));
        System.out.println("\nIntervalo por ano \n" + catalogoLivros.pesquisaPorIntervaloAnos(1960,1980));
        System.out.println("\nLivro por titulo\n" + catalogoLivros.pesquisaPorTitulo("Moby Dick"));
    }

}
