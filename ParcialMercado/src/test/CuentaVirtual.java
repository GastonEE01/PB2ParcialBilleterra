package test;

public class CuentaVirtual extends Transferible implements ClasificacionDePagos,Comparable<CuentaVirtual> {

	private String CVU_ESPERADO;
	private String ENTIDAD_ESPERADA;
	private String TITULAR_ESPERADO;

	public CuentaVirtual(String CVU_ESPERADO, String ENTIDAD_ESPERADA, String TITULAR_ESPERADO) {
		super(CVU_ESPERADO, ENTIDAD_ESPERADA, TITULAR_ESPERADO);
		this.CVU_ESPERADO = CVU_ESPERADO;
		this.ENTIDAD_ESPERADA = ENTIDAD_ESPERADA;
		this.TITULAR_ESPERADO = TITULAR_ESPERADO;
	}

	
	public String getCVU_ESPERADO() {
		return CVU_ESPERADO;
	}


	public void setCVU_ESPERADO(String cVU_ESPERADO) {
		CVU_ESPERADO = cVU_ESPERADO;
	}


	public String getENTIDAD_ESPERADA() {
		return ENTIDAD_ESPERADA;
	}


	public void setENTIDAD_ESPERADA(String eNTIDAD_ESPERADA) {
		ENTIDAD_ESPERADA = eNTIDAD_ESPERADA;
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
	public int compareTo(CuentaVirtual o) {
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
