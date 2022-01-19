package n3exercici1;

public class Fill extends Pare{
	
	public Fill() {
		try {
			new Pare();		
		}catch (Exception e) {
			System.out.println("Capturo l'excepció al Fill");
		}
		
		
		new Pare();
		
		
		
	}	
	
}
