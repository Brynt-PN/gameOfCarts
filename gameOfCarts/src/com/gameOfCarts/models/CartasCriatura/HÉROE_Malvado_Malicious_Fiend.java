package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Malvado_Malicious_Fiend extends Criaturas {
    public HÉROE_Malvado_Malicious_Fiend() {
        super(
                "FUEGO",
                "Demonio / Fusión / Efecto",
                "HÉROE Malvado Malicious Fiend",
                8,
                """
                        "HÉROE Malvado Malicious Edge" + 1 monstruo Demonio de Nivel 6 o mayor
                        Debe ser Invocado de Modo Especial con "Fusión Oscura".
                        Durante la Battle Phase de tu adversario,
                        todos los monstruos que éste controle se cambian a Posición de Ataque boca arriba,
                        y cada monstruo que controle debe atacar a esta carta, si puede.
                        """,
                3500,
                2100
        );
    }
}
//por ti oskr