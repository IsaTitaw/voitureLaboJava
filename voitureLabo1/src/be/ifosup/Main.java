package be.ifosup;

public class Main {

    public static void main(String[] args) {

                int vitesse = 0;
                 Kia soulAuto = new Kia("tpt personnes", 4, "Voiture", "Soul", "Noir", 5, 150, true); // voiture automatique

                Kia picantoMan = new Kia("tpt personnes", 4, "Voiture", "Picanto", "Rouge", 3, 90, false); // voiture boite manuel

//        System.out.println(soulAuto);
//        System.out.println(picantoMan);
//
//        soulAuto.accelerer(15);
//        soulAuto.changerRapport(soulAuto.auto, vitesse);
//        soulAuto.accelerer(60);
//        soulAuto.changerRapport(soulAuto.auto, vitesse);
//        soulAuto.tourner(60, "droite");
        picantoMan.accelerer(60);
        picantoMan.changerRapport(picantoMan.auto, vitesse);



//                // Test voiture Automatique
//
//                System.out.println("Voiture Automatique -------------------------------");
//
//                maVoiture.accelere(30);
//
//                maVoiture.tourne(90);
//
//                maVoiture.accelere(100);
//
//                maVoiture.accelere(-30);
//
//                System.out.println(maVoiture);
//
//
//
//                // Test voiture boite manuel
//
//                System.out.println("\nVoiture Manuel -------------------------------");
//
//                monAutreVoiture.accelere(30);
//
//                monAutreVoiture.changeRapport(1);
//
//                monAutreVoiture.accelere(30);
//
//                monAutreVoiture.tourne(-45);
//
//                monAutreVoiture.changeRapport(3);
//
//                monAutreVoiture.accelere(100);
//
//                System.out.println(monAutreVoiture);

            }

        }

