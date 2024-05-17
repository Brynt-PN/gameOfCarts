package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Aniquilador extends Criaturas {

    public Archidemonio_Aniquilador() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Archidemonio Aniquilador",
                9,
                """
                        Puedes seleccionar 1 carta que controles y 1 carta que controle tu adversario; destrúyelas,
                        y si has destruido uno o más monstruos Demonio boca arriba por este efecto, hasta el final
                        de este turno esta carta gana ATK igual a la mitad del ATK original de los monstruos Demonio.
                        Sólo puedes usar este efecto de "Archidemonio Aniquilador" una vez por turno.
                        """,
                2000,
                3000
        );
    }
}
