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
	int nuevoValorPoliza;
	int op;
	String codigoDescuento; 
	int numeroSeguro; 
	String beneficio;
	String pp;
	String cb;
	int i; 
	int j;
	boolean resultado;
	boolean resultado1;
	
	PolizaVip usuarioy = new PolizaVip();
	PolizaGeneral usuariox = new PolizaGeneral(); 
	
	Poliza vector[] = new Poliza[2]; 
	
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
		pp = L2.nextLine();
		
		if(pp.equals("a")) {
			for (i = 0; i <= 2; i++) {
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
		
		usuariox.setNombre(nombre);
		usuariox.setDescripcion(descripcion);
		usuariox.setAnioVigencia(anioVigencia);
		usuariox.setCodigoPoliza(codigoPoliza);
		usuariox.setValorPoliza(valorPoliza);
		usuariox.setCodigoDescuento(codigoDescuento);
        usuariox.setNumeroSeguro(numeroSeguro);
        vector[i] = usuariox; 
        
		}
		}else if(pp.equals("b")){
			for ( j = 0; j <= 2; j++) {
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
			System.out.println("Ingrese Beneficio: ");	
			codigoPoliza = L2.nextLine();
			
			usuarioy.setNombre(nombre);
			usuarioy.setDescripcion(descripcion);
			usuarioy.setAnioVigencia(anioVigencia);
			usuarioy.setCodigoPoliza(codigoPoliza);
			usuarioy.setValorPoliza(valorPoliza);
			usuarioy.setBeneficio(beneficio);;
			vector[j] = usuariox;
			}	
		}else if(op == 2) {
			
			System.out.println("Ingrese el codigo de poliza a buscar: ");
			cb = L2.nextLine();
			 resultado = vector[i].equals(cb); 
			 resultado = vector[j].equals(cb);
			 
			 if(resultado == true) {
				 System.out.println("Ingresar nuevo valor de la poliza: "); 
				 nuevoValorPoliza = L1.nextInt();
				 usuariox.setValorPoliza(nuevoValorPoliza);
				 usuarioy.setValorPoliza(nuevoValorPoliza);
				 
			 }else if(resultado == false){
				 System.out.println("No se encuentra en la base de datos. ");
			 
			 }else if(op == 3) {
				 
				 System.out.println("Ingrese el codigo de poliza a buscar: ");
					cb = L2.nextLine();
					
					 resultado1 = vector[i].equals(cb); 
					 resultado1 = vector[j].equals(cb);
				
			 }
			 
			 }
	
	}

}
