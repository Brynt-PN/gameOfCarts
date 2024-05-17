package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Rey_del_Terror extends Criaturas {

    public Archidemonio_Rey_del_Terror() {
        super(
                "OSCURIDAD",
                "Demonio / Efecto",
                "Archidemonio Rey del Terror",
                4,
                """
                        No puede ser Invocado de Modo Normal o por Volteo a menos que controles un monstruo "Archidemonio". Una vez por turno, durante tu Standby Phase, debes pagar 800 LP
                        (esto no es opcional), o esta carta es destruida. Al resolver el efecto de una carta
                        del adversario que seleccione esta carta, lanza un dado de seis caras y niega ese
                        efecto si sale 2 o 5 y, si lo haces, destruye esa carta. Niega los efectos de los
                        Monstruos de Efecto destruidos en batalla con esta carta (incluyendo en el Cementerio).
                        """,
                900,
                1500
        );
    }
}
//por ti oskr