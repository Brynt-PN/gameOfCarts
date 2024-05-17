package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Coro_de_Aqua extends Objeto {
    public Coro_de_Aqua() {
        super(
                "TRAMPA",
                "Continua",
                "Coro de Aqua",
                """
                        Si hay monstruos con el mismo nombre en el Campo,
                        esos monstruos ganan 500 ATK/DEF.
                        """);
    }
}
