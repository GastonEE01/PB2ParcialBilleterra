package test;

import java.util.Objects;

public class Comercio {

	private final Long CUIT_ESPERADO;
	private final String NOMBRE_ESPERADO;

	public Comercio(Long CUIT_ESPERADO, String NOMBRE_ESPERADO) {
		this.CUIT_ESPERADO = CUIT_ESPERADO;
		this.NOMBRE_ESPERADO = NOMBRE_ESPERADO;
	}

	public Long getCuit() throws CuitInvalidoException{
		String cuit = this.CUIT_ESPERADO.toString();
		char validar1 = cuit.charAt(0);
		char validar2 = cuit.charAt(1);
		///*validar.charAt(1) == '0'&& validar.charAt(0) == '3'
		if( validar1 == '3' && validar2 == '0'  && cuit.length() == 11) {
		return CUIT_ESPERADO;
	}
	else {
		 throw new  CuitInvalidoException("Cuit invalido");
	}
	}


	public String getNomNbre() {
		return NOMBRE_ESPERADO;
	}



	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}*/
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Comercio comercio = (Comercio) obj;
	    return NOMBRE_ESPERADO.equals(comercio.NOMBRE_ESPERADO);
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(NOMBRE_ESPERADO);
	}
}
