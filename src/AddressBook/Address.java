package AddressBook;

import java.util.Objects;

public class Address {
    String street;
    Integer house;
    Integer apartment;

    public Address(String myStreet, Integer myHouse, Integer myApartment) {
        street = myStreet;
        house = myHouse;
        apartment = myApartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(house, address.house) &&
                Objects.equals(apartment, address.apartment);
    }
}
