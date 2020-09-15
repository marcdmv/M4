package itacademy;

import java.util.*;

public class Menu {
    private int numPlats;
    private String nomPlat;
    private int preuPlat;

    public Menu(){

    }
    public void setNumPlats (int numPlats){ //SETTER
        this.numPlats = numPlats;
    }
    public int getNumPlats (){ //GETTER
        return numPlats;
    }
    public void setNomPlat (String nomPlat){ //SETTER
        this.nomPlat = nomPlat;
    }
    public String getNomPlat (){ //GETTER
        return nomPlat;
    }
    public void setPreuPlat (int preuPlat){ //SETTER
        this.preuPlat = preuPlat;
    }
    public int getPreuPlat (){ //GETTER
        return preuPlat;
    }

    Hashtable<String, Integer> menu = new Hashtable<>();
    public void setMenu (String nomPlat, int preuPlat){
        menu.put(nomPlat,preuPlat);
    }
    public Set<String> getMenu (){ //GETTER
        Set<String> platsMenu = menu.keySet();
        return platsMenu;
    }
    public int getPreuPlatMenu (String nomPlat){ //GETTER
        return menu.get(nomPlat);
    }
}
