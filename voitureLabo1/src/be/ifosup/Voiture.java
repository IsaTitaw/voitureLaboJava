package be.ifosup;

public class Voiture extends Vehicule {
    private static final int roues=4;
    private static final String type="voiture";
    private int vitesse;
    private int angle;
    private String direction;

//----------------------------------------------------------------------------------------------//

    public Voiture(String usage, int vitesse, int angle, String direction) {
        super(usage);
        this.vitesse = vitesse;
        this.angle = angle;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "vitesse=" + vitesse +
                ", angle=" + angle +
                ", direction='" + direction + '\'' +
                '}';
    }

    //------------------------------------------------------------------------------------------//

    public static int getRoues() {
        return roues;
    }

    public static String getType() {
        return type;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    //------------------------------------------------------------------------------------//

    public void accelerer(int vitesse){
        System.out.println("On accélère ou on décélère à une vitesse de: "+ vitesse);
    }




    public void changerRapport(boolean auto, int vitesse){
        if (auto){
            System.out.println("La voiture change les rapports toute seule");
            }else{
                if (auto == false){
                    if (vitesse > 200){
                        System.out.println("Le moteur a explosé!");
                    }else if (vitesse > 110){
                        System.out.println("Passez la 6 ème vitesse");
                    }else if (vitesse > 80){
                        System.out.println("Passez le 5ème vitesse");
                    }else if (vitesse > 60){
                        System.out.println("Passez le 4ème vitesse");
                    }else if (vitesse > 30){
                        System.out.println("Passez le 3ème vitesse");
                    }else if (vitesse > 10){
                        System.out.println("Passez le 2ème vitesse");
                    }else{
                        System.out.println("On est à l'arrêt ou on a oublié le frein à main en côte!");
                    }
                    }
            }
        }




    public void tourner(int angle, String direction){
        System.out.println("On tourne de "+ angle + " degrés à " + direction);

    }





}
