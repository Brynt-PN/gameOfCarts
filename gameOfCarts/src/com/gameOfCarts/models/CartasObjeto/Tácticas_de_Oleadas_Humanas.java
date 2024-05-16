package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Tácticas_de_Oleadas_Humanas extends Objeto {
    public Tácticas_de_Oleadas_Humanas() {
        super(
                "TRAMPA",
                "Continua",
                "Tácticas de Oleadas Humanas",
                """
                        Una vez por turno, durante la End Phase, si tu o tus Monstruos Normales
                        de Nivel 2 o menor fueron destruidos en batalla este turno:
                        Invoca de Modo Especial Monstruos Normales de Nivel 2 o menor
                        desde tu Deck igual al número de tus Monstruos Normales
                        de Nivel 2 o menor destruidos en batalla este turno.
                        """);
    }
}
