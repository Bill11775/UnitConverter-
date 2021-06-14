package main;

import java.util.Scanner;

public class Converter {
	  static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
    
        
        int menuSelection;
      
       
        
    while(true) {
        System.out.println("Please select an option:");
        System.out.println("1. Cups to Teaspoons");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. US Gallons to Imperial Gallons");
        System.out.println("4. Quit");
        
        
        menuSelection = in.nextInt();
        if (menuSelection == 1) {
            int cups;
            System.out.println("You selected cups to teaspoons");
            System.out.println("How many cups do you have?");
            cups = in.nextInt();
            int teaspoons = cups * 48;
            System.out.println( cups + " cups will convert to " + teaspoons + " teaspoons");
            
            
            	
          
            
        } else if (menuSelection == 2) {
            int miles;
            	System.out.println("You selected Miles to Kilometers");
            	System.out.println("Enter the amout of Miles to convert to Kilometers");
            	miles = in.nextInt();
            	double kilometers = miles * 1.609;
            
            
        } else if (menuSelection == 3) {
            int usGallons;
            System.out.println("You selected US Gallons to Imperial Gallons");
            System.out.println("Enter the amout of Gallons to convert to Imperial Gallons");
            usGallons = in.nextInt();
            Double imGallons = usGallons / 1.201;
            
           
            
        } else {
            System.out.println("exit");
      
            in.close();
            
    }
	}}}
  
