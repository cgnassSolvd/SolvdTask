import java.util.Scanner;

public class SortDriver {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = s.nextInt();
		int n = 0;
		int[] array = new int[size];
		System.out.print("Enter " + size + " values: ");
		while (n < array.length && s.hasNext()) {
	        if (s.hasNextInt()) {
	            array[n++] = s.nextInt();
	        }
	    }
		
		sort(array);
		System.out.print("Your sorted array is {");
		for(int i = 0; i < array.length; i++) {
			if(i < array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
	}
	
		
		public static void sort(int[] array) {
			int minIndex;

			int temp = 0;
			if(array.length > 1) {
				for(int i = 0; i < array.length - 1; i++) {
					minIndex = i;
					for(int j = i + 1; j < array.length; j++) {
						if(array[j] < array[minIndex]) {
							minIndex = j;
						}
					}
					if(array[minIndex] < array[i]) {
						temp = array[i];
						array[i] = array[minIndex];
						array[minIndex] = temp; 
					}
				}
			}
		}	
}
