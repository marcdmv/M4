package itacademy;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //FASE 1
        int b5 = 5;
        int b10 = 10;
        int b20 = 20;
        int b50 = 50;
        int b100 = 100;
        int b200 = 200;
        int b500 = 500;
        int preuTotal = 0;
        int seguirDemanant = 1;

        //FASE 2

        Hashtable<String, Integer> menu = new Hashtable<>();

        Scanner numPlatsObj = new Scanner(System.in);
        System.out.println("¿Cuantos platos tiene el menú?");
        Integer numPlats = numPlatsObj.nextInt();

        for (int i = 0; i < numPlats; i++){
            Scanner nomIn = new Scanner(System.in);
            System.out.println("Introduzca el nombre de un plato");
            String nomPlat = nomIn.nextLine();
            Scanner preuIn = new Scanner(System.in);
            System.out.println("Introduzca el precio del plato");
            int preuPlat = preuIn.nextInt();

            menu.put(nomPlat,preuPlat);
        }
        //System.out.println(menu);
        Set<String> plats = menu.keySet();
        for (String plat : plats) {
            System.out.println(plat + " " + menu.get(plat) + "€");
        }
        System.out.println("¿Qué platos quiere pedir?");
        List<String> platsDemanats = new ArrayList<>();
        while (seguirDemanant == 1){
            Scanner platIn = new Scanner(System.in);
            System.out.println("Escriba un plato que quiera pedir:");
            platsDemanats.add(platIn.nextLine());
            Scanner seguirDemanantObj = new Scanner(System.in);
            System.out.println("¿Quiere seguir pidiendo? (si/no)");
            String platsDemanatsString = seguirDemanantObj.nextLine();
            if (platsDemanatsString.equals("no")){
                seguirDemanant = 0;
            }
        }

        System.out.println(platsDemanats); //imprimos por consola la lista de platos que se han pedido
    }
}
