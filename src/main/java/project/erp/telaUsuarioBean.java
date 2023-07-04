package project.erp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class telaUsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> cidades = new ArrayList<String>();
	
	private String razaoSocial;
	private int cnpj;
	private String cidade;
	private String modalidade;
	private Date dataContrato;
	private String metodoPagamento;
	
	public telaUsuarioBean() {
		cidades.add("Belo Horizonte");
		cidades.add("Belém");
		cidades.add("Brasília	");
		cidades.add("Curitiba");
		cidades.add("Fortaleza");
		cidades.add("Gramado");
		cidades.add("Manaus");
		cidades.add("Fortaleza");
		cidades.add("Ouro preto");
		cidades.add("Recife");
		cidades.add("Rio de Janeiro");
		cidades.add("São Paulo");
	}
	
	public List<String> sugerirCidades(String consulta) {
		List<String> cidadesSugeridos = new ArrayList<String>();
		
		for (String cidade : this.cidades) {
			if (cidade.toLowerCase().startsWith(consulta.toLowerCase())) {
				cidadesSugeridos.add(cidade);
			}
		}
		
		return cidadesSugeridos;
	}
	
	public void cadastrar() {
		infoCadastro();
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro Efetuado!"));
	}
	
	public void infoCadastro() {
		System.out.println("Razão Social: " + this.razaoSocial);
		System.out.println("CPNJ: " + this.cnpj);
		System.out.println("Cidade de contrato: " + this.cidade);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Data do contrato: " + this.dataContrato);
		System.out.println("Método de pagemento: " + this.metodoPagamento);
	}
	
	/* Getters e Setters */
	
	public Date getDataHoje() {
		return new Date();
	}
	
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
}
