package com.biblioteca.clases;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BibliotecaMockitoTest {

    private Biblioteca biblioteca;

    @Mock
    private Libro libroMock1;

    @Mock
    private Libro libroMock2;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void testAgregarYVerificarLibroMock() {
        // Arrange
        when(libroMock1.DatosLibro()).thenReturn("Titulo: Mock\nAutor: Mock Autor\nStock: 10");
        
        // Act
        biblioteca.agregarLibro(libroMock1);
        List<Libro> inventario = biblioteca.getInventario();

        // Assert
        assertEquals(1, inventario.size());
        assertEquals("Titulo: Mock\nAutor: Mock Autor\nStock: 10", inventario.get(0).DatosLibro());
        verify(libroMock1, times(1)).DatosLibro();
    }

    @Test
    void testBuscarAutorMock() {
        // Arrange
        when(libroMock1.buscarAutor("Autor Buscado")).thenReturn(true);
        when(libroMock2.buscarAutor("Autor Buscado")).thenReturn(false);

        biblioteca.agregarLibro(libroMock1);
        biblioteca.agregarLibro(libroMock2);

        // Act
        biblioteca.buscarAutor("Autor Buscado");

        // Assert
        verify(libroMock1, times(1)).buscarAutor("Autor Buscado");
        verify(libroMock2, times(1)).buscarAutor("Autor Buscado");
        // Verifica que se llame a DatosLibro porque retornó true (coincide el autor)
        verify(libroMock1, times(1)).DatosLibro(); 
        // No debería llamarse para libroMock2
        verify(libroMock2, never()).DatosLibro();
    }

    @Test
    void testEditarLibroConMock() {
        // Arrange
        when(libroMock1.editarFactory("stock", "20")).thenReturn(true);
        biblioteca.agregarLibro(libroMock1);

        // Act
        boolean resultadoExitoso = biblioteca.editarLibro(0, "stock", "20");
        boolean resultadoFallido1 = biblioteca.editarLibro(0, "stock", "Error");
        boolean resultadoFallido2 = biblioteca.editarLibro(10, "stock", "20"); // índice fuera de rango

        // Assert
        assertTrue(resultadoExitoso);
        assertFalse(resultadoFallido1);
        assertFalse(resultadoFallido2);
        
        verify(libroMock1, times(1)).editarFactory("stock", "20");
        verify(libroMock1, times(1)).editarFactory("stock", "Error");
    }

    @Test
    void testEliminarLibro() {
        // Arrange
        biblioteca.agregarLibro(libroMock1);
        
        // Act
        boolean borradoOk = biblioteca.eliminarLibro(0);
        boolean borradoFail = biblioteca.eliminarLibro(0);

        // Assert
        assertTrue(borradoOk);
        assertFalse(borradoFail);
        assertEquals(0, biblioteca.getInventario().size());
    }
}
