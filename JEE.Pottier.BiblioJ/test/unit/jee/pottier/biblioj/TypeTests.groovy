package jee.pottier.biblioj



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Type)
class TypeTests {

	Type type = new Type(intitule : "essai")
	
    void testCreate() {
	
		assertEquals(type.intitule,"essai")
    }
}
