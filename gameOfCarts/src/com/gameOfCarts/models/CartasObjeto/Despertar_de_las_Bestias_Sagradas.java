package com.gameOfCarts.models.CartasObjeto;

import com.gameOfCarts.models.Objeto;

public class Despertar_de_las_Bestias_Sagradas extends Objeto {
    public Despertar_de_las_Bestias_Sagradas() {
        super(
                "TRAMPA",
                "Continua",
                "Aldea Amazoness",
                """
                        Esta carta gana estos efectos basados en el número de "Uria,
                        Señor de las Llamas Abrasadoras", "Hamon, Señor del Trueno Golpeador"
                        y/o "Raviel, Señor de Fantasmas" con nombres diferentes que controles.
                        ●1+: Cada vez que tu adversario Invoque uno o más monstruos de Modo Normal o Especial:
                        gana LP igual al ATK de ese o esos monstruos.
                        ●2+: Niega los efectos activados de los monstruos que controla tu adversario.
                        ●3: Cualquier monstruo mandado al Cementerio de tu adversario es desterrado en su lugar.
                        Una vez por tu turno, si controlas un monstruo de Nivel 10:
                        puedes añadir a tu mano 1 Trampa Continua en tu Cementerio.
                        """);
    }
}
