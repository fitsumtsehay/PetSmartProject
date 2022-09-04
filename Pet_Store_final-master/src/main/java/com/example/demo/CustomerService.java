package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CustomerService {
    ArrayList<Customer> petOwners = new ArrayList<>();

    public void addCustomer(Customer customer) {
        int count = 0;
        for (int i = 0; i < petOwners.size(); i++) {
            if (petOwners.get(i).getId() == customer.getId()) {
                petOwners.remove(i);
                petOwners.add(i, customer); // replace if it is updating
                i = petOwners.size(); // for immediate evacuation
                count++;
            }
        }
        if (count == 0) {
            petOwners.add(customer);
        }
    }

    public Customer findById(int id) {
        Customer result = new Customer();
        for (int i = 0; i < petOwners.size(); i++) {
            if (petOwners.get(i).getId() == id) {
                result = petOwners.get(i);
                i = petOwners.size(); // for immediate evacuation
            }
        }
        return result;
    }

    public void replaceRecord(Customer customer) {
        int index = customer.getId();
        for (int i = 0; i < petOwners.size(); i++) {

            if (petOwners.get(i).getId() == index) {
                petOwners.remove(i);
                petOwners.add(i, customer);
                i = petOwners.size(); // for immediate evacuation
            }
        }
    }

    public ArrayList<Customer> deleteById(int id) {
        for(int i = 0; i < petOwners.size(); i++){
            if(petOwners.get(i).getId() == id){
                petOwners.remove(i);
                i = petOwners.size();   // evacuate from for loop so fast
            }
        }
        return petOwners;
    }


    public ArrayList<Customer> showPetOwners() {
        return petOwners;
    }

}
