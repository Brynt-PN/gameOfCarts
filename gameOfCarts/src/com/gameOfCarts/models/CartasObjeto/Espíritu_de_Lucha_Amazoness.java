package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Espíritu_de_Lucha_Amazoness extends Objeto {
    public Espíritu_de_Lucha_Amazoness() {
        super(
                "MÁGICA",
                "Continua",
                "Espíritu de Lucha Amazoness",
                """
                        Si tu monstruo "Amazoness" ataca un monstruo con mayor ATK,
                        el monstruo atacante gana 1000 ATK sólo durante el cálculo de daño.
                        """);
    }
}
//por ti oskr