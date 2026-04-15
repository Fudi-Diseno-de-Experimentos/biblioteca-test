package com.biblioteca.clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class BibliotecaTest {

    @Test
    void testAgregarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "100");
        biblioteca.agregarLibro(libro);
        assertEquals(1, biblioteca.getInventario().size());
        assertEquals(libro, biblioteca.getInventario().get(0));
    }

    @Test
    void testEliminarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El Principito", "Antoine de Saint-Exupéry", "100");
        biblioteca.agregarLibro("RURI DRAGON", "Neil", "100");
        assertTrue(biblioteca.eliminarLibro(0));
    }

    @Test
    void testEditarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El Principito", "Antoine de Saint-Exupéry", "100");
        biblioteca.editarLibro(0, "stock", "50");

        assertTrue(biblioteca.getInventario().get(0).buscarFactory("stock", "50"));
    }
}
