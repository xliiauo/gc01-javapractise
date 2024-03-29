import java.util.ArrayList;
import java.util.Scanner;


public class ArrayElementRemoval {

	public static void main(String[] args) {
		String[] arr = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
		for (String string : arr) {
			System.out.print(string + " ");
		}
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		/*
		arr = remElement(arr, num);
		for (String string : arr) {
			System.out.print(string + " ");
		}
		*/
		
		//use array list
		for (String arr2 : remElement(arr, num)) { //for each to print array/arraylist, remember elements inside are string not string array
			System.out.print(arr2 + " ");
		}


	}

	public static String[] remElement(String[] arr, int num){
		arr[num] = "\b";
		return arr;
	}
	
	public static ArrayList<String> remElement2(String[] arr, int num){
		ArrayList<String> arr2 = new ArrayList<String>();
		for (String array : arr) {
			arr2.add(array);
		}
		arr2.remove(num);
		return arr2;
	}

}
