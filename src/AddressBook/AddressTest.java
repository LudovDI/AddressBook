package AddressBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void testEquals() {
        Address address = new Address("name", 1,1);
        Address address1 = new Address("name", 1,1);
        Address address2 = new Address("name", 2,2);
        assertEquals(address, address);
        assertEquals(address, address1);
        assertNotEquals(address, address2);
    }

    @Test
    void testHashCode() {
        Address address = new Address("name", 1,1);
        Address address1 = new Address("name", 1,1);
        Address address2 = new Address("name", 2,2);
        assertEquals(address.hashCode(), address.hashCode());
        assertEquals(address.hashCode(), address1.hashCode());
        assertNotEquals(address.hashCode(), address2.hashCode());
        assertNotEquals(address1.hashCode(), address2.hashCode());
    }
}