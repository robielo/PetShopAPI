package br.com.project.petshopapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.petshopapi.dto.PetShopEmailDTO;
import lombok.AllArgsConstructor;

import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EnviaEmailService 
 {
	@Autowired
    private JavaMailSender javaMailSender;

    private final String DESTINATARIO = "Eu <lucas.nds@hotmail.com>";
    private final String REMETENTE = "PetShop <devnovais@gmail.com>";

	
	public void enviaEmail(PetShopEmailDTO petShopEmailDTO) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(DESTINATARIO);
        msg.setFrom(REMETENTE);
        msg.setSubject(petShopEmailDTO.getAssuntoPadrao());

        msg.setText("Remetente: " + petShopEmailDTO.getRemetente()
                    +"\nAssunto: " + petShopEmailDTO.getAssunto()
                    +"\nMensagem: "
                    +"\n\n" + petShopEmailDTO.getCorpoEmail());

        javaMailSender.send(msg);

    }
    
}