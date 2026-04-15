package com.biblioteca.clases;

public class Libro {
    private String titulo;
    private String autor;
    private String stock;

    public Libro(String titulo, String autor, String stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
    }
    public Libro() {
        this.titulo = "Domain-Driven Design: Tackling Complexity in the Heart of Software";
        this.autor = "Eric Evans";
        this.stock = "560";
    }

    public String DatosLibro() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nStock: " + stock;
    }

    public boolean buscarAutor(String autor) {
        if (this.autor.equals(autor)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean buscarFactory(String atributo, String valor) {
        if ("titulo".equals(atributo)) {
            return this.titulo.equals(valor);
        } else if ("autor".equals(atributo)) {
            return this.autor.equals(valor);
        } else if ("stock".equals(atributo)) {
            return this.stock.equals(valor);
        } else {
            return false;
        }

    }

}
