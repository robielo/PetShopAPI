package br.com.project.petshopapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.project.petshopapi.dto.PetShopEmailDTO;
import br.com.project.petshopapi.service.EnviaEmailService;

@CrossOrigin(origins = "http://localhost:8080/api/petshop/email")
@RestController
@RequestMapping("/**")
public class PetShopEmailController {

    @Autowired
    EnviaEmailService enviaEmailService;

    private static Logger logger = LoggerFactory.getLogger(PetShopEmailController.class);


    @PostMapping(path = "/enviar")
    public ResponseEntity<?> enviaemail(@RequestBody PetShopEmailDTO petShopEmailDTO){
        try{

            enviaEmailService.enviaEmail(petShopEmailDTO);
            return ResponseEntity.ok(enviaEmailService);

        }catch(Exception e){
            logger.error("PetShopEmailController - Falha ao enviar E-mail!", e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(enviaEmailService);
        }
    }
  




}
