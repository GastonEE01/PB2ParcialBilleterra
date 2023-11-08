package test;

public class Compra {
	
	private Double dinero;
	private Long CODIGO_DE_SEGURIDAD_ESPERADO;

	public Compra(Long CODIGO_DE_SEGURIDAD_ESPERADO,Double dinero) {
		this.CODIGO_DE_SEGURIDAD_ESPERADO = CODIGO_DE_SEGURIDAD_ESPERADO;
		this.dinero = dinero;
		
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}

	public Long getCODIGO_DE_SEGURIDAD_ESPERADO() {
		return CODIGO_DE_SEGURIDAD_ESPERADO;
	}

	public void setCODIGO_DE_SEGURIDAD_ESPERADO(Long cODIGO_DE_SEGURIDAD_ESPERADO) {
		CODIGO_DE_SEGURIDAD_ESPERADO = cODIGO_DE_SEGURIDAD_ESPERADO;
	}

}
