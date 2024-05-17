package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Orco_Gigante extends Criaturas {
    public Orco_Gigante() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Orco Gigante",
                4,
                """
                        Si esta carta ataca, se cambia a Posición de Defensa al final de la Battle Phase.
                        Ésta no puede cambiar su posición de batalla hasta el final de tu próximo turno.
                        """,
                2200,
                0
        );
    }
}
//por ti oskr