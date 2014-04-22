package jee.pottier.biblioj



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Livre)
class LivreTests {
	
	Livre livre = new Livre(titre : "Exemple de titre", nbEx : 1, nbExDispos : 2)

    void testCreate() {
	
		assertEquals(livre.titre,"Exemple de titre")
		assertEquals(livre.nbEx,1)
		assertEquals(livre.nbExDispos,2)
    }
	
	void testToString() {
		
		assertTrue(livre.toString() != null)
	}
}
