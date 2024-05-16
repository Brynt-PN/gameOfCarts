package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Maldición_del_Envejecimiento extends Objeto {
    public Maldición_del_Envejecimiento() {
        super(
                "TRAMPA",
                " ",
                "Maldición del Envejecimiento",
                """
                        Descarta 1 carta; todos los monstruos que controla tu adversario
                        en este momento pierden 500 ATK/DEF hasta el final de este turno.
                        """);
    }
}
