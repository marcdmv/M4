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


        Hashtable<String, Integer> menu = new Hashtable<>();
        //He creado una HashTable en lugar de dos arrays separados porque así contiene el contenido de los dos arrays a la vez

        //FASE 2

        for (int i = 0; i < 4; i++){
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
            System.out.println("¿Quiere seguir pidiendo? ([si]/no)");
            String platsDemanatsString = seguirDemanantObj.nextLine();
            if (platsDemanatsString.equals("no")){
                seguirDemanant = 0;
            }
        }

        System.out.println(platsDemanats);

        //FASE 3
        for (String plat : platsDemanats) {
            try {
                preuTotal += menu.get(plat);
            } catch (Exception e) {
                //System.out.println("Error:" + e);
                System.out.println("El plato " + plat + " no está en el menú y no ha sido añadido al precio total.");
            }
        }
        System.out.println(preuTotal);
    }
}
