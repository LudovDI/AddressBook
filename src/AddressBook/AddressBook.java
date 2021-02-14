package AddressBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AddressBook {
    private final HashMap<String, Address> addressBook;

    public AddressBook() {
        addressBook = new HashMap<>();
    }

    public void add(String name, Address address) {
        if (addressBook.containsKey(name)) throw new IllegalArgumentException("Wrong format");
        addressBook.put(name, address);
    }

    public void remove(String name) {
        addressBook.remove(name);
    }

    public void changeAddress(String name, Address address) {
        addressBook.replace(name, address);
    }

    public Address getAddress(String name) {
        return addressBook.get(name);
    }

    public List<String> getPeopleOnStreet(String street) {
        List<String> list = new LinkedList<>();
        for (String name: addressBook.keySet()) {
            if (addressBook.get(name).street.equals(street)) list.add(name);
        }
        return list;
    }

    public List<String> getPeopleInHouse(Integer house) {
        List<String> list = new LinkedList<>();
        for (String name: addressBook.keySet()) {
            if (addressBook.get(name).house.equals(house)) list.add(name);
        }
        return list;
    }
}
