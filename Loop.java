public class Loop{
	public static void main(String[] args) {

		byte[] months = {5,7,9,2,4,1,3,6,8,10,};
		short[] booksNo = {10,11,12,13,14,15,16,17,18,19,};
		int[] price = {25,50,75,100,125,150,175,200,225,250};
		double[] balance = {500.21d,500.22d,500.23d,500.24d,500.25d,500.26d,500.27d,500.28d,500.29d,500.47d};
		float[] height = {150.1f,151.2f,152.3f,153.4f,154.5f,155.6f,156.7f,157.8f,158.9f,159.45f};


		for(int i=0;i<10;i++){  // printing all array elements from left to right 
			System.out.println(months[i]);
			System.out.println(booksNo[i]);
			System.out.println(price[i]);
			System.out.println(balance[i]);
			System.out.println(height[i]);
		}

		for(int i=9;i>=0;i--){ 			// from right to left
			System.out.println(months[i]);
			System.out.println(booksNo[i]);
			System.out.println(price[i]);
			System.out.println(balance[i]);
			System.out.println(height[i]);

		}
		for(int i=0;i<10;i=i+2){  // skipping one elments
			System.out.println(months[i]);
			System.out.println(booksNo[i]);
			System.out.println(price[i]);
			System.out.println(balance[i]);
			System.out.println(height[i]);
		}

		for(int i=4;i<10;i++){ // from middle to right
			System.out.println(months[i]);
			System.out.println(booksNo[i]);
			System.out.println(price[i]);
			System.out.println(balance[i]);
			System.out.println(height[i]);
		}

		for(int i=4;i>0;i--){  // from middle to left
			System.out.println(months[i]);
			System.out.println(booksNo[i]);
			System.out.println(price[i]);
			System.out.println(balance[i]);
			System.out.println(height[i]);
		}

		// for left to right

		for(int i=0; i<10; i++){
			System.out.println(months[i]);
		}

		// for right to left

		for(int i = 10; i<0; i--){
			System.out.println(months[i]);
		}

		// from middle to right

		for(int i=4; i<10; i++){
			System.out.println(months[i]);
		}

		// from middle to left 

		for (int i=4; i<0; i--){
			System.out.println(months[i]);
		}


		// skipping one element

		for(int i=0;i<10;i=i+2){
			System.out.println(months[i]);
		}

		



	

		
	}
}