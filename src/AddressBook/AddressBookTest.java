package AddressBook;

import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {
    final AddressBook addressBook = new AddressBook();
    final Address address = new Address("Кушелевская дорога", 6, 518);
    final Address address1 = new Address("New Street", 0, 228);
    final Address address2 = new Address("Кушелевская дорога", 6, 519);

    @BeforeEach
    public void start() {
        addressBook.add("name", address);
        addressBook.add("friend", address1);
        addressBook.add("neighbour", address2);
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(address, addressBook.getAddress("name"));
        assertThrows(IllegalArgumentException.class,
                () -> addressBook.add("name", address1));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        addressBook.remove("name");
        assertNull(addressBook.getAddress("name"));
    }

    @org.junit.jupiter.api.Test
    void changeAddress() {
        addressBook.changeAddress("name", address1);
        assertEquals(address1, addressBook.getAddress("name"));
    }

    @org.junit.jupiter.api.Test
    void getAddress() {
        assertEquals(address, addressBook.getAddress("name"));
        assertNull(addressBook.getAddress("1234"));
    }

    @org.junit.jupiter.api.Test
    void getPeopleOnStreet() {
        assertEquals(Arrays.asList("name", "neighbour"),
                addressBook.getPeopleOnStreet("Кушелевская дорога"));
        assertEquals(Collections.emptyList(), addressBook.getPeopleOnStreet(""));
    }

    @org.junit.jupiter.api.Test
    void getPeopleInHouse() {
        assertEquals(Arrays.asList("name", "neighbour"),
                addressBook.getPeopleInHouse("Кушелевская дорога", 6));
        assertEquals(Collections.emptyList(), addressBook.getPeopleInHouse("Москва", 1));
    }
}