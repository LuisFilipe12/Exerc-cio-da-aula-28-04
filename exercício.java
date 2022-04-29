import java.util.Locale;
import java.util.Scanner;

public class exercício {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");

	
		int [] numeros = new int [5];
		
		for(int cont = 0; cont < numeros.length; cont++) {
			System.out.println("Entre com o " + cont + "º numero: ");
		numeros[cont] = leia.nextInt();
		} 
		
		for (int cont = 0; cont < numeros.length; cont++) {
			System.out.println("Numero no indice " +cont + ":" + numeros[cont]);
		} 
		
           double media = 0.0;
		
           int [] numero = new int [4];
           for(int num = 0; num < numero.length; num++) {
			System.out.println("Entre com as notas dos quatro brimestre: ");
           numero[num] = leia.nextInt();
         
            
            media = num /4;
           }	  
           for(int num = 0; num < numero.length; num++) {
        	   System.out.println("A media e " +num + media);
           }
		
		
		
		
		
		leia.close();


	}

}
