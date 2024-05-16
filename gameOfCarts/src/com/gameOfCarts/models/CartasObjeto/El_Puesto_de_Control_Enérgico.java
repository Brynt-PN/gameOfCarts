package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class El_Puesto_de_Control_Enérgico extends Objeto {
    public El_Puesto_de_Control_Enérgico() {
        super(
                "TRAMPA",
                " ",
                "El Puesto de Control Enérgico",
                """
                        Cuando un monstruo del adversario declara un ataque:
                        mira la mano de tu adversario y, si tiene una Carta de Monstruo,
                        niega el ataque, y después descarta 1 monstruo en su mano (tu elección).
                        """);
    }
}
