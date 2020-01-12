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

    public void accelerer(){
        System.out.println("On accélère avec la classe parent!");
    }



}
