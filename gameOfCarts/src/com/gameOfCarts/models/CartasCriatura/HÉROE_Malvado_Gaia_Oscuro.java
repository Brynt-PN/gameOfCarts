package com.gameOfCarts.models.CartasCriatura;

import com.gameOfCarts.models.Criaturas;

public class HÉROE_Malvado_Gaia_Oscuro extends Criaturas {
    public HÉROE_Malvado_Gaia_Oscuro() {
        super(
                "TIERRA",
                "Demonio / Fusión / Efecto",
                "HÉROE Malvado Gaia Oscuro",
                8,
                """
                        1 monstruo Demonio + 1 monstruo Roca
                        Debe ser Invocado de Modo Especial con "Fusión Oscura".
                        El ATK original de esta carta se convierte en los ATK originales
                        combinados de los materiales usados para su Invocación por Fusión.
                        Cuando esta carta declara un ataque: puedes cambiar
                        todos los monstruos en Posición de Defensa que controle tu adversario
                        a Posición de Ataque boca arriba.
                        (Los efectos de Volteo no se activan en este momento).
                        """,
                0,
                0
        );
    }
}
//por ti oskr