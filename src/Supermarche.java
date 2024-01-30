import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * La classe Supermarche représente le programme principal pour administrer les ventes et les achats d'un supermarché.
 * Elle crée des instances de produits, les organise dans une liste, les trie et les affiche.
 */
public class Supermarche {

    /**
     * Méthode principale du programme.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        // Création de produits
        Produit yaourt = new ProduitLaitier("Yaourt", "12345678", 2.5, new Date(), "Au froid");
        Produit riz = new ProduitAlimentaire("Riz", "87654321", 1.8, new Date(), new Date());
        Produit livre = new Livre("Les Misérables", "23456789", 15.0, new Date(), "Victor Hugo", "Gallimard", "Édition originale", "1862-01-01");
        Produit dvd = new DVD("La La Land", "34567890", 14.99, new Date(), "Damien Chazelle", 128);
        Produit vinyle = new DisqueVinyle("La Bohème", "45678901", 25.0, new Date(), "Charles Aznavour", 1965, false, "très bon");

        // Création d'une liste de produits
        ArrayList<Produit> produits = new ArrayList<>();
        produits.add(yaourt);
        produits.add(riz);
        produits.add(livre);
        produits.add(dvd);
        produits.add(vinyle);

        // Tri des produits par intitulé puis par prix
        Collections.sort(produits, Comparator.comparing(Produit::getIntitule).thenComparing(Produit::getPrix));

        // Affichage des produits triés
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }
}
