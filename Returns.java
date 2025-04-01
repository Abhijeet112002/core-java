public class Returns{

	public static void main(String[] args) {
		add();

		short result = sub();
		System.out.println(result);

		int returnedValue = division();
		System.out.println(returnedValue);

		byte returnValue = multiplication();
		System.out.println(returnValue);

		long returnsValue = adds();
		System.out.println(returnsValue);

		float results = substraction(12.2f,6.3f);
		System.out.println(results);

		double value = divide();
		System.out.println(value);

		char values = addition('a');
		System.out.println(values);
	}

	public static void add(){
		int a = 10;
		int b = 32;
		int c = a + b;
		System.out.println(c);

	}

	public static short sub(){
		short z = 2;
		System.out.println(z);
		return z;

	}

	public static int division(){

		int as = 100;
		int ad = 5;
		int md = as / ad;

		System.out.println(md);
		return md;

	}

	public static byte multiplication(){

		byte abhi = 2;
		byte manju = 2;
		byte siddu = 2 * 2;
		System.out.println(siddu);
		return siddu;

	}

	public static long adds(){

		long f= 11212l;
		long n = 13424l;
		long w = f + n;
		System.out.println(w);
		return w;

	}

	public static float substraction(float a, float b){
		
		float c = a-b;
		return c;

	}

	public static double divide(){
		double r = 50.234;
		double p = 10.233;
		double u = r/p;
		return u;
	}

	public static char addition(char section){

		char a = 'a';

		
		return a;

	}

	


	
	
	
}