package itacademy;

public class VariablesMenu {
    private int preuTotal;

    private int seguirDemanant;

    public VariablesMenu () {
        preuTotal = 0;
        seguirDemanant = 1;
    }
        public int getSeguirDemanant(){
        return seguirDemanant;
    }
    public void setSeguirDemanant(int seguirDemanant){
        this.seguirDemanant = seguirDemanant;
    }

}
