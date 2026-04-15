package com.biblioteca.clases;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class LibroTest {

    @Test
    void testDatosLibro() {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "100");
        assertTrue(libro.DatosLibro().contains("El Principito"));
        assertTrue(libro.DatosLibro().contains("Antoine de Saint-Exupéry"));
        assertTrue(libro.DatosLibro().contains("100"));
    }

    @Test
    void testBuscarAutor() {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "100");
        assertTrue(libro.buscarAutor("Antoine de Saint-Exupéry"));
        assertFalse(libro.buscarAutor("Otro Autor"));
    }

    @Test
    void testBuscarFactory() {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "100");
        assertTrue(libro.buscarFactory("titulo", "El Principito"));
        assertTrue(libro.buscarFactory("autor", "Antoine de Saint-Exupéry"));
        assertTrue(libro.buscarFactory("stock", "100"));
        assertFalse(libro.buscarFactory("titulo", "RURI DRAGON"));
    }
}
