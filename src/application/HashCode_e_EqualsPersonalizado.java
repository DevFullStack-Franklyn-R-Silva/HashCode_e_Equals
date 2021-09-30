package application;

import entities.Client;

public class HashCode_e_EqualsPersonalizado {

	public static void main(String[] args) {

		Client c1 = new Client("Franklyn", "franklyn@gmail.com");
		Client c2 = new Client("Deisy", "deisy@gmail.com");
		
		Client c3 = new Client("Deisy", "deisy2003@gmail.com");
		Client c4 = new Client("Deisy", "deisy2003@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		
		System.out.println(c1.hashCode()); // -370416464
		System.out.println(c2.hashCode()); // 1843606288
		System.out.println(c3.hashCode()); // -1300680017
		
		System.out.println(c1.equals(c2)); // false
		
		System.out.println(c2.equals(c3)); // false
		
		System.out.println(c3.equals(c4)); // true
		
		System.out.println(c3 == c4); // false, aqui não vai comparar o conteúdo,
  									  // mas as referencia de memoria.
		
		System.out.println(s1 == s2); /** true, porque ele dar um tratamento especial para literais.
		                               A não ser que crie assim String s2 = new String("Test");
			                           Ai força, uma criacao de um objeto, retorna false.
			                           */
	}

}
