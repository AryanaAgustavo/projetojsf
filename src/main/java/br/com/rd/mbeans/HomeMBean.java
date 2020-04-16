package br.com.rd.mbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "homeBean")
public class HomeMBean {

    private String mensagem = "Bem vindo a Home";

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
