package org.bedu.cms.controller;

import java.util.List;

import org.bedu.cms.model.Contact;
import org.bedu.cms.reporsitory.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class WebController {

    @Autowired
    private ContactRepository repository;
    
    @GetMapping("/")
    public String indexController(Model model){
        Contact empty = new Contact();

        List<Contact> contacts = repository.findAll();

        model.addAttribute("contact", empty);
        model.addAttribute("title", "CMS");
        model.addAttribute("contacts", contacts);

        return "index";
    }
    
}
