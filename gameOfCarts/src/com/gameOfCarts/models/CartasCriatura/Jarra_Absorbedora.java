package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Jarra_Absorbedora extends Criaturas {
    public Jarra_Absorbedora() {
        super(
                "TIERRA",
                "Roca / Volteo / Efecto",
                "Jarra Absorbedora",
                3,
                """
                        VOLTEO: Destruye todas las Mágicas/Trampas Colocadas en el Campo,
                        y después cada jugador roba 1 carta por cada una de las cartas
                        que controlaba que fuera destruida por este efecto.
                        No puedes Colocar ninguna carta este turno.
                        """,
                600,
                500
        );
    }
}
//por ti oskr