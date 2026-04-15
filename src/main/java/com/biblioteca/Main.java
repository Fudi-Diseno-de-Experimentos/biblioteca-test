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


        System.out.println("Goodbye!");
    }
}
