package n1exercici5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		
		int i = 5;
		boolean excepcio = true;

		while(excepcio) {
			try {
				System.out.println(array.get(i));
				
				//aquesta linea nom�s s'accedeix si no hi ha excepci�
				excepcio = false;
				System.out.println("Ja he pogut accedir a una posici� correcta de l'array");
			}catch (Exception e){
				System.out.println("No puc accedir a aquesta posici� de l'Array");
			}finally {
				i--;
			}
		}			
	}
}


