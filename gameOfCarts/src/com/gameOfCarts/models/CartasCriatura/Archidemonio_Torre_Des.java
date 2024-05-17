package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class Archidemonio_Torre_Des extends Criaturas {

    public Archidemonio_Torre_Des() {
        super(
                "LUZ",
                "Demonio / Efecto",
                "Archidemonio Torre Des",
                3,
                """
                        Una vez por turno, durante tu Standby Phase, debes pagar 500 LP (esto no es opcional),
                        o esta carta es destruida. Al resolver el efecto de una carta del adversario que
                        seleccione esta carta, lanza un dado de seis caras y niega ese efecto si sale 3 y, si
                        lo haces, destruye esa carta. Cuando "Archidemonio Rey del Terror" que controlas es
                        destruido y mandado al Cementerio (incluso durante el Damage Step) (Efecto Rápido):
                        puedes mandar al Cementerio esta carta en tu mano, y después selecciona ese
                        "Archidemonio Rey del Terror" en tu Cementerio; Invócalo de Modo Especial.
                        """,
                1100,
                1800
        );
    }
}
//por ti oskr