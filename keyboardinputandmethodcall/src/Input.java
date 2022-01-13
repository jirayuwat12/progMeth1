import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		float a = kbd.nextFloat();
		float b = kbd.nextFloat();
		b = (float)Math.toRadians(b);
		System.out.println("sin b x a >>" + Math.sin(b)*a);
		System.out.println("cos b x a >>" + Math.cos(b)*a);
		
		
		kbd.close();
	}

}
