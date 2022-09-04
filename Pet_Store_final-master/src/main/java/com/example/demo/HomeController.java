package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    CustomerService customerService = new CustomerService();

    @RequestMapping("/")
    public String loadCustomerForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer_form";
    }


    @PostMapping("/petform")
    public String loadPetForm(@ModelAttribute Customer customer, Model model){
        model.addAttribute("customer", customer);
            return "pet_form";
    }

    @PostMapping("/addPet")
    public String addPet(@ModelAttribute Customer customer, Model model){

        int idx = customerService.petOwners.size() + 1;
        customer.setId(idx);

        customerService.addCustomer(customer);
        model.addAttribute("petOwners", customerService.showPetOwners());
        return "allpets";
    }

    @RequestMapping("/showdogs")
    public String showDogsPage(Model model){
        model.addAttribute("dogOwners", customerService.showPetOwners());
        return "show_dogs";
    }

    @RequestMapping("/showcats")
    public String showCatsPage(Model model){
        model.addAttribute("catOwners", customerService.showPetOwners());
        return "show_cats";
    }

    @RequestMapping("/showall")
    public String showPetsPage(Model model){
        model.addAttribute("petOwners", customerService.showPetOwners());

        return "allpets";
    }

    @RequestMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer, Model model) {
        int id = customer.getId();
        model.addAttribute("customer", customerService.findById(id));
        return "update_form";
    }

    @PostMapping("/update_process")
    public String loadUpdatedPage(@ModelAttribute Customer customer, Model model){
        customerService.replaceRecord(customer);
        model.addAttribute("petOwners", customerService.showPetOwners());
        return "allpets";
    }

    @RequestMapping("/delete")
    public String delCustomer(@ModelAttribute Customer customer, Model model){
        int id = customer.getId();
        model.addAttribute("petOwners", customerService.deleteById(id));
        return "allpets";
    }

}   // end of HomeController Class
