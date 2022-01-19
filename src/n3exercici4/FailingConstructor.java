package n3exercici4;

public class FailingConstructor {
	public FailingConstructor() {
		System.out.println("Comença constructor");
		Nova n = new Nova();
		Nova m = null;
		try {
			//throw new Exception();
		}catch(Exception e) {
			m = new Nova();			
		}finally {
			this.finalitza(n, m);
		}
	}
	
	public void finalitza(Nova n, Nova m) {
		n.finalitza();
		try {
			m.finalitza();
		}catch(NullPointerException e) {
			System.out.println("No arribo a crear l'objecte m, no el puc tancar");
		}
		
	}	
}
