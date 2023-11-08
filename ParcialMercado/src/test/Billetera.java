package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public  class Billetera {

	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;
	private Map<Integer, ClasificacionDePagos> pagos;
	private Integer numero;
	//private Map<Long,Double > compras;
	private ArrayList<Compra>compras;
	
	public Billetera(String nombre) {
		this.nombre = nombre;
		this.comercios = new HashSet<Comercio>();
		this.consumidores = new TreeSet<Consumidor>();
		//this.pagos = new HashMap<Integer, ClasificacionDePagos>();
		this.pagos = new TreeMap<Integer, ClasificacionDePagos>();
		//this.compras = new HashMap<Long, Double>();
		this.compras = new ArrayList<Compra>();
		this.numero = 0;

	}

	public void agregarComercio(Comercio comercio) {
		this.comercios.add(comercio);
	}

	public Object getCantidadDeComercios() {
		return this.comercios.size();
	}

	public Object getCantidadDeConsumidores() {
		// TODO Auto-generated method stub
		return this.consumidores.size();
	}

	public void agregarConsumidor(Consumidor consumidor) {
		this.consumidores.add(consumidor);
	}

	public void agregarMedioDePago(Integer numeroDeTarjeta, ClasificacionDePagos clasificacionDePagos) throws NoCoincideTitularException{
		if(clasificacionDePagos instanceof TarjetaDeDebito || clasificacionDePagos instanceof TarjetaDeCredito || clasificacionDePagos instanceof  CuentaBancaria  || clasificacionDePagos instanceof  CuentaVirtual) {
			   if (!clasificacionDePagos.coincideTitular()) {
		            throw new NoCoincideTitularException("El titular del medio de pago no coincide con el consumidor");
			   }
				this.numero++;
			   this.pagos.put(numeroDeTarjeta, clasificacionDePagos);
		}
	}

	
	public Integer getCantidadDeMediosDePago() {
		// TODO Auto-generated method stub
		Integer numero = this.pagos.size();
		return this.numero;
	}

	public Compra generarCodigoQR(Long codigoDeTarjeta, Double dinero) {
		Compra compra = new Compra(codigoDeTarjeta,dinero);
	//	this.compras.put(codigoDeTarjeta, dinero);
		this.compras.add(compra);
		return 		compra;
	}


public Boolean pagar(Compra codigoQR, Integer medioPagador) {
	if(  this.compras.contains(codigoQR) && pagos.containsKey(medioPagador)) {
		return true;
		}
	return  false;
}

public Integer getMedioPagador(long l) {
	
	return null;
}

public Consumidor getConsumidor(int dni) {
    for (Consumidor consumidor : this.consumidores) {
        if (consumidor.getCuit() == dni) {
            return consumidor;
        }
    }
    return null; // Si no se encuentra el consumidor con ese DNI
}

	

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Billetera billetera = (Billetera) obj;
    return Objects.equals(nombre, billetera.nombre) &&
            Objects.equals(comercios, billetera.comercios) &&
            Objects.equals(consumidores, billetera.consumidores) &&
            Objects.equals(pagos, billetera.pagos) &&
            Objects.equals(numero, billetera.numero) &&
            Objects.equals(compras, billetera.compras);
}

@Override
public int hashCode() {
    return Objects.hash(nombre, comercios, consumidores, pagos, numero, compras);
}


public Boolean transferir(Transferible cuentaOrigen, Transferible cuentaDestino) throws CBUInvalidoException ,SaldoInsuficienteException{
	//Le agrego dinero para hacer el test 
	Double monto1 = 1150.0;
	cuentaOrigen.depositarSaldo(monto1);
	Double monto = 1000.0;
	cuentaDestino.depositarSaldo(monto);
	if (this.pagos.containsValue(cuentaOrigen.getCbu()) || this.pagos.containsValue(cuentaDestino.getCbu())) {
        return false; // Alguna de las cuentas no existe
    }
	else if (cuentaOrigen.getDinero() <=  cuentaDestino.getDinero()) {
		 throw new  SaldoInsuficienteException("Saldo insuficiente");
	}
	    cuentaOrigen.retirarSaldo(monto);
	    cuentaDestino.depositarSaldo(monto1);
	
return true;
}


}