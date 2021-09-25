package examen.e2;

import java.util.Scanner;

public class MainAseguradora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner L1 = new Scanner(System.in);
	Scanner L2 = new Scanner(System.in);
	
	String nombre; 
	String descripcion; 
	int anioVigencia; 
	String codigoPoliza; 
	int valorPoliza;
	int op;
	String codigoDescuento; 
	int numeroSeguro; 
	String beneficio;
	
	Poliza vector[] = new Poliza[10]; 
	do {
			
		System.out.println("ASEGURADORA DEL SUR, Elija una opcion: ");
		System.out.println("1.- Ingresar Póliza. ");
		System.out.println("2.- Actualizar Valor. ");
		System.out.println("3.- Consultar Póliza. ");
		System.out.println("4.- Imprimir Reporte. ");
 
         op = L1.nextInt();
         
         if(op == 1) {
		System.out.println("Poliza que desea ingresar: ");
		System.out.println("a) Poliza General. ");
		System.out.println("b) Poliza Vip. ");
		String pp = L2.nextLine();
		
		if(pp.equals("a")) {
		System.out.println("Ingrese el Nombre: ");	
		nombre = L2.nextLine();
		System.out.println("Ingrese la Descripcion: ");	
		descripcion = L2.nextLine();
		System.out.println("Ingrese el Año de Vigencia: ");	
		anioVigencia = L1.nextInt();
		System.out.println("Ingrese el Codigo de Poliza: ");	
		codigoPoliza = L2.nextLine();
		System.out.println("Ingrese el Valor de la Poliza: ");	
		valorPoliza = L1.nextInt();
		System.out.println("Ingrese el Codigo de Descuento: ");	
		codigoDescuento = L2.nextLine();
		System.out.println("Ingrese Numero del seguro: ");	
		numeroSeguro = L1.nextInt();
		
		PolizaGeneral usuariox = new PolizaGeneral(); 
		usuariox.setNombre(nombre);
		usuariox.setDescripcion(descripcion);
		usuariox.setAnioVigencia(anioVigencia);
		usuariox.setCodigoPoliza(codigoPoliza);
		usuariox.setValorPoliza(valorPoliza);
		usuariox.setCodigoDescuento(codigoDescuento);
        usuariox.setNumeroSeguro(numeroSeguro);
        
		
		}
		
       
	}

}
