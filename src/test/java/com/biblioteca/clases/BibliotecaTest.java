package com.biblioteca.clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
