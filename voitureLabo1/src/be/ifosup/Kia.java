package be.ifosup;

public class Kia extends Voiture{
   private String modele;
   private String Color;
    private int portes;
    private int power;
    boolean auto;

    //------------------------------------------------------------------------------------------------------------//

    public Kia(String usage, int roues, String type, String modele, String color, int portes, int power, boolean auto) {
        super(usage, roues, type);
        this.modele = modele;
        Color = color;
        this.portes = portes;
        this.power = power;
        this.auto = auto;
    }

    //--------------------------------------------------------------------------------------------------------------//

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    //-----------------------------------------------------------------------------------------------------------------------//

    public void accelere(){
        System.out.println("on accélère en kia");
        super.accelerer();
    }





}
