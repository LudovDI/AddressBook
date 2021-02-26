package AddressBook;

import java.util.Objects;

public class Address {
    private final String street;
    private final Integer house;
    private final Integer apartment;

    public Address(String myStreet, Integer myHouse, Integer myApartment) {
        street = myStreet;
        house = myHouse;
        apartment = myApartment;
    }

    public String getStreet() {
        return street;
    }

    public Integer getHouse() {
        return house;
    }

    public Integer getApartment() {
        return apartment;
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

    @Override
    public int hashCode() {
        return Objects.hash(street, house, apartment);
    }
}
