package br.com.prova2.util;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

public class JSFUtil {

	public static void msgSucesso(String mensagem) {

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, mensagem);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);
		

	}

	public static void msgErro(String mensagem) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, mensagem);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);

	}

}

    