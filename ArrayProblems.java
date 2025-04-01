public class ArrayProblems{
	public static void main(String[] args){

		int[] numbers= {1,2,3,4,5,6,7,8,9};

		int result = calculateSum(numbers);
		System.out.println("sum of array:" + result);

		int[] values = {1, 3, 1, 4, 4, 6, 2, 1, 4, 2, 7, 2};

		int outCome = countOfReapeat(numbers , 2);
		System.out.println("count of repeated value is:" + outCome);


		


		



	}

	public static int calculateSum(int[] numbers){

		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum = sum + numbers[i];
		}
		//System.out.println("sum of array:" + sum);

		return sum;
	}


	public static int countOfReapeat(int[] numbers, int givenValue){

		int total = 0;
		for(int i =0; i < numbers.length; i++){
			if(numbers[i] == givenValue){
				total++;
			}
		}
		return total;
	
	}

	


}