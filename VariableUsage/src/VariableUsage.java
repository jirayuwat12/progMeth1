
public class VariableUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int [] a_array = new int [10];
//		int [] a_array = {1,2,3,4,5,6,7,8,9,10};
//		a_array.lenght
		final int a_const = 2;
		
		double b=1.0f;
		double [] b_array = new double [10];
		final double b_const = 2.0f;
		
		String c = "jirayuwat";
		String [] c_array = new String [10];
		final String c_const = "jirayuwat";
		
		System.out.print(a+"\n"+b + "\n"+ c);
		System.out.println(a_const + "\n" + b_const + "\n"+ c_const);
	}

}
