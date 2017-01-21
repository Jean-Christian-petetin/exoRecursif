package exorecursif;

/**
 *
 * @author jeanchristian-petetin
 */
public class ExoRecursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creation des objets Repertoire pour chaque noeud.
        Repertoire racine = new Repertoire("D");
        Repertoire document = new Repertoire("document");
        Repertoire multimedia = new Repertoire("multimedia");
        Repertoire videos = new Repertoire("videos");
        Repertoire images = new Repertoire("images");
        Repertoire pictures = new Repertoire("pictures");
        Repertoire web = new Repertoire("web");
        Repertoire animaux = new Repertoire("animaux");
        Repertoire chien = new Repertoire("chien");
        Repertoire photos = new Repertoire("photos");
        Repertoire deuxMilleDouze = new Repertoire("2012");
        Repertoire deuxMilleVinght = new Repertoire("2020");
        
            racine.addChildren(multimedia);
            racine.addChildren(document);
            multimedia.addChildren(videos);
            multimedia.addChildren(images);
            racine.afficheNom();

//        //Creation des Noeuds                
//        //insertion du repertoire multimedia dans D
//        racine.repertoires.add(document);
//        racine.repertoires.add(multimedia);
//        multimedia.repertoires.add(videos);
//        multimedia.repertoires.add(images);
//        images.repertoires.add(pictures);
//        pictures.repertoires.add(web);
//        web.repertoires.add(animaux);
//        animaux.repertoires.add(chien);
//        images.repertoires.add(photos);
//        photos.repertoires.add(deuxMilleDouze);
//        photos.repertoires.add(deuxMilleVinght);
//
//        //Creation des Leaf
//        document.repertoires.add(new Repertoire("word"));
//        document.repertoires.add(new Repertoire("excel"));
//        document.repertoires.add(new Repertoire("factures"));
//
//        videos.repertoires.add(new Repertoire("da"));
//        videos.repertoires.add(new Repertoire("film"));
//
//        deuxMilleDouze.repertoires.add(new Repertoire("01"));
//        deuxMilleDouze.repertoires.add(new Repertoire("02"));
//
//        deuxMilleVinght.repertoires.add(new Repertoire("01"));
//        deuxMilleVinght.repertoires.add(new Repertoire("12"));
//
//        web.repertoires.add(new Repertoire("hentai"));
//
//        animaux.repertoires.add(new Repertoire("chat"));
//
//        chien.repertoires.add(new Repertoire("poilsCourt"));
//        chien.repertoires.add(new Repertoire("poilsLong"));

//        System.out.println(racine.nom);
//
//        for (Repertoire lv00 : racine.repertoires) {
//            System.out.println("\t" + lv00.nom);
//
//            for (Repertoire lv01 : lv00.repertoires) {
//                System.out.println("\t\t" + lv01.nom);
//
//                for (Repertoire lv02 : lv01.repertoires) {
//                    System.out.println("\t\t\t" + lv02.nom);
//
//                    for (Repertoire lv03 : lv02.repertoires) {
//                        System.out.println("\t\t\t\t" + lv03.nom);
//
//                        for (Repertoire lv04 : lv03.repertoires) {
//                            System.out.println("\t\t\t\t\t" + lv04.nom);
//
//                            for (Repertoire lv05 : lv04.repertoires) {
//                                System.out.println("\t\t\t\t\t\t" + lv05.nom);
//
//                                for (Repertoire lv06 : lv05.repertoires) {
//                                    System.out.println("\t\t\t\t\t\t\t" + lv06.nom);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

        

    }

}
