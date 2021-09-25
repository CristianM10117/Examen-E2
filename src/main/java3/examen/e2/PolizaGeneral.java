package examen.e2;

public class PolizaGeneral extends Poliza {

String codigoDescuento; 
int numeroSeguro;

String getCodigoDescuento() {
	return codigoDescuento;
}
void setCodigoDescuento(String codigoDescuento) {
	this.codigoDescuento = codigoDescuento;
}
int getNumeroSeguro() {
	return numeroSeguro;
}
void setNumeroSeguro(int numeroSeguro) {
	this.numeroSeguro = numeroSeguro;
}
@Override
public String toString() {
	return "PolizaGeneral [codigoDescuento=" + codigoDescuento + ", numeroSeguro=" + numeroSeguro + ", nombre=" + nombre
			+ ", descripcion=" + descripcion + ", anioVigencia=" + anioVigencia + ", codigoPoliza=" + codigoPoliza
			+ ", valorPoliza=" + valorPoliza + "]";
} 

}
