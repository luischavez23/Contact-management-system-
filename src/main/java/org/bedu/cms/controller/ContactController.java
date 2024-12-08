package org.bedu.cms.controller;

import org.bedu.cms.model.Contact;
import org.bedu.cms.reporsitory.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository repository;
    
    @PostMapping("save")
    public String saveContact(@ModelAttribute("contact") Contact newContact){
        repository.save(newContact);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
        }else{
            System.out.println("El usuario con ID: "+ id +" no existe.");
        }
        return "redirect:/";
    }
}

