package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Ciclón_de_la_Galaxia extends Objeto {
    public Ciclón_de_la_Galaxia() {
        super(
                "MÁGICA",
                " ",
                "Ciclón de la Galaxia",
                """
                        Selecciona 1 Mágica/Trampa Colocada en el Campo; destrúyela.
                        Durante tu Main Phase, excepto el turno en el que esta carta fue mandada al Cementerio:
                        puedes desterrar esta carta en tu Cementerio, y después seleccionar
                        1 Mágica/Trampa boca arriba en el Campo; destrúyela.
                        Sólo puedes usar este efecto de "Ciclón de la Galaxia" una vez por turno.
                        """);
    }
}
