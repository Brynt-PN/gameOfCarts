package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class El_Segundo_Sarcófago extends Objeto {
    public El_Segundo_Sarcófago() {
        super(
                "MÁGICA",
                "Continua",
                "El Segundo Sarcófago",
                """
                        Esta carta sólo se puede poner en el Campo por el efecto de
                        "El Primer Sarcófago".
                        """);
    }
}
