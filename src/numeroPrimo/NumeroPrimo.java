package numeroPrimo;

import java.util.Scanner;

public class NumeroPrimo
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean prim = true;
		System.out.print("Introduce un n�mero para saber si es n�mero primo: ");
		numero = sc.nextInt();
		sc.close();
		for(int i = 2 ; i < numero ; i++)
		{
			if(numero % i == 0)
			{
				prim = false;
			}
		}
		if(prim == false)
		{
			System.out.println(numero + " no es un n�mero primo.");
		}
		else
		{
			System.out.println(numero + " es un n�mero primo.");
		}
	}
}
