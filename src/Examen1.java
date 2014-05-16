import java.util.Scanner;

public class Examen1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double puntaje1, puntaje2,puntaje3,promedio;


		System.out.print("Ingrese puntaje 1: ");
		puntaje1=s.nextInt();
		System.out.print("Ingrese puntaje 2: ");
		puntaje2=s.nextInt();
		System.out.print("Ingrese puntaje 3: ");
		puntaje3=s.nextInt();

		
		promedio=(puntaje1+puntaje2+puntaje3)/3;

		System.out.print("promedio es: "+promedio);


		if (promedio>=1000)
			System.out.print(" Exelente");
			
		else if((promedio>=700)&&(promedio<1000))
			System.out.print("bueno");
		else if((promedio>=500)&&(promedio<700))
			System.out.print(" suficiente");
		else if(promedio<500)
			System.out.print(" Has perdido");
	

	}
}