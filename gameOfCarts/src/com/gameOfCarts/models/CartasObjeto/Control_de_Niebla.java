package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Control_de_Niebla extends Objeto {
    public Control_de_Niebla() {
        super(
                "MÁGICA",
                "Juego Rápido",
                "Control de Niebla",
                """
                        Sacrifica 1 monstruo "Cloudian" boca arriba, y después
                        selecciona 1 monstruo boca arriba en el Campo;
                        pon 3 Contadores de Niebla en ese objetivo.
                        """);
    }
}
