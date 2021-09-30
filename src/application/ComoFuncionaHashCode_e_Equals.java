package application;

public class ComoFuncionaHashCode_e_Equals {

	public static void main(String[] args) {

		String a = "Franklyn";
		String b = "Deisy";

		System.out.println(a.equals(b)); // false
		
		System.out.println(a.hashCode()); // -1579213361
		System.out.println(b.hashCode()); // 65912910
	}

}
