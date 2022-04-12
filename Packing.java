package packing;
import java.util.Scanner;


	   

	public class Packing
	{
	    public static void main(String args[])
	    {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the number of big cars");
	        int bigcars = input.nextInt();

	        System.out.println("Enter the number of small cars");
	        
	        int smallcars = input.nextInt();

	        int smallspace = (20 * 15) * smallcars;
	        int bigspace = (40 * 15) * bigcars;

	        int parking = (400 * 150);
	        int occupiedspace = smallspace + bigspace;
	        int spacerequired =occupiedspace- parking;

	        System.out.println("Space occupied by big cars = " + bigspace + " cm2");
	        System.out.println("Space occupied by small cars = " + smallspace + " cm2");

	        if(occupiedspace > parking)
	        {
	            System.out.println("no more space");
	            spacerequired=occupiedspace-parking;
	            System.out.println( spacerequired +" square centimeters more area is required!!"); 
	            
	             
	        } else{
	            int remainingspace = parking - occupiedspace;
	            System.out.println("Remaining space "+ remainingspace +" cm2");

	            int number_of_small_cars = remainingspace / 300;
	            System.out.println("Number of small cars that can fit in the remaining space " + number_of_small_cars);

	        }

	    }
	}


