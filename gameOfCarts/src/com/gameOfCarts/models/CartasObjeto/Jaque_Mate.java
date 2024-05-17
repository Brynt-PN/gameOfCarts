package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Jaque_Mate extends Objeto {
    public Jaque_Mate() {
        super(
                "MÁGICA",
                " ",
                "Jaque Mate",
                """
                        Sacrifica 1 monstruo "Archidemonio", y después selecciona
                        1 "Archidemonio Rey del Terror" que controles;
                        éste puede atacar directamente este turno.
                        """);
    }
}
