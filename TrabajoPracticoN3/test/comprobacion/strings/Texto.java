package comprobacion.strings;

public class Texto {
	
	public static void main(String[] args) {
		
		String a = "abc";
		String s= a;
		//String t;
		
		System.out.println(s.length()); 
		// System.out.print(t.length()); no esta instanciada, es decir no tiene nada
		//System.out.print(a+1); error de tipos 
		System.out.println(a.toUpperCase());
		System.out.println("Libertad".indexOf("r"));
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2,4));
		System.out.println((a.length() + a).startsWith("a"));
		System.out.println(s == a);
		System.out.println(a.substring(1,3).equals("bc"));
	}
	
	
	
	
	
	
	
	
	
	
}
