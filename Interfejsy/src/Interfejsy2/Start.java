package Interfejsy2;

import java.util.ArrayList;
import java.util.Collections;

public class Start {

	public static void main(String[] args) {
	
		ArrayList<Employee> pracownicy = new ArrayList<Employee>();
		
		pracownicy.add(new Employee(2,"kamil"));
		pracownicy.add(new Employee(4,"Mak"));
		pracownicy.add(new Employee(3,"zak"));
		
		
		Collections.sort(pracownicy);
		 
        System.out.println("\nPosortowane: ");
        for(Employee czlowiek : pracownicy) {
            System.out.println(czlowiek.imie);
        }
		
		

	}

}
