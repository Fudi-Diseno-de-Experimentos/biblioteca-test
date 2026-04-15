package com.biblioteca.clases;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> inventario = new ArrayList<>();

    public Biblioteca(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            inventario.add(new Libro());
        }
    }

    public Biblioteca(){

    }


    public void agregarLibro(Libro libro) {
        inventario.add(libro);
    }
    public void agregarLibro(String titulo, String autor, String stock) {
        Libro libro = new Libro(titulo, autor, stock);
        inventario.add(libro);
    }

    public void mostrarInventario() {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("--------- "+ "Libro" + i+ " ----------");
            System.out.println(inventario.get(i).DatosLibro());
            System.out.println("---------------------------");
        }
    }


    public void mostrarLibroPorId(int i){
        System.out.println(inventario.get(i).DatosLibro());
    }

    public void CreaarLibrosRamdom(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            inventario.add(new Libro());
        };
    }

    public boolean eliminarLibro(int indice){

        if(indice < 0 || indice >= inventario.size()){
            return false;
        }
        inventario.remove(indice);
        return true;
    }

    public void buscarAutor(String autor) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).buscarAutor(autor)){
                this.mostrarLibroPorId(i);
            }
        }
    }

    public void buscarAtributoValor(String atributo, String valor) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).buscarFactory(atributo, valor)){
                this.mostrarLibroPorId(i);
            }
        }
    }

    public Libro editarLibro(int indice, String atributo, String nuevoValor) {
        if (indice < 0 || indice >= inventario.size()) {
            return null;
        }
        Libro libro = inventario.get(indice);
        if (libro.editarFactory(atributo, nuevoValor)) {
            return libro;
        } else {
            return null;
        }


    }

    public List<Libro> getInventario() {
        return inventario;
    }
}
