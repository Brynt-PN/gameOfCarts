import com.gameOfCarts.models.CartasCriatura.Heroe_Elemental_Avian;
import com.gameOfCarts.models.CartasObjeto.Rascacielos_2;
import com.gameOfCarts.models.Data_base;

public class Main {
    public static void main(String[] args) {
        //Metodo encargado de mostrar las cartas de ambas clases (Objeto y Criaturas) que esta en la clase Data_base.
        Heroe_Elemental_Avian heroeElementalAvian = new Heroe_Elemental_Avian();
        Rascacielos_2 rascacielos2 = new Rascacielos_2();
        Data_base db = new Data_base();
        db.SaveCardCri(heroeElementalAvian);
        db.SaveCardObj(rascacielos2);
        db.ShowDataCri();
    }
}
