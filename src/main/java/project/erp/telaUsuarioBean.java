package project.erp;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class telaUsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String razaoSocial;
	
	
	
	public void cadastrar() {
		infoCadastro();
	}
	
	public void infoCadastro() {
		System.out.println("Razão Social: " + this.razaoSocial);
	}
	
	/* Getters e Setters */
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}	
	
}
