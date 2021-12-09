package com.nagarro.assignment5;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 * The Class ShoppingShirts.
 *
 * @author mohammadpasha
 */
public class ShoppingTShirts {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String filePath="C:\\Users\\mohammadpasha\\Documents\\java files\\Advance Java\\Assigment Links\\Assigment Links\\combined.csv";
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("COLOUR: ");
		String colour = myObj.nextLine();
		System.out.print("SIZE: ");
		String size = myObj.nextLine();
		System.out.print("GENDER: ");
		String gender = myObj.nextLine();
		System.out.println("SORT BY:\n1)Price\n2)Rating\n3)Both Price & Rating");
		String sort = myObj.nextLine();
		
		readRecord(colour,size,gender,filePath);
	
	}
	
	
	/**
	 * Read record.
	 *
	 * @param colour the colour
	 * @param size the size
	 * @param gender the gender
	 * @param filePath the file path
	 */
	public static void readRecord(String colour,String size,String gender,String filePath) {

		String ID="";String NAME="";String COLOUR="";String GENDER_RECOMMENDATION="";String SIZE="";String PRICE="";String RATING="";String AVAILABILITY="";

		
		try
		{
			Scanner x;
			x=new Scanner(new File(filePath));
			x.useDelimiter("[|\n]");
			ArrayList<String> records=new ArrayList<String>();
			int m=0;
			
			while(x.hasNext()) {
				ID=x.next();
				NAME=x.next();
				COLOUR=x.next();
				GENDER_RECOMMENDATION=x.next();
				SIZE=x.next();
				PRICE=x.next();
				RATING=x.next();
				AVAILABILITY=x.next();
				if(COLOUR.equals(colour) && SIZE.equals(size) && GENDER_RECOMMENDATION.equals(gender) )
				{				
					System.out.println("ID: "+ID+"| NAME: "+NAME+"| COLOUR: "+COLOUR+"| SIZE: "+SIZE+"| GENDER: "+GENDER_RECOMMENDATION+"| PRISE: "+PRICE+"| RATING: "+RATING);
					m++;
//					JOptionPane.showMessageDialog(null,"ID: "+ID+"NAME: "+NAME+"COLOUR: "+COLOUR+"  SIZE: "+SIZE+"  GENDER: "+GENDER_RECOMMENDATION+" PRISE: "+PRICE+" RATING: "+RATING);
				}
			}	
			if(m==0)
			{
				String s = "😀";  
				String context = "Hey ! we dont have this records!Try Other Tshirts ";
		    
				System.out.println(context+s);
			}
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"error");
		}
		

	}

}
