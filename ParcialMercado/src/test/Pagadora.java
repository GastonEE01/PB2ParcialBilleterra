package test;

public abstract class Pagadora {

	private Double saldo;
	private  Long NUMERO_ESPERADO;
	private  String TITULAR_ESPERADO;
	private  String FECHA_DE_VENCIMIENTO_ESPERADO;
	private  Integer CODIGO_DE_SEGURIDAD_ESPERADO;
	private  Double LIMITE_COMPRA_EN_PESOS;
	private  Double LIMITE_COMPRA_EN_DOLARES;
	
	public Pagadora(Long NUMERO_ESPERADO, String TITULAR_ESPERADO, String FECHA_DE_VENCIMIENTO_ESPERADO,
			Integer CODIGO_DE_SEGURIDAD_ESPERADO) {
		this.saldo = 0.0;
		this.LIMITE_COMPRA_EN_DOLARES = 0.0;
		this.LIMITE_COMPRA_EN_PESOS = 0.0;
		this.NUMERO_ESPERADO = NUMERO_ESPERADO;
		this.TITULAR_ESPERADO = TITULAR_ESPERADO;
		this.FECHA_DE_VENCIMIENTO_ESPERADO = FECHA_DE_VENCIMIENTO_ESPERADO;
		this.CODIGO_DE_SEGURIDAD_ESPERADO = CODIGO_DE_SEGURIDAD_ESPERADO;

	}

	public abstract Double getLimiteDeCompraEnPesos();

	
	public void setLIMITE_COMPRA_EN_PESOS(Double lIMITE_COMPRA_EN_PESOS) {
		LIMITE_COMPRA_EN_PESOS = lIMITE_COMPRA_EN_PESOS;
	}

	public abstract Double getLimiteDeCompraEnDolares();

	public void setLIMITE_COMPRA_EN_DOLARES(Double lIMITE_COMPRA_EN_DOLARES) {
		LIMITE_COMPRA_EN_DOLARES = lIMITE_COMPRA_EN_DOLARES;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Long getNumero() {
		return NUMERO_ESPERADO;
	}

	public String getTitular() {
		return TITULAR_ESPERADO;
	}

	public String getFechaDeVencimiento() {
		return FECHA_DE_VENCIMIENTO_ESPERADO;
	}

	public Integer getCodigoDeSeguridad() {
		return CODIGO_DE_SEGURIDAD_ESPERADO;
	}

	public void setLimiteDeCompraEnPesos(TarjetaDeCredito t) {
		this.LIMITE_COMPRA_EN_PESOS = t.getLIMITE_COMPRA_EN_PESOS();
	}
	public void setLimiteDeCompraEnDolares(TarjetaDeCredito t) {
		this.LIMITE_COMPRA_EN_PESOS = t.getLIMITE_COMPRA_EN_DOLARES();
	}

	
	

	
}
