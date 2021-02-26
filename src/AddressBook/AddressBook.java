package AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Address> e: addressBook.entrySet()) {
            String name = e.getKey();
            Address address = e.getValue();
            if (address.getStreet().equals(street)) list.add(name);
        }
        return list;
    }

    public List<String> getPeopleInHouse(String street, Integer house) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Address> e: addressBook.entrySet()) {
            String name = e.getKey();
            Address address = e.getValue();
            if (address.getStreet().equals(street) && address.getHouse().equals(house)) list.add(name);
        }
        return list;
    }
}
