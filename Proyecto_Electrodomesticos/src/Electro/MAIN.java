package Electro;
import Electro.*;
import Electro.Lavadora;
import Electro.Television;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class MAIN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String consumo =  "A";
		String consumo1 = "B";
		String consumo2 = "C";
		String consumo3 = "D";
		String consumo4 = "E";
		String consumo5 = "F";
		String efi;
		String color;
		int peso;
		int carga;
		int precio = 100000;
		boolean sintonizador;
		int res;
		
		
		int opc;
		ArrayList<Lavadora> Ele= new ArrayList<Lavadora>();
		ArrayList<Television> tele = new ArrayList<Television>();
		
		do {
			do {
				
			
			System.out.println("que desea hacer?:");
			System.out.println("1. ingresar lavadora");
			System.out.println("2. ingresar televisores");
			System.out.println("3. listar eletrodomesticos");
			System.out.println("4.salir");	
			opc = sc.nextInt();
			sc.nextLine();
			} while (opc!=1 && opc!=2 && opc!=3 &&opc!=4);
		

		
		switch (opc) {
		case 1:	
					
			System.out.println("Ingrese el cosumo de la lavadora: ");
			 efi = sc.nextLine();
			
			if (efi.equalsIgnoreCase("A")  ) {
				
				efi = "A";
				precio = precio +100;
				
			}else if(efi.equalsIgnoreCase("B")){
				efi = "B";
				precio = precio +80;
			}else if (efi.equalsIgnoreCase("C")) {
				efi = "C";
				precio = precio +60;
			}else if (efi.equalsIgnoreCase("D")) {
				efi = "D";
				precio = precio +50;
			}else if (efi.equalsIgnoreCase("E")) {
				efi = "E";
				precio = precio +30;
			}else {
				efi = "F";
				precio = precio +10;
			}
			
			System.out.println("Ingrese el color de la lavadora: ");
			 color = sc.nextLine();
			
			if (color.equalsIgnoreCase("negro")) {
				 color ="Negro";
			}else if (color.equalsIgnoreCase("rojo")) {
				 color ="Rojo";
			}else if (color.equalsIgnoreCase("azul")) {
				 color ="Azul";
			}else if (color.equalsIgnoreCase("gris")) {
				 color ="Gris";
			}else {
				color = "Blanco";
				
			}
			
			System.out.println("ingrese peso de la lavadora");
			 peso = sc.nextInt();
			
			if (peso>=0 && peso<=19) {
				precio = precio + 10;
			}else if (peso>=20 && peso<=49) {
				precio = precio + 50;
			}else if (peso>=50 && peso<=79) {
				precio = precio + 80;
			}else {
				precio = precio + 100;
			}
			
			System.out.println("ingrese la carga: ");
			 carga = sc.nextInt();
			if (carga>=0 || carga<30) {
				
			}else if (carga>=30) {
				precio = precio + 50;
			}	
			Lavadora l = new Lavadora(precio, color, consumo, peso, carga);
			Ele.add(l);
			System.out.println("lavadora Agregada");
			
		
			break;
		case 2:
				
			System.out.println("Ingrese el consumo del Televisor: ");
			 efi = sc.nextLine();
			
			if (efi.equalsIgnoreCase("A")  ) {
				
				efi = "A";
				precio = precio +100;
				
			}else if(efi.equalsIgnoreCase("B")){
				efi = "B";
				precio = precio +80;
			}else if (efi.equalsIgnoreCase("C")) {
				efi = "C";
				precio = precio +60;
			}else if (efi.equalsIgnoreCase("D")) {
				efi = "D";
				precio = precio +50;
			}else if (efi.equalsIgnoreCase("E")) {
				efi = "E";
				precio = precio +30;
			}else {
				efi = "F";
				precio = precio +10;
			}
			
			System.out.println("Ingrese el color del Televisor: ");
			color = sc.nextLine();
			
			if (color.equalsIgnoreCase("negro")) {
				 color ="Negro";
			}else if (color.equalsIgnoreCase("rojo")) {
				 color ="Rojo";
			}else if (color.equalsIgnoreCase("azul")) {
				 color ="Azul";
			}else if (color.equalsIgnoreCase("gris")) {
				 color ="Gris";
			}else {
				color = "Blanco";
				
			}
			
			System.out.println("ingrese peso aproximado del Televisor");
			peso = sc.nextInt();
			
			if (peso>=0 && peso<=19) {
				precio = precio + 10;
			}else if (peso>=20 && peso<=49) {
				precio = precio + 50;
			}else if (peso>=50 && peso<=79) {
				precio = precio + 80;
			}else {
				precio = precio + 100;
			}
			sc.nextLine();
			System.out.println("ingrese si posee sintonizador digital: ");
			String sint = sc.nextLine();
			if (sint.equalsIgnoreCase("si")) {
				sintonizador= true;
				int aum = (precio*50)/100;
				precio = precio +aum;
			}else {
				sintonizador = false;
			}
			
			
			System.out.println("ingrese pulgadas del Televisor");
			res = sc.nextInt();
			
			if (res >40) {
				int aumento = (precio*30)/100;
				precio = precio +aumento;
			}
			Television tel = new Television(precio, color, efi, peso, res, sintonizador);
			tele.add(tel);
				System.out.println("televisor agregado");
			break;
		case 3:
			
			//System.out.println("Listado de Lavadoras: ");
			for (int i = 0; i < Ele.size(); i++) {
				System.out.println("el precio es: "+Ele.get(i).getPrecio_base());
				System.out.println("el color es: "+Ele.get(i).getColor());
				System.out.println("la eficiencia es: "+Ele.get(i).getConsumo());
				System.out.println("el peso es: "+Ele.get(i).getPeso());
				System.out.println("la carga es: "+Ele.get(i).getCarga());
				System.out.println("---------------------------------------------");
				
			}
			
				//System.out.println("listado de televisores");
			for (int i = 0; i < tele.size(); i++) {
				System.out.println("el precio es: "+tele.get(i).getPrecio_base());
				System.out.println("el color es: "+tele.get(i).getColor());
				System.out.println("la eficiencia es: "+tele.get(i).getConsumo());
				System.out.println("el peso es: "+tele.get(i).getPeso());
				System.out.println("la resolucion es: "+tele.get(i).getRes());
				if (tele.get(i).getSint()==true) {
					System.out.println("el telvisor tiene sintonizador");
				}else{
					System.out.println("el televisor no tiene sintonizador");
					System.out.println("-------------------------------------------");
				}
			}
			
			break;
		case 4:
			System.out.println("Adios vuelva pronto****");
			break;
		default:
			break;
		}
} while (opc!=4);
		
	}

}

