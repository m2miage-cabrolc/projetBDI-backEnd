package miagiles.gromed.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CommandeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Commande#Commande()}
     *   <li>{@link Commande#setCommandeType(boolean)}
     *   <li>{@link Commande#setEtatCommande(String)}
     *   <li>{@link Commande#setNomCmmande(String)}
     *   <li>{@link Commande#setNumeroCommande(long)}
     *   <li>{@link Commande#getEtatCommande()}
     *   <li>{@link Commande#getNomCmmande()}
     *   <li>{@link Commande#getNumeroCommande()}
     *   <li>{@link Commande#isCommandeType()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Commande actualCommande = new Commande();
        actualCommande.setCommandeType(true);
        actualCommande.setEtatCommande("Etat Commande");
        actualCommande.setNomCmmande("Nom Cmmande");
        actualCommande.setNumeroCommande(1L);
        assertEquals("Etat Commande", actualCommande.getEtatCommande());
        assertEquals("Nom Cmmande", actualCommande.getNomCmmande());
        assertEquals(1L, actualCommande.getNumeroCommande());
        assertTrue(actualCommande.isCommandeType());
    }

    /**
     * Method under test: {@link Commande#Commande(long, boolean, String, String)}
     */
    @Test
    void testConstructor2() {
        Commande actualCommande = new Commande(1L, true, "Nom Cmmande", "Etat Commande");

        assertEquals("Etat Commande", actualCommande.getEtatCommande());
        assertTrue(actualCommande.isCommandeType());
        assertEquals(1L, actualCommande.getNumeroCommande());
        assertEquals("Nom Cmmande", actualCommande.getNomCmmande());
    }
}

