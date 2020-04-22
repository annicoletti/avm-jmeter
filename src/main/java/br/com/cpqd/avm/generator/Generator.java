package br.com.cpqd.avm.generator;

import java.util.Random;
import java.util.UUID;

public class Generator {

	private static final Random RANDOM = new Random();

	private static final String VOGAIS[] = { "a", "e", "i", "o", "u" };

	private static final String CONSOANTES[] = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r",
			"s", "t", "v", "x", "w", "y", "z" };

	private static final String EMAILS[] = { "@live.com", "@hotmail.com", "@gmail.com", "@yahoo.com.br", "@outlook.com",
			"@hotmail.com.br", "@bol.com.br", "@terra.com.br" };

	private static final String DDD[] = { "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22" };

	public static String cpf() {
		String template = String.valueOf(Math.abs(RANDOM.nextLong())).substring(0, 9);
		int j, k;

		// primeiro digito
		int alg = 10;
		long total = 0;
		String doc[] = template.split("");
		for (String s : doc) {
			int x = Integer.parseInt(s);
			int r = x * alg;
			total += r;
			alg--;
		}

		int resto = (int) total % 11;
		j = resto <= 1 ? 0 : 11 - resto;

		// segundo digito
		total = 0;
		alg = 11;
		template += j;
		doc = template.split("");
		for (String s : doc) {
			int x = Integer.parseInt(s);
			int r = x * alg;
			total += r;
			alg--;
		}

		resto = (int) total % 11;
		k = resto <= 1 ? 0 : 11 - resto;

		template += k;
		return template;
	}

	public static String someName() {
		String nome = "";
		int a = RANDOM.nextInt(20);
		for (int i = 0; i <= a; i++) {
			boolean x = RANDOM.nextBoolean();
			nome += x ? VOGAIS[RANDOM.nextInt(VOGAIS.length)] : CONSOANTES[RANDOM.nextInt(CONSOANTES.length)];
			if (i == 0) {
				nome = nome.toUpperCase();
			}
		}
		return nome;
	}

	public static String email(String name) {
		return name.concat(EMAILS[RANDOM.nextInt(EMAILS.length)]).toLowerCase();
	}

	public static String id() {
		String id = UUID.randomUUID().toString();
		id += System.currentTimeMillis();
		return id;
	}

	public static String phone() {
		String phone = "(".concat(DDD[RANDOM.nextInt(12)]).concat(")");
		for (int i = 0; i < 9; i++) {
			if (i == 4) {
				phone += "-";
			}
			phone += RANDOM.nextInt(10);
		}
		return phone;
	}
}
