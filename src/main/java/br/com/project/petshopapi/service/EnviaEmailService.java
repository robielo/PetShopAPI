package br.com.project.petshopapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EnviaEmailService 
 {

    @Autowired 
    private JavaMailSender mailSender;

    private static Logger logger = LoggerFactory.getLogger(EnviaEmailService.class);

    
      public void enviaEmail(String destinatario,String remetente,String assunto,String corpoemail){
       try{
            MimeMessage mail = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper( mail );
            helper.setTo(destinatario);
            helper.setFrom("PetShop <"+remetente+">");
            helper.setSubject(assunto);
            helper.setText(gerarCorpoEmail(corpoemail), true);
            mailSender.send(mail);

       }catch(Exception e){
        logger.error("ERROOOOO SERVICE", e);
       }
    }



    public String gerarCorpoEmail(String corpoemail){
        String retorno = 
             " <html>"
            +"      <body>"
            +"          <h1><center><b>Bem vindo(a) ao Petshop!</b></center></h1>"
            +"          "+corpoemail
    
            +"      </body>"
            +"</html>";

        return retorno;

    }
    
}