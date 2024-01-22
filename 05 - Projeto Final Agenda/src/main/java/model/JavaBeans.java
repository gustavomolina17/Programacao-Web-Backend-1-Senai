/* JavaBeans, são classes que modelam objetos, onde, obrigatoriamente,
 * os atributos são declarados como privados, deve haver um construtor público padrão,
 *  e tem deve haver getters e setters públicos para cada atributo
 * */

package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String fone;
	private String email;

	// Construtor Padrão

	public JavaBeans() {
		super();
	}

	public JavaBeans(String idcon, String nome, String fone, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	public String getIdcon() {
		return idcon;
	}

	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
