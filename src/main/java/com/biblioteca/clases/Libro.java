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

    public boolean editarFactory(String atributo, String nuevoValor) {
        if ("titulo".equals(atributo)) {
            this.titulo = nuevoValor;
            return true;
        } else if ("autor".equals(atributo)) {
            this.autor = nuevoValor;
            return true;
        } else if ("stock".equals(atributo)) {
            this.stock = nuevoValor;
            return true;
        } else {
            return false;
        }
    }

    public String getFactory(String atributo) {
        if ("titulo".equals(atributo)) {
            return this.titulo;
        } else if ("autor".equals(atributo)) {
            return this.autor;
        } else if ("stock".equals(atributo)) {
            return this.stock;
        } else {
            return null;
        }
    }




}
