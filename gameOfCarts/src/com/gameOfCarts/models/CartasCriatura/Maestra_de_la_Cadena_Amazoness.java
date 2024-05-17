package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Maestra_de_la_Cadena_Amazoness extends Criaturas {
    public Maestra_de_la_Cadena_Amazoness() {
        super(
                "TIERRA",
                "Guerrero / Efecto",
                "Maestra de la Cadena Amazoness",
                4,
                """
                        Cuando esta carta es destruida en batalla y mandada al Cementerio:
                        puedes pagar 1500 LP; mira la mano de tu adversario,
                        y después añade a tu mano 1 monstruo en su mano.
                        """,
                1500,
                1300
        );
    }
}
//por ti oskr