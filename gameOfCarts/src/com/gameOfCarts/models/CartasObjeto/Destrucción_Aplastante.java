package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Destrucción_Aplastante extends Objeto {
    public Destrucción_Aplastante() {
        super(
                "MÁGICA",
                " ",
                "Destrucción Aplastante",
                """
                        Si controlas un monstruo Dragón: selecciona 1 Mágica/Trampa en el Campo;
                        destruye ese objetivo y, si lo haces, inflige 500 puntos de daño a su controlador.
                        """);
    }
}
