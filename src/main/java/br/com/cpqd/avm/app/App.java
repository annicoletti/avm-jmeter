package br.com.cpqd.avm.app;

import br.com.cpqd.avm.model.Guest;
import br.com.cpqd.avm.tests.Utils;

public class App {
	
	public static void main(String[] args) {
		
		Utils util = new Utils();	
		Guest guest = util.newGuest();
		
		guest.getCpf();
		guest.getEmail();
		guest.getFirstName();
		guest.getId();
		guest.getLastName();
		
		System.out.println(guest.getId());
		
		boolean bla = util.assertions.responseStatus("{\"time\":1995,\"status\":true,\"clientId\":\"32c8031a-86f9-4397-9cf3-a197f744c9a81586308398676\",\"responses\":[\"{\\\"text\\\": \\\"Que coisa boa! =D Fico feliz que tenha gostado do meu atendimento. Quando precisar, Ã© sÃ³ chamar. ;)\\\"}\"],\"dataModel\":null,\"type\":\"SIMPLE_MESSAGE\",\"action\":\"\"}\n" + 
				"");
		String message = "Fico feliz que";
		
		boolean bla2 = util.assertions.responseText("{\"time\":1995,\"status\":true,\"clientId\":\"32c8031a-86f9-4397-9cf3-a197f744c9a81586308398676\",\"responses\":[\"{\\\"text\\\": \\\"Que coisa boa! =D Fico feliz que tenha gostado do meu atendimento. Quando precisar, Ã© sÃ³ chamar. ;)\\\"}\"],\"dataModel\":null,\"type\":\"SIMPLE_MESSAGE\",\"action\":\"\"}\n" + 
				"",message);
		
		System.out.println(bla + "  " + bla2);
	}
}
