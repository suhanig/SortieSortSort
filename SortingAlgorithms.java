public class SortingAlgorithms {
  
  //public static void main (String[] args) {
	  
  //fork and make your own version
  
  //private int[] arr = int[100];
    
	int [] arr = {99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};  //array to test with  
	  
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
