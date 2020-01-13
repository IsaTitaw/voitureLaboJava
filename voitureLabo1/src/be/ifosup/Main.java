package be.ifosup;

public class Main {

    public static void main(String[] args) {


                 Kia soulAuto = new Kia("tpt personnes", 0, 0, "droite", "Soul", "Noir", 5, 150, true); // voiture automatique

                Kia picantoMan = new Kia("tpt personnes", 0, 0, "droite", "Picanto", "Rouge", 3, 90, false); // voiture boite manuel



        soulAuto.setVitesse(55);
        soulAuto.accelerer(soulAuto.getVitesse());
        soulAuto.changerRapport(soulAuto.auto, soulAuto.getVitesse());
        soulAuto.setAngle(25);
        soulAuto.setDirection("gauche");
        soulAuto.tourner(soulAuto.getAngle(), soulAuto.getDirection());
        System.out.println(soulAuto);


        picantoMan.setVitesse(20);
        picantoMan.accelerer(picantoMan.getVitesse());
        picantoMan.changerRapport(picantoMan.auto, picantoMan.getVitesse());
        picantoMan.setVitesse(-10);
        picantoMan.accelerer(picantoMan.getVitesse());
        picantoMan.changerRapport(picantoMan.auto, picantoMan.getVitesse());
        System.out.println(picantoMan);

            }

        }

