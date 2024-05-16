package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Fuego_de_Dragón extends Objeto {
    public Fuego_de_Dragón() {
        super(
                "MÁGICA",
                " ",
                "Fuego de Dragón",
                """
                        Si controlas un monstruo Dragón: activa 1 de estos efectos;
                        ●Inflige 800 puntos de daño a tu adversario.
                        ●Selecciona 1 monstruo con 800 DEF o menos; destruye ese objetivo.
                        """);
    }
}
