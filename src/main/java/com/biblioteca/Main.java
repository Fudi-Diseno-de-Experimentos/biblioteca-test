package com.biblioteca;

import com.biblioteca.clases.Biblioteca;
import com.biblioteca.clases.Libro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Leer libros desde el archivo de prueba
        String archivo = "libros_prueba.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty() || linea.startsWith("#")) continue; // Saltar comentarios y líneas vacías
                String[] partes = linea.split("\\|");
                if (partes.length >= 3) {
                    String titulo = partes[0];
                    String autor = partes[1];
                    String stock = partes.length > 2 ? partes[2] : "0";
                    biblioteca.agregarLibro(titulo, autor, stock);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo de libros: " + e.getMessage());
        }

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
