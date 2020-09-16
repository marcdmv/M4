package itacademy;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //FASE 1
        Billetes billetes = new Billetes();

        //FASE 2
        Menu menu = new Menu();

        Scanner numPlatsObj = new Scanner(System.in);
        System.out.println("¿Cuantos platos tiene el menú?");
        menu.setNumPlats(numPlatsObj.nextInt());

        for (int i = 0; i < menu.getNumPlats(); i++) {
            Scanner nomIn = new Scanner(System.in);
            System.out.println("Introduzca el nombre de un plato");
            menu.setNomPlat(nomIn.nextLine());

            Scanner preuIn = new Scanner(System.in);
            System.out.println("Introduzca el precio del plato");
            menu.setPreuPlat(preuIn.nextInt());

            menu.setMenu(menu.getNomPlat(), menu.getPreuPlat());
        }

        for (String plat : menu.getMenu()) {
            System.out.println(plat + " " + menu.getPreuPlatMenu(plat) + "€");
        }

        int seguirDemanant = 1;

        Comanda comanda = new Comanda();

        System.out.println("¿Qué platos quiere pedir?");
        while (seguirDemanant == 1) {
            Scanner platIn = new Scanner(System.in);
            System.out.println("Escriba un plato que quiera pedir:");
            comanda.setPlatComanda(platIn.nextLine());

            Scanner seguirDemanantObj = new Scanner(System.in);
            System.out.println("¿Quiere seguir pidiendo? ([si]/no)");
            String platsDemanatsString = seguirDemanantObj.nextLine();
            if (platsDemanatsString.equalsIgnoreCase("no")) {
                seguirDemanant = 0;
            }
        }
        System.out.println(comanda.getPlatsComanda()); //imprimos por consola la lista de platos que se han pedido

        //FASE 3
        int preuTotal = 0;
        for (String plat : comanda.getPlatsComanda()) {
            try {
                preuTotal += menu.getPreuPlatMenu(plat);
            } catch (Exception e) {
                //System.out.println("Error:" + e);
                System.out.println("El plato " + plat + " no está en el menú y no ha sido añadido al precio total.");
            }
        }
        System.out.println("El precio total de la comanda es de " + preuTotal + "€."); //imprimos por consola el coste total de los platos
    }
}
