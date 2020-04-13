//Muhammad Angga Saputra
//193040070

import java.util.Scanner;

public class latihan6_1 
{
	
	String jawab;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System.in);
		
		do
		{
			System.out.printf("=====================\n");
			System.out.printf("Anda sendang mencoba program\n");
			System.out.printf("Mau lagi (Ya/Tidak) ?\n");
			jawab = scan.next();
		}
		while(jawab.equals("YA") || jawab.equals("YA"));
		
		System.out.printf("==================\n");
		System.out.printf("Program Selesai\n");
		System.out.printf("Terimakasih. \n");
	}
}	