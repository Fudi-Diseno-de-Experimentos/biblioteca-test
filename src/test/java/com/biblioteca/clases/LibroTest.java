package com.biblioteca.clases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void testDatosLibro() {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "100");
        String expected = "Titulo: El Principito\nAutor: Antoine de Saint-Exupéry\nStock: 100";
        assertEquals(expected, libro.DatosLibro());
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
