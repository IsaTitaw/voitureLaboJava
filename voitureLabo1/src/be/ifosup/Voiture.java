package be.ifosup;

public class Voiture extends Vehicule {
    private int roues;              //tjs 4 roues
    private String type;            //tjs voiture

//----------------------------------------------------------------------------------------------//
    public Voiture(String usage, int roues, String type) {
        super(usage);
        this.roues = roues;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "roues=" + roues +
                ", type='" + type + '\'' +
                '}';
    }

    //------------------------------------------------------------------------------------------//
    public int getRoues() {
        return roues;
    }

    public void setRoues(int roues) {
        this.roues = roues;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //------------------------------------------------------------------------------------//

    public void accelerer(int vitesse){
        System.out.println("On accélère ou on décélère avec la classe parent à une vitesse de: "+ vitesse);
    }




    public void changerRapport(boolean auto, int vitesse){
        if (auto = true){
            System.out.println("La voiture change les rapports toute seule");
            }else{
                if (auto = false){
                    if (vitesse > 200){
                        System.out.println("Le moteur a explosé!");
                    }else if (vitesse > 110){
                        System.out.println("Passez la 6 ème vitesse");
                    }else if (vitesse > 80){
                        System.out.println("Passez le 5ème vitesse");
                    }else if (vitesse > 60){
                        System.out.println("Passez le 4ème vitesse");
                    }else if (vitesse > 30){
                        System.out.println("Passez le 4ème vitesse");
                    }else if (vitesse > 10){
                        System.out.println("Passez le 4ème vitesse");
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
