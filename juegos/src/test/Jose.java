package test;

public class Jose {
	
	public static String NOMBRE="jsoe";
	
	protected Integer cuentas = 3;	
	

	public Jose() {
		super();
	}

	public Jose(Integer cuentas) {
		super();
		this.cuentas = cuentas;
	}

	public Integer getCuentas() {
		return cuentas;
	}

	public void setCuentas(Integer cuentas) {
		this.cuentas = cuentas;
	}
	
	public static void printCuentas(Integer vvvv){
		System.out.println( NOMBRE + ": cuentas:"+vvvv);
	}

}
