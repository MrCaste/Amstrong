import java.util.Scanner;

public class M1_05_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0, auxiliar = numero, digitos = 0, ultimoDigito = 0, suma = 0;
		boolean isAmstrong;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el numero a analizar: ");
		numero=sc.nextInt();
		
		sc.close();
		
		digitos =(int) (Math.log10(numero) + 1);
		
		auxiliar = numero;
		
		while (auxiliar>0) {
			ultimoDigito = auxiliar % 10;
			suma += (Math.pow(ultimoDigito, digitos));
			
			auxiliar = auxiliar / 10;	
		}

		if(numero == suma) {
			 isAmstrong = true;
		System.out.println("El numero introducido: "+numero+", es un numero amstrong");
		}
		else {
			 isAmstrong = false;
		System.out.println("El numero introducido: "+numero+", no es un numero amstrong");
		}
		
		
	}

}
