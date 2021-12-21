package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Triangle x,y;
		x= new Triangle();
		y= new Triangle();
		
		
		System.out.println("insira os dados dos triangulos");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		
		System.out.println("insira os dados dos triangulos");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		
		double areax=x.area();
		
		double areay= y.area();
		
		System.out.printf("Triangle x area: %.4f%n", areax);
		System.out.printf("Triangle y area: %.4f%n",areay);
		
		if(areax> areay) {
			System.out.println("maior area x");
		
		}
		else {
			System.out.println("maior area y");
		}
		
			
			
			
			
			
		sc.close();
	
	}
}
