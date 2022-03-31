package br.com.project.petshopapi.dto;

public class PetShopEmailDTO {

    private String assuntoPadrao;

    private String remetente;
    private String assunto;
    private String corpoEmail;

    public String getAssuntoPadrao() {
        return this.assuntoPadrao;
    }

    public void setAssuntoPadrao(String assuntoPadrao) {
        this.assuntoPadrao = assuntoPadrao;
    }

    public String getRemetente() {
        return this.remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpoEmail() {
        return this.corpoEmail;
    }

    public void setCorpoEmail(String corpoEmail) {
        this.corpoEmail = corpoEmail;
    }

    
}
