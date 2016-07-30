package Interfejsy2;

public class Employee extends Person implements Comparable<Person>{
	
	public Employee(int id,String imie){
		super(id,imie);
	}

	@Override
	public int compareTo(Person o) {
		int porownaneImie = imie.compareTo(o.imie);
		 
        if(porownaneImie == 0) {
            return imie.compareTo(o.imie);
        }
        else {
            return porownaneImie;
        }
	}
	

}
