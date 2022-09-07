package poo.collection;

import java.util.ArrayList;
import java.util.List;
import poo.ex_heranca.Livro;


public class MinhaColecao {
    public static void main(String[] args) {
        //int vetor[] = new int[5];

        //forma qual se declara uma collection (superclasse)
        List<Livro>livros = new ArrayList<Livro>();

        Livro l1 = new Livro("Minha Coleção");
        Livro l2 = new Livro("Minha Coleção parte 2");
        Livro l3 = new Livro("Minha Coleção parte 3");
        Livro l4 = new Livro("Minha Coleção parte 4");

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);

        //imprime lista
        for (int i = 0; i < livros.size(); i++){
            System.out.println(livros.get(i));
        }

        //imprime lista melhor
        for(Livro l : livros){
            System.out.println(l);
        }

        livros.remove(0);
    }
}