package br.com.project.petshopapi.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080/cafeteria/inicio")
@RestController
@RequestMapping("/**")
public class PetShopController {
    
}
