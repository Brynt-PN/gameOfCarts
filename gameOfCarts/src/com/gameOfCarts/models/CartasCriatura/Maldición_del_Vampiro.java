package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Maldición_del_Vampiro extends Criaturas {
    public Maldición_del_Vampiro() {
        super(
                "OSCURIDAD",
                "Zombi / Efecto",
                "Maldición del Vampiro",
                6,
                """
                       Cuando esta carta es destruida en batalla y mandada al Cementerio:
                       puedes pagar 500 LP; Invócala de Modo Especial durante la Standby Phase
                       del próximo turno. Si lo haces: ésta gana 500 ATK.
                        """,
                2000,
                800
        );
    }
}
//por ti oskr