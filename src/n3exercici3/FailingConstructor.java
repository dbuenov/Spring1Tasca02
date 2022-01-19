package n3exercici3;

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
			n.finalitza();
			m.finalitza();
		}
	}
	
	
}
