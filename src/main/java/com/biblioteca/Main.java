package com.biblioteca;

import com.biblioteca.clases.Biblioteca;
import com.biblioteca.clases.Libro;

public class Main {
    static void main() {


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.CreaarLibrosRamdom(2);

        biblioteca.agregarLibro("El Principito", "Antoine de Saint-Exupéry", "100");
        biblioteca.agregarLibro("RURI DRAGON", "Neil", "100");

        biblioteca.mostrarInventario();

        System.out.println("\nBuscar id 3 ");

        biblioteca.mostrarLibroPorId(3);


        System.out.println("\nBuscar por autor: Neil");
        biblioteca.buscarAutor("Neil");


        System.out.println("\nBuscar Atributo valor");
        biblioteca.buscarAtributoValor("stock", "100");

        System.out.println("\nEditar Atributo valor");
        biblioteca.editarLibro(3,"stock", "50");
        biblioteca.mostrarLibroPorId(3);

        biblioteca.editarLibro(0, "stock", "50");
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "50");

        biblioteca.mostrarLibroPorId(0);
        System.out.println(libro.DatosLibro());

        Libro temp = biblioteca.getInventario().get(0);
        System.out.println(temp.DatosLibro());


        System.out.println("Goodbye!");
    }
}
