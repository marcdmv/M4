package itacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comanda {
    List<String> platsDemanats = new ArrayList<>();

    public void setPlatComanda (String nomPlat){
        platsDemanats.add(nomPlat);
    }

    public List<String> getPlatsComanda (){
        return platsDemanats;
    }

}
