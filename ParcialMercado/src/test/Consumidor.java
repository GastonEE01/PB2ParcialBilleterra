package test;

public class Consumidor implements Comparable<Consumidor> {

	private final Integer DNI_ESPERADO;
	private final String NOMBRE_ESPERADO;

	public Consumidor(Integer DNI_ESPERADO, String NOMBRE_ESPERADO) {
		this.DNI_ESPERADO = DNI_ESPERADO;
		this.NOMBRE_ESPERADO = NOMBRE_ESPERADO;
	}

	public Integer getCuit() {
		return DNI_ESPERADO;
	}

	public String getNombre() {
		return NOMBRE_ESPERADO;
	}

	@Override
	public int compareTo(Consumidor o) {
		// TODO Auto-generated method stub
		return this.NOMBRE_ESPERADO.compareTo(o.getNombre());
	}

}
