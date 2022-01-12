public class SortingAlgorithms {
  
  //public static void main (String[] args) {
	  
  //fork and make your own version
  
  //private int[] arr = int[100];
    
	int [] arr = {95,85,89,69,76,84,86,65,52,86,46,65,45,59,76,66,22,1,91,86,14,6,68,31,57,50,90,80,8,87,42,76,48,35,91,73,50,9,56,8,76,17,64,3,30,99,5,26,4,24,44,92,63,84,48,58,56,33,13,31,10,90,13,48,24,93,64,60,49,84,76,69,48,12,81,61,58,9,19,34,61,34,58,89,4,78,55,58,30,58,73,36,11,55,14,60,63,48,53,41};  //array to test with  
	  
    public void bubbleSort() {
		
		int count = 0; //introducing counter variable 
	
	int temp = 0; //initializing + introducing the placeholder variable 

	int n = arr.length - 1; //length - 1 because without the -1, during the for loop, it would go over the number of positions we have

	for (int t = 0; t < n; t++ ) { //for loop for printing original array 
			System.out.print(arr[t]);
		} //closes printing for loop
		
		System.out.println();
		
		
		for (int x = 0; x < n; x++ ) { //first for loop
			for (int y = 0; y < n; y++) { //second for loop
				if (arr[y] > arr[y+1]) { //conditional to see if swapping is required
				//swap
				temp = arr[y+1];  //placeholder for number in array at position y + 1
				arr [y+1] = arr [y];  //swapping positions in array
				arr [y] = temp;
				count ++; //add one to the ounter each time loop runs
			} //closes if
		} //closes second for loop
	
		for (int t = 0; t < n; t++ ) { //for loop for printing 
			System.out.print(arr[t] + " ");
		} //closes printing for loop
	
		System.out.println();

		} //closes first for loop
	System.out.print("count: " + count); //print out number of swaps

} //closing bubble sort
	public void insertionSort () {
		
		int count = 0; //introducing count variable 

	int n = arr.length; //setting variable equal to length

	int temp = 0; //initializing + introducing this variable
	int y=0;  //initializing + introducing this variable

	for (int t = 0; t < n; t++ ) { //for loop for printing original array 
			System.out.print(arr[t]);
		} //closes printing for loop
		
		System.out.println();
	
	for (int x = 1; x < n ; x ++ ) { //first for loop
		temp = arr[x]; //placeholder for value in array at position x
		y=x;  
		while (y > 0 && arr[y-1] > temp) { //while loop inside for loop
			arr[y] = arr[y-1]; //switching their positions while temp is the placeholder
			y--;  //to make sure loop ends when needed, doesnt run forever
			count ++; //adding to count after every swap
		}
		arr[y] = temp;
		
		for (int t = 0; t < arr.length; t++ ) { //loop for printing
					System.out.print(arr[t] + " ");
				} //closes for loop
				
				System.out.println();
		
	} //closes first for loop

	System.out.print("count: " + count); //print out number of swaps




	
} //closes insertion sort

	public void selectionSort () {
		
		int count = 0; //introducing count variable
		
		int temp = 0; //initializing + introducing the placeholder variable 
	
	int n = arr.length; //initializing + introducing variable
	
	for (int t = 0; t < n; t++ ) { //for loop for printing original array 
			System.out.print(arr[t]);
		} //closes printing for loop
		
		System.out.println();
	
	for (int x = 0; x < n - 1; x++) { // first for loop
		
		int min = x; //finding minimum in unsorted array
		
		for (int y = x + 1; y < n; y++) { //second for loop
			if (arr[y] < arr[min]) { //conditional to see if swap is necessary
				min = y; 
			
			} //closes if
		} //closes second for loop
		
			//swapping the 2 elements to create sorted array
			temp= arr[min];
			arr[min] = arr [x];
			arr[x] = temp;
			count ++; //adding to count variable after each swap
				
		for (int t = 0; t < n; t++ ) { //for loop for printing 
			System.out.print(arr[t] + " ");
		} //closes printing for loop
	
		System.out.println();
		
	} //closes first for loop

	System.out.print("count: " + count); //printing out number of counts



	} //closes selection sort
}







//}
