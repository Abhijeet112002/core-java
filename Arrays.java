public class Arrays{
	public static void main(String[] args) {

		byte[] months = {5,7,9,2,4,1,3,6,8,10,}; // creating an arrays by using literal method

		// by byte datatype

		months[3] = 11; // resizing a values 
		months[8] = 12;
		months[1] = 4;

		System.out.println(months[0]);// accessing a array value
		System.out.println(months[1]);
		System.out.println(months[2]);
		System.out.println(months[3]);
		System.out.println(months[4]);
		System.out.println(months[5]);
		System.out.println(months[6]);
		System.out.println(months[7]);
		System.out.println(months[8]);
		System.out.println(months[9]);

		byte[] marks = new byte[10]; //creating an array by using keyword method 

		marks[0] = 12;
		marks[1] = 05;
		marks[2] = 07;
		marks[3] = 44;
		marks[4] = 06;
		marks[5] = 03;
		marks[6] = 10;
		marks[7] = 01;
		marks[8] = 02;
		marks[9] = 11;

		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		System.out.println(marks[6]);
		System.out.println(marks[7]);
		System.out.println(marks[8]);
		System.out.println(marks[9]);



		// by short datatype

       short[] booksNo = {10,11,12,13,14,15,16,17,18,19,};
       booksNo[3] = 32;
       booksNo[6] = 83;
       booksNo[9] = 29;

       System.out.println(booksNo[0]);
       System.out.println(booksNo[1]);
       System.out.println(booksNo[2]);
       System.out.println(booksNo[3]);
       System.out.println(booksNo[4]);
       System.out.println(booksNo[5]);
       System.out.println(booksNo[6]);
       System.out.println(booksNo[7]);
       System.out.println(booksNo[8]);
       System.out.println(booksNo[9]);

       short[] booksYear = new short[10];

       booksYear[0] = 2001;
       booksYear[1] = 2002;
       booksYear[2] = 2003;
       booksYear[3] = 2004;
       booksYear[4] = 2005;
       booksYear[5] = 2006;
       booksYear[6] = 2007;
       booksYear[7] = 2008;
       booksYear[8] = 2009;
       booksYear[9] = 2010;

       System.out.println(booksYear[0]);
       System.out.println(booksYear[1]);
       System.out.println(booksYear[2]);
       System.out.println(booksYear[3]);
       System.out.println(booksYear[4]);
       System.out.println(booksYear[5]);
       System.out.println(booksYear[6]);
       System.out.println(booksYear[7]);
       System.out.println(booksYear[8]);
       System.out.println(booksYear[9]);


       //by int datatype

       int[] price = {25,50,75,100,125,150,175,200,225,250};
       price[3] = 454;
       price[6] = 347;
       price[8] = 834;

       System.out.println(price[0]);
       System.out.println(price[1]);
       System.out.println(price[2]);
       System.out.println(price[3]);
       System.out.println(price[4]);
       System.out.println(price[5]);
       System.out.println(price[6]);
       System.out.println(price[7]);
       System.out.println(price[8]);
       System.out.println(price[9]);


       int[] newPrice = new int[10];

       newPrice[0] = 30;
       newPrice[1] = 60;
       newPrice[2] = 90;
       newPrice[3] = 120;
       newPrice[4] = 150;
       newPrice[5] = 180;
       newPrice[6] = 210;
       newPrice[7] = 240;
       newPrice[8] = 270;
       newPrice[9] = 300;

       System.out.println(newPrice[0]);
       System.out.println(newPrice[1]);
       System.out.println(newPrice[2]);
       System.out.println(newPrice[3]);
       System.out.println(newPrice[4]);
       System.out.println(newPrice[5]);
       System.out.println(newPrice[6]);
       System.out.println(newPrice[7]);
       System.out.println(newPrice[8]);
       System.out.println(newPrice[9]);
       
       

       //by long datatype

       long[] atmPin = {1234l,2345l,2532l,7348l,5363l,2437l,2638l,4362l,2436l,2327l};
       atmPin[0] = 3736l;
       atmPin[7] = 2000l;
       atmPin[5] = 2838l;

       System.out.println(atmPin[0]);
       System.out.println(atmPin[1]);
       System.out.println(atmPin[2]);
       System.out.println(atmPin[3]);
       System.out.println(atmPin[4]);
       System.out.println(atmPin[5]);
       System.out.println(atmPin[6]);
       System.out.println(atmPin[7]);
       System.out.println(atmPin[8]);
       System.out.println(atmPin[9]);

       long[] newAtmPin = new long[10];

       newAtmPin[0] = 261728l;
       newAtmPin[1] = 461728l;
       newAtmPin[2] = 661728l;
       newAtmPin[3] = 561728l;
       newAtmPin[4] = 161728l;
       newAtmPin[5] = 361728l;
       newAtmPin[6] = 761728l;
       newAtmPin[7] = 861728l;
       newAtmPin[8] = 961728l;
       newAtmPin[9] = 267728l;

       System.out.println(newAtmPin[0]);
       System.out.println(newAtmPin[1]);
       System.out.println(newAtmPin[2]);
       System.out.println(newAtmPin[3]);
       System.out.println(newAtmPin[4]);
       System.out.println(newAtmPin[5]);
       System.out.println(newAtmPin[6]);
       System.out.println(newAtmPin[7]);
       System.out.println(newAtmPin[8]);
       System.out.println(newAtmPin[9]);

       //by float datatype

       float[] height = {150.1f,151.2f,152.3f,153.4f,154.5f,155.6f,156.7f,157.8f,158.9f,159.45f};

       height[0] = 160.2f;
       height[2] = 161.6f;
       height[7] = 162.9f;

       System.out.println(height[0]);
       System.out.println(height[1]);
       System.out.println(height[2]);
       System.out.println(height[3]);
       System.out.println(height[4]);
       System.out.println(height[5]);
       System.out.println(height[6]);
       System.out.println(height[7]);
       System.out.println(height[8]);
       System.out.println(height[9]);

       float[] weight = new float[10];

       weight[0] = 70.1f;
       weight[1] = 71.2f;
       weight[2] = 72.3f;
       weight[3] = 73.4f;
       weight[4] = 74.5f;
       weight[5] = 75.6f;
       weight[6] = 76.8f;
       weight[7] = 77.7f;
       weight[8] = 78.9f;
       weight[9] = 79.53f;

       System.out.println(weight[0]);
       System.out.println(weight[1]);
       System.out.println(weight[2]);
       System.out.println(weight[3]);
       System.out.println(weight[4]);
       System.out.println(weight[5]);
       System.out.println(weight[6]);
       System.out.println(weight[7]);
       System.out.println(weight[8]);
       System.out.println(weight[9]);



       // by double datatype

       double[] balance = {500.21d,500.22d,500.23d,500.24d,500.25d,500.26d,500.27d,500.28d,500.29d,500.47d};

       balance[2] = 1000.36d;
       balance[3] = 1000.37d;
       balance[8] = 1000.52d;

       System.out.println(balance[0]);
       System.out.println(balance[1]);
       System.out.println(balance[2]);
       System.out.println(balance[3]);
       System.out.println(balance[4]);
       System.out.println(balance[5]);
       System.out.println(balance[6]);
       System.out.println(balance[7]);
       System.out.println(balance[8]);
       System.out.println(balance[9]);

       double[] newBalance = new double[10];

       newBalance[0] = 1500.23d;
       newBalance[1] = 2500.23d;
       newBalance[2] = 3500.23d;
       newBalance[3] = 4500.23d;
       newBalance[4] = 5500.23d;
       newBalance[5] = 8500.23d;
       newBalance[6] = 3500.23d;
       newBalance[7] = 9500.23d;
       newBalance[8] = 4900.23d;
       newBalance[9] = 1580.23d;

       System.out.println(newBalance[0]);
       System.out.println(newBalance[1]);
       System.out.println(newBalance[2]);
       System.out.println(newBalance[3]);
       System.out.println(newBalance[4]);
       System.out.println(newBalance[5]);
       System.out.println(newBalance[6]);
       System.out.println(newBalance[7]);
       System.out.println(newBalance[8]);
       System.out.println(newBalance[9]);


       // by char datatype

       char[] section = {'a','b','c','d','f','e','k','w','z','p'};

       section[0] = 'A';
       section[8] = 'Y';
       section[5] = 'R';

       System.out.println(section[0]);
       System.out.println(section[1]);
       System.out.println(section[2]);
       System.out.println(section[3]);
       System.out.println(section[4]);
       System.out.println(section[5]);
       System.out.println(section[6]);
       System.out.println(section[7]);
       System.out.println(section[8]);
       System.out.println(section[9]);

       char[] grade = new char[10];

       grade[0] = 'A';
       grade[1] = 'B';
       grade[2] = 'C';
       grade[3] = 'H';
       grade[4] = 'S';
       grade[5] = 'L';
       grade[6] = 'U';
       grade[7] = 'W';
       grade[8] = 'O';
       grade[9] = 'T';

       System.out.println(grade[0]);
       System.out.println(grade[1]);
       System.out.println(grade[2]);
       System.out.println(grade[3]);
       System.out.println(grade[4]);
       System.out.println(grade[5]);
       System.out.println(grade[6]);
       System.out.println(grade[7]);
       System.out.println(grade[8]);
       System.out.println(grade[9]);
       

       
       


       

       
        








       









	}
}





