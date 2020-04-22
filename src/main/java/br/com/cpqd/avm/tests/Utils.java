package br.com.cpqd.avm.tests;

import br.com.cpqd.avm.generator.Generator;
import br.com.cpqd.avm.model.Guest;

public class Utils {

	public Assertion assertions = new Assertion();

	public Guest newGuest() {
		Guest guest = new Guest();

		guest.setId(Generator.id());
		guest.setFirstName(Generator.someName());
		guest.setLastName(Generator.someName());
		guest.setEmail(Generator.email(guest.getLastName()));
		guest.setCpf(Generator.cpf());
		guest.setCellPhone(Generator.phone());

		return guest;
	}

}
