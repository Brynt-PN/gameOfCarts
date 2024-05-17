package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Negar_Ataque extends Objeto {
    public Negar_Ataque() {
        super(
                "TRAMPA",
                "Contraefecto",
                "Negar Ataque",
                """
                        Cuando un monstruo del adversario declara un ataque:
                        selecciona el monstruo atacante; niega el ataque,
                        y después termina la Battle Phase.
                        """);
    }
}
//por ti oskr