package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Asustado_de_la_Batalla extends Objeto {
    public Asustado_de_la_Batalla() {
        super(
                "TRAMPA",
                "Continua",
                "Asustado de la Batalla",
                """
                        Activa esta carta seleccionando 1 monstruo "Archidemonio" que controles.
                        Tu adversario también paga los mismos LP que tú pagas por ese monstruo durante la Standby Phase.
                        Cuando esta carta deje el Campo, destruye ese monstruo.
                        Si ese monstruo deja el Campo, destruye esta carta.
                        """);
    }
}
//por ti oskr