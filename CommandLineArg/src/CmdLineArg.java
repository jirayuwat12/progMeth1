import java.math.*;
public class CmdLineArg {

	public static void main(String[] args) {
//		double cel = Double.parseDouble(args[0]);
//		System.out.println("F >>" + (cel * (9/5) - 32));
		System.out.println("H>>" + (Math.sin(Math.toRadians(Double.parseDouble(args[0])) * Double.parseDouble(args[1]))));
		System.out.println("W>>" + (Math.cos(Math.toRadians(Double.parseDouble(args[0])) * Double.parseDouble(args[1]))));
		
	}

}
