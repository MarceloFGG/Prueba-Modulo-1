package Electro;
import java.util.*;
public class Ejecutable {

	public static void main(String[] args) {
		
		int precio_base;
		 String color;
		 String consumo;
		 int peso;
		 int total;
		
		Scanner sc= new Scanner(System.in);
		Electrodomesticos elect[]= new Electrodomesticos [2];
		
		for (int i = 0; i < elect.length; i++) {
			
			System.out.println("Ingrese Precio");
			precio_base=sc.nextInt();
			System.out.println("Ingrese Color");
			color=sc.next();
			System.out.println("Ingrese Consumo");
			consumo=sc.next();
			System.out.println("Ingrese Peso");
			peso=sc.nextInt();
			System.out.println("---------------------------------------------");
			sc.nextLine();
			elect[i]=new Electrodomesticos(precio_base, color, consumo, peso);
			
				}
			
			for (int i = 0; i < elect.length; i++) {
				System.out.println("Precio-Color-Consumo-Peso");
				System.out.println(elect[i].getPrecio_base()+" "+elect[i].getColor()+" "+elect[i].getConsumo()+" "+elect[i].getPeso());
		}
			
			for (int contador = 0; contador < elect.length; contador++) {
				
				total += elect[contador];
				
				
			}
				
			}
		}
	

