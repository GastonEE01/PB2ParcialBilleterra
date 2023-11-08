package test;

public class CuentaBancaria extends Transferible implements ClasificacionDePagos,Comparable<CuentaBancaria> {

	private final String CBU_ESPERADO;
	private final String TITULAR_ESPERADO;
	private final String ENTIDAD_ESPERADA;

	public CuentaBancaria(String CBU_ESPERADO, String ENTIDAD_ESPERADA, String TITULAR_ESPERADO) {
		super(CBU_ESPERADO, ENTIDAD_ESPERADA, TITULAR_ESPERADO);
		this.CBU_ESPERADO = CBU_ESPERADO;
		this.ENTIDAD_ESPERADA = ENTIDAD_ESPERADA;
		this.TITULAR_ESPERADO = TITULAR_ESPERADO;
	}
	

	public String getCbu() throws CBUInvalidoException  {
		return CBU_ESPERADO;
	}

	public String getTitular() {
		return TITULAR_ESPERADO;
	}

	public String getEntidad() {
		return ENTIDAD_ESPERADA;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(this.TITULAR_ESPERADO.equals(obj.toString())) {
			return super.equals(obj);
		}
		return false;
	}


	@Override
	public int compareTo(CuentaBancaria o)  {
		// TODO Auto-generated method stub
		return this.TITULAR_ESPERADO.compareTo(o.TITULAR_ESPERADO);
	}
	
	@Override
	public Long getMedioPagador(Long l) {
		return null;

	}
	
	@Override
	public boolean coincideTitular() {
		return true;
	}
}
