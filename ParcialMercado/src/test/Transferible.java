package test;

public class Transferible implements ClasificacionDePagos {

	private final String CBU_ESPERADO;
	private final String TITULAR_ESPERADO;
	private final String ENTIDAD_ESPERADA;
	private Double dinero;
	
	public Transferible(String CBU_ESPERADO, String ENTIDAD_ESPERADA, String TITULAR_ESPERADO) {
		this.CBU_ESPERADO = CBU_ESPERADO;
		this.ENTIDAD_ESPERADA = ENTIDAD_ESPERADA;
		this.TITULAR_ESPERADO = TITULAR_ESPERADO;
		this.dinero = 0.0;
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}

	public String getCbu() throws CBUInvalidoException {
		if(this.CBU_ESPERADO.length() <= 20) {
			return CBU_ESPERADO;	
		}
		else {
			throw new CBUInvalidoException("No se puede generar un cbu de mas de 20 digitos");
		}
	}
	
	public String getCvu() throws CVUInvalidoException {
		if(this.CBU_ESPERADO.length() <= 23) {
			return CBU_ESPERADO;	
		}
		else {
			throw new CVUInvalidoException("No se puede generar un cbu de mas de 20 digitos");
		}
	}
	public String getTitular() {
		return TITULAR_ESPERADO;
	}

	public String getEntidad() {
		return ENTIDAD_ESPERADA;
	}

	@Override
	public Long getMedioPagador(Long l) {
		// TODO Auto-generated method stub
		return null;
	}

	public void retirarSaldo(Double monto) {
		this.dinero -= monto;
	}

	public void depositarSaldo(Double monto) {
		this.dinero += monto;

	}

	@Override
	public boolean coincideTitular() {
		// TODO Auto-generated method stub
		return false ;
	}

	
}
