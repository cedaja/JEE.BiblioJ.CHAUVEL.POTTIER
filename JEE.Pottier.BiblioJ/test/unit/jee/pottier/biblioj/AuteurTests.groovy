package jee.pottier.biblioj



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Auteur)
class AuteurTests {
	
	Auteur auteur = new Auteur(nom : "Jean", prenom : "Exemple")
	
    void testCreate() {
	
        assertEquals(auteur.nom,"Jean")
	    assertEquals(auteur.prenom,"Exemple")
    }
	
	void testtoString() {
		assertTrue(auteur.toString() != null)
	}
}
