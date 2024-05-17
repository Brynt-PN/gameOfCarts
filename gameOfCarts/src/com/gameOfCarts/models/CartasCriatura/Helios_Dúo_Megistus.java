package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Helios_Dúo_Megistus extends Criaturas {
    public Helios_Dúo_Megistus() {
        super(
                "LUZ",
                "Piro / Efecto",
                "Helios Dúo Megistus",
                6,
                """
                        Puedes Invocar esta carta de Modo Especial
                        (desde tu mano) Sacrificando 1 "Helios - El Sol Primordial".
                        El ATK/DEF de esta carta se convierten en el número
                        de monstruos desterrados x 200. Durante la End Phase,
                        si esta carta está en el Cementerio porque fue destruida en batalla
                        y mandada allí este turno: puedes Invocar esta carta
                        de Modo Especial y ésta gana 300 ATK/DEF.
                        """,
                0,
                0
        );
    }
}
//por ti oskr