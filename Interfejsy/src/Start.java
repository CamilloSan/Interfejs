import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
	
		ArrayList<G³os> zwiezenta = new ArrayList<G³os>();
		
		zwiezenta.add(new Kot());
		zwiezenta.add(new Pies());
		
		for(G³os dzwienk:zwiezenta){
			dzwienk.dajGlos();
			
		}	

	}

}
