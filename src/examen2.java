import java.util.Scanner;


public class examen2 {

	public static void main(String[] args) {
		//Vamos hacer un programa donde el usuario ingrese un numero y de acuerdo a ese numero
			//le salga la catidad de Hola
			
			int numero;
			String texto;
			Scanner s = new Scanner (System.in);
//Aqui ingresamos la cantidad y la cadena de texto
	        System.out.print("Ingrese un numero : ");
			numero=s.nextInt();
			System.out.print("Cadena de texto : ");
			texto = s.next();


			for(int contador=1; contador<=numero; contador++){
				System.out.printf("\n%s %s",contador,texto);
	}

}
	
}