import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
	
		ArrayList<G�os> zwiezenta = new ArrayList<G�os>();
		
		zwiezenta.add(new Kot());
		zwiezenta.add(new Pies());
		
		for(G�os dzwienk:zwiezenta){
			dzwienk.dajGlos();
			
		}	

	}

}
