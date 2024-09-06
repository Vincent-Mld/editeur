package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu :  remplacer;debut;fin;chaine\n");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        if(parameters.length == 4) {
            String chaine = parameters[3];
            this.document.remplacer(debut,fin,chaine);
        } else {
            this.document.remplacer(debut, fin, "");
        }
        super.executer();
    }

}