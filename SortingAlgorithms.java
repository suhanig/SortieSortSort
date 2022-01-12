public class SortingAlgorithms {
  
  //public static void main (String[] args) {
	  
  //fork and make your own version
  
  //private int[] arr = int[100];
    
	int [] arr = {7, 2, 8, 1, 9, 5, 6};  //array to test with  
	  
    public void bubbleSort() {
	
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
			} //closes if
		} //closes second for loop
	
		for (int t = 0; t < n; t++ ) { //for loop for printing 
			System.out.print(arr[t]);
		} //closes printing for loop
	
		System.out.println();

		} //closes first for loop


} //closing bubble sort
	public void insertionSort () {

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
		}
		arr[y] = temp;
		
		for (int t = 0; t < arr.length; t++ ) { //loop for printing
					System.out.print(arr[t]);
				} //closes for loop
				
				System.out.println();
		
	} //closes first for loop






	
} //closes insertion sort

	public void selectionSort () {
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
				
		for (int t = 0; t < n; t++ ) { //for loop for printing 
			System.out.print(arr[t]);
		} //closes printing for loop
	
		System.out.println();
		
	} //closes first for loop




	} //closes selection sort
}







//}


