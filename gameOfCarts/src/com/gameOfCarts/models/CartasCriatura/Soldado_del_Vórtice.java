package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Soldado_del_Vórtice extends Criaturas {
    public Soldado_del_Vórtice() {
        super(
                "VIENTO",
                "Aqua / Efecto",
                "Amo Legendario del Jujitsu",
                3,
                """
                       Cuando esta carta es Invocada de Modo Normal:
                        puedes barajar al Deck 2 cartas en tu mano, y después robar 2 cartas.
                         Si esta carta es destruida: roba 1 carta.
                        """,
                0,
                600
        );
    }
}
//por ti oskr