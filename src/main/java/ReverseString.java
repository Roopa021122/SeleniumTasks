
public class ReverseString {

	public static void main(String[] args) {
		String input = " Fadil is batch cordinator";
		
		//reverse string by word
		String[] words =  input.split(" ");
		    String output = "";
		    for (int i = words.length - 1; i >= 0; i--) {
		    	output = output + words[i] + " ";
		    }
		    System.out.println("Reversed string by word is::  "+output);
		   
		    
		    //reverse string by letter
		   
			String Reverse ="";
			for (int i= input.length()-1;i>=0;i--)
				Reverse = Reverse+ input.charAt(i);
			{
				System.out.println("Reversed String by letter is ::  "+Reverse);
			}
			
			
			//to find min and max numbers
			int[] numbers = {12, 5, 8, 19, 1, 23, 7};
	        
	        int min = numbers[0];
	        int max = numbers[0];
	        
	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }
	        
	        System.out.println("Minimum number: " + min);
	        System.out.println("Maximum number: " + max);
	    
	}}


