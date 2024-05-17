package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Helios_Trío_Megistus extends Criaturas {
    public Helios_Trío_Megistus() {
        super(
                "LUZ",
                "Piro / Efecto",
                "Helios Trío Megistus",
                8,
                """
                        Puedes Invocar esta carta de Modo Especial
                        (desde tu mano) Sacrificando 1 "Helios Dúo Megistus".
                        El ATK/DEF de esta carta se convierten
                        en el número de monstruos desterrados x 300.
                        Después de que esta carta ataque, si tu adversario controla un monstruo,
                        esta carta puede hacer un segundo ataque inmediatamente después.
                        Durante la End Phase, si esta carta está en el Cementerio
                        porque fue destruida en batalla y mandada allí este turno:
                        puedes Invocar esta carta de Modo Especial y ésta gana 500 ATK/DEF.
                        """,
                0,
                0
        );
    }
}
//por ti oskr