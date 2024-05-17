package com.gameOfCarts.models;

import java.util.ArrayList;
import java.util.List;

public class Data_base {

    //Declare la lista por cada tipo y una que inbolucre a ambas
    private List<Criaturas> cardCri = new ArrayList<>();
    private List<Objeto> cardObj = new ArrayList<>();
    private List<Cartas> cardCrossOver = new ArrayList<>();

    //Guarda las cartas tipo criatura en el arrait.
    public void SaveCardCri(Criaturas criaturas){
        this.cardCri.add(criaturas);
        this.cardCrossOver.add(criaturas);
    }

    //Guarda las cartas tipo objeto en el arrait
    public void SaveCardObj(Objeto objeto) {
        this.cardObj.add(objeto);
        this.cardCrossOver.add(objeto);
    }


    public void ShowData() {
        for (Cartas car : this.cardCrossOver){
            System.out.println(car);
        }
    }

}
