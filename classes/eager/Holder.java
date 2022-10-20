package eager;

public class Holder {
    private static class HolderInstance {
		public static Holder instancia = new Holder();
	}
	
	private Holder() {
		super();
	}
	
	public static Holder getInstancia() {
		return HolderInstance.instancia;
	}
}
