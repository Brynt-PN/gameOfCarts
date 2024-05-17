package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Rey_Goblin extends Criaturas {
    public Rey_Goblin() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Rey Goblin",
                1,
                """
                        Mientras controles otro monstruo Demonio, los monstruos no pueden atacar esta carta.
                        El ATK/DEF de esta carta se convierten en el número de otros monstruos Demonio
                        en el Campo x 1000.
                        """,
                0,
                0
        );
    }
}
//por ti oskr