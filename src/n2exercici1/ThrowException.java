package n2exercici1;

import javax.naming.NoPermissionException;

public class ThrowException{
	
	public void f() throws NoPermissionException{
		try {
			g();
		}catch (IndexOutOfBoundsException e) {
			throw new NoPermissionException();
		}
	}

	
	public void g() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
}

