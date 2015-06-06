package test;

public class Jose3 extends Jose{
	private Integer edad = 30;
	
	public Jose3() {
		
	}
	
	public Jose3(Integer cuentas, Integer edad) {
		this.edad=edad;
		this.cuentas=cuentas;
	}

	@Override
	public void setCuentas(Integer cuentas) {
		
		super.setCuentas(cuentas +100);
	}
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
