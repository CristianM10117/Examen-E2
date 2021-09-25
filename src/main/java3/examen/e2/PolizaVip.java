package examen.e2;

public class PolizaVip extends Poliza {

String beneficio;

String getBeneficio() {
	return beneficio;
}

void setBeneficio(String beneficio) {
	this.beneficio = beneficio;
}

@Override
public String toString() {
	return "PolizaVip [beneficio=" + beneficio + ", nombre=" + nombre + ", descripcion=" + descripcion
			+ ", anioVigencia=" + anioVigencia + ", codigoPoliza=" + codigoPoliza + ", valorPoliza=" + valorPoliza
			+ "]";
}
	
}
