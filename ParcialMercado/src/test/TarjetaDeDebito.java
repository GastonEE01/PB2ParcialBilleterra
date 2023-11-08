package test;

public class TarjetaDeDebito extends Pagadora implements ClasificacionDePagos,Comparable<TarjetaDeDebito>{

	
	private final Long NUMERO_ESPERADO;
	private final String TITULAR_ESPERADO;
	private final String FECHA_DE_VENCIMIENTO_ESPERADO;
	private final Integer CODIGO_DE_SEGURIDAD_ESPERADO;

	public TarjetaDeDebito(Long NUMERO_ESPERADO, String TITULAR_ESPERADO, String FECHA_DE_VENCIMIENTO_ESPERADO,
			Integer CODIGO_DE_SEGURIDAD_ESPERADO) {
		super(NUMERO_ESPERADO,TITULAR_ESPERADO,FECHA_DE_VENCIMIENTO_ESPERADO,CODIGO_DE_SEGURIDAD_ESPERADO);
		this.NUMERO_ESPERADO = NUMERO_ESPERADO;
		this.TITULAR_ESPERADO = TITULAR_ESPERADO;
		this.FECHA_DE_VENCIMIENTO_ESPERADO = FECHA_DE_VENCIMIENTO_ESPERADO;
		this.CODIGO_DE_SEGURIDAD_ESPERADO = CODIGO_DE_SEGURIDAD_ESPERADO;
		
	}

	public Long getNUMERO_ESPERADO() throws NumeroDeTarjetaInvalidoException {
		if(NUMERO_ESPERADO == 16) {
			return NUMERO_ESPERADO;
			}
			else {
				throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta no tiene 16 digitos");
			}
	}
	



	public String getFECHA_DE_VENCIMIENTO_ESPERADO() {
		return FECHA_DE_VENCIMIENTO_ESPERADO;
	}


	public Integer getCODIGO_DE_SEGURIDAD_ESPERADO() {
		return CODIGO_DE_SEGURIDAD_ESPERADO;
	}

	
	@Override
	public Double getLimiteDeCompraEnPesos() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double getLimiteDeCompraEnDolares() {
		// TODO Auto-generated method stub
		return 0.0;
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
	public int compareTo(TarjetaDeDebito o) {
		// TODO Auto-generated method stub
		return this.CODIGO_DE_SEGURIDAD_ESPERADO.compareTo(o.CODIGO_DE_SEGURIDAD_ESPERADO);
	}

	@Override
	public Long getMedioPagador(Long l) {
		if(this.NUMERO_ESPERADO.equals(l)) {
		return this.NUMERO_ESPERADO;
		}
		return null;

	}


	@Override
	public boolean coincideTitular() {
		return true;
	}


}
	


