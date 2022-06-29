package intervi;

public class Immut {
	public static void msin(String[] args) {
		String name="Java";
		String name1=new String("Java");
		String name2="Java";
		boolean a=name==name1;
		boolean b=name==name2;
		System.out.println(a);
		System.out.println(b);
		
	}

}
