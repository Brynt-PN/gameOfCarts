package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Arqueras_Amazoness extends Objeto {
    public Arqueras_Amazoness() {
        super(
                "MÁGICA",
                " ",
                "Arqueras Amazoness",
                """
                        Cuando un monstruo del adversario declara un ataque, mientras tú controlas un monstruo "Amazoness":
                        cambia a Posición de Ataque boca arriba todos los monstruos que tu adversario controle en este momento
                        (los efectos de Volteo no se activan), éstos pierden 500 ATK,
                        y además deben atacar este turno, si pueden.
                        """);
    }
}//por ti oskr
