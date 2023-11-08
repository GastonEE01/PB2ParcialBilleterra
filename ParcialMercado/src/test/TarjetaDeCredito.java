package test;

public class TarjetaDeCredito extends Pagadora implements ClasificacionDePagos,Comparable<TarjetaDeCredito>{

	private final Long NUMERO_ESPERADO;
	private final String TITULAR_ESPERADO;
	private final String FECHA_DE_VENCIMIENTO_ESPERADO;
	private final Integer CODIGO_DE_SEGURIDAD_ESPERADO;
	public final Double LIMITE_COMPRA_EN_PESOS1;
	public final Double LIMITE_COMPRA_EN_DOLARES;
	
	public TarjetaDeCredito(Long NUMERO_ESPERADO, String TITULAR_ESPERADO, String FECHA_DE_VENCIMIENTO_ESPERADO,
			Integer CODIGO_DE_SEGURIDAD_ESPERADO,Double LIMITE_COMPRA_EN_PESOS,Double LIMITE_COMPRA_EN_DOLARES ) {
		super(NUMERO_ESPERADO, TITULAR_ESPERADO, FECHA_DE_VENCIMIENTO_ESPERADO, CODIGO_DE_SEGURIDAD_ESPERADO);
		this.NUMERO_ESPERADO = NUMERO_ESPERADO;
		this.TITULAR_ESPERADO = TITULAR_ESPERADO;
		this.FECHA_DE_VENCIMIENTO_ESPERADO = FECHA_DE_VENCIMIENTO_ESPERADO;
		this.CODIGO_DE_SEGURIDAD_ESPERADO = CODIGO_DE_SEGURIDAD_ESPERADO;
		this.LIMITE_COMPRA_EN_DOLARES = LIMITE_COMPRA_EN_DOLARES;
		this.LIMITE_COMPRA_EN_PESOS1 = LIMITE_COMPRA_EN_PESOS;
	
	}


	public TarjetaDeCredito(Long NUMERO_ESPERADO, String TITULAR_ESPERADO, String FECHA_DE_VENCIMIENTO_ESPERADO,
			Integer CODIGO_DE_SEGURIDAD_ESPERADO) {
		super(NUMERO_ESPERADO, TITULAR_ESPERADO, FECHA_DE_VENCIMIENTO_ESPERADO, CODIGO_DE_SEGURIDAD_ESPERADO);
		this.NUMERO_ESPERADO = NUMERO_ESPERADO;
		this.TITULAR_ESPERADO = TITULAR_ESPERADO;
		this.FECHA_DE_VENCIMIENTO_ESPERADO = FECHA_DE_VENCIMIENTO_ESPERADO;
		this.CODIGO_DE_SEGURIDAD_ESPERADO = CODIGO_DE_SEGURIDAD_ESPERADO;
		this.LIMITE_COMPRA_EN_PESOS1 = null;
		this.LIMITE_COMPRA_EN_DOLARES = null;	
	}
	
	public Long getNUMERO_ESPERADO() throws NumeroDeTarjetaInvalidoException {
		if(NUMERO_ESPERADO == 16) {
			return NUMERO_ESPERADO;
			}
			else {
				throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta no tiene 16 digitos");
			}
	}


	public String getTITULAR_ESPERADO() {
		return TITULAR_ESPERADO;
	}

	public String getFECHA_DE_VENCIMIENTO_ESPERADO() {
		return FECHA_DE_VENCIMIENTO_ESPERADO;
	}

	public Integer getCODIGO_DE_SEGURIDAD_ESPERADO() {
		return CODIGO_DE_SEGURIDAD_ESPERADO;
	}

	@Override
	public Double getLimiteDeCompraEnDolares() {
		return LIMITE_COMPRA_EN_DOLARES;
	}

	@Override
	public Double getLimiteDeCompraEnPesos() {
		return LIMITE_COMPRA_EN_PESOS1;
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
	public int compareTo(TarjetaDeCredito o) {
		return this.CODIGO_DE_SEGURIDAD_ESPERADO.compareTo(o.CODIGO_DE_SEGURIDAD_ESPERADO);
	}
	
	@Override
	public Long getMedioPagador(Long l) {
		if(this.NUMERO_ESPERADO.equals(l)) {
		return this.NUMERO_ESPERADO;
		}
		return null;

	}
	
/*	@Override
	public boolean coincideTitular() {
		return true;
	}*/


	public Double getLIMITE_COMPRA_EN_PESOS() {
		return this.LIMITE_COMPRA_EN_PESOS1;
	}


	public Double getLIMITE_COMPRA_EN_DOLARES() {
		// TODO Auto-generated method stub
		return this.LIMITE_COMPRA_EN_DOLARES;
	}


	@Override
	public boolean coincideTitular() {
		// TODO Auto-generated method stub
		  if(this.TITULAR_ESPERADO != null) {
			return true;
		}
		  return false;
	}
	}


	
	

