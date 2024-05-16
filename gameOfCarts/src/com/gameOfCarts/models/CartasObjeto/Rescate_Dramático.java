package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Rescate_Dramático extends Objeto {
    public Rescate_Dramático() {
        super(
                "TRAMPA",
                " ",
                "Rescate Dramático",
                """
                        Cuando se activa una carta que selecciona un monstruo "Amazoness"
                        en el Campo: devuelve ese monstruo seleccionado a la mano y,
                        si lo haces, Invoca otro monstruo de Modo Especial desde tu mano.
                        """);
    }
}
