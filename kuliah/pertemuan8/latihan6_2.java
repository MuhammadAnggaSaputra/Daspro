//Muhammad Angga Saputra
//193040070

import java.util.Scanner;

public class latihan6_2
{
	Scanner scan;
	int input, jum;
	
	public void run()
	{
		scan = new Scanner(System.in);
		jum = 0;     
		
		System.out.printf("Masukkan nilai selain 999. \n");
		System.out.printf("Program akan menghitung nilai jumlah yang dimasukan. \n");
		System.out.printf("Jika nilai adalah 999 maka program berhenti. \n\n");
		
		input = scan.nextInt();
		while(input != 999)
		{
			jum = jum + input;
			input = scan.nextInt();
		}
		System.out.printf("%d \n", jum);
	}
}	