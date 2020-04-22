package br.com.cpqd.avm.model;

import java.io.Serializable;

public class Guest implements Serializable {

	private static final long serialVersionUID = -3437426788007879904L;

	private String id;

	private String firstName;

	private String lastName;

	private String email;

	private String cpf;

	private String cellPhone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String toString() {
		return "Guest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", cpf="
				+ cpf + "]";
	}

}
