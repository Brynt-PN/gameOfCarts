package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Aldea_Amazoness extends Objeto {
    public Aldea_Amazoness() {
        super(
                "MÁGICA",
                "Campo",
                "Aldea Amazoness",
                """
                        Todos los monstruos "Amazoness" ganan 200 ATK. Una vez por turno,
                        cuando un monstruo "Amazoness" es destruido en batalla o por el efecto de una carta
                        y mandado al Cementerio: puedes Invocar de Modo Especial, desde tu Deck,
                        1 monstruo "Amazoness" con un Nivel menor o igual que el de ese monstruo "Amazoness" en el Cementerio.
                        """);
    }
}
