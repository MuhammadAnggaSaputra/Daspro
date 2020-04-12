import java.util.Scanner;

public class latihan5_4
{
	int nilai;
	char indeks;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System.in);
		System.out.print("Masukkan nilai (98):");
		nilai = scan.nextInt();
		
		if (nilai > 81 )
			indeks = 'A';
		else if (nilai > 61)
				indeks = 'B' ;
		else if (nilai > 41)
				indeks = 'C' ;
		else if (nilai > 21)
				indeks = 'D' ;
		else 
			indeks = 'E' ;
		
			System.out.printf("Nilai : %d \n", nilai);
			System.out.printf("Indeks : %c \n", indeks);
		
	}	
}		
			