package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Libro_de_la_Luna extends Objeto {
    public Libro_de_la_Luna() {
        super(
                "MÁGICA",
                "Juego Rápido",
                "Libro de la Luna",
                """
                        Selecciona 1 monstruo boca arriba en el Campo;
                        cambia ese objetivo a Posición de Defensa boca abajo.
                        """);
    }
}
