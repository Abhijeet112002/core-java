public class Parameter{
	public static void main(String[] args) {

		votingAge(18);
		votingAge(17);
		votingAge(24);


		name("L" , "Manjunatha");
		name("Abhijeet" , "Ghorpade");
		name("Siddalinga" , "K");

		studentDetial("Manjunath" , 56744958727l , 9019195736l );
		studentDetial("Abhijeet", 878272798939l , 6363667495l );
		studentDetial("Siddalinga" , 21982487320l , 9092827672l);

		country("India", "Hindi", 28, 1455026815l);
		country("America", "English", 50, 345426571l);
		country("China", "Mandarin", 23 , 1419321278l);


		
	}

	public static void votingAge(int age){                                                                  // using one parameter
 
		if(age >= 18){
			System.out.println(age + ": you are Eligible to Vote");
		}
		else{
			System.out.println(age + ": you are not able to vote");
		}
        
	}


	public static void name(String fname, String lname){                                                     // using two parameters

		System.out.println(fname +" " + lname);

	}

	public static void studentDetial(String name , long usn , long phoneNo){                                  // using Three parameters

		System.out.println("Name :" + name +" " + " USN :" + usn + " " + " phoneNo :" + phoneNo);
	}

	public static void country(String countryName ,String language,  int noOfState , long population){           // using Four parameteres

		System.out.println("Country : " + countryName + " , " + "Language :" + language + ", " + "No Of States :" + noOfState +" ," + "Area of country :" + population);

	}
	
}