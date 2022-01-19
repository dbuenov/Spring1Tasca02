package n2exercici1;

import javax.naming.NoPermissionException;

public class Programa {

	public static void main(String[] args) {
		ThrowException exc = new ThrowException();
		
		//només m'he de preocupar de l'excepció que llença, l'altra ja està controlada
		try {		
			exc.f();
		}catch (NoPermissionException e){
			System.out.println(e);
		}
		
		//provo amb g() que es la que ja controla f()
		try {
			exc.g();
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
