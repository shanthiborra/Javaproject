package xyz;

public class ReverseString {

	public static void main(String[] args) {
		String original = "Shanthi";
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println(original);
		System.out.println(reversed);
	}

}