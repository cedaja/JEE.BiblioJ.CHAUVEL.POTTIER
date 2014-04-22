package jee.pottier.biblioj



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Reservation)
class ReservationTests {

	Reservation reservation = new Reservation(code : 123, dateReservation : "12/12/2012")
	
    void testCreate() {

		def date = reservation.dateReservation.format('yyyy-MM-dd')
		assertEquals(reservation.code,123)
		assertEquals(date,"2012-12-12")
			
	}
	
}
