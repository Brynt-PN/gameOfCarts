package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Deseo_del_Vampiro extends Objeto {
    public Deseo_del_Vampiro() {
        super(
                "MÁGICA",
                " ",
                "Deseo del Vampiro",
                """
                        Activa 1 de estos efectos.
                        ●Selecciona 1 monstruo boca arriba que controles;
                        manda al Cementerio 1 monstruo "Vampiro/a" en tu Deck con un Nivel diferente y,
                        si lo haces, el Nivel del monstruo seleccionado se convierte el Nivel de ese monstruo mandado
                         en el Cementerio, hasta el final de este turno.
                        ●Selecciona 1 monstruo "Vampiro/a" en tu Cementerio;
                        manda al Cementerio 1 monstruo que controles y,
                        si lo haces, Invoca de Modo Especial el monstruo seleccionado.
                        Sólo puedes activar 1 "Deseo del Vampiro" por turno.
                        """);
    }
}
//por ti oskr