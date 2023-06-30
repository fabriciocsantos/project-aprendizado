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
	private int cnpj;
	
	
	public void cadastrar() {
		infoCadastro();
	}
	
	public void infoCadastro() {
		System.out.println("Razão Social: " + this.razaoSocial);
		System.out.println("CPNJ: " + this.cnpj);
	}
	
	/* Getters e Setters */
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}	
	
}
