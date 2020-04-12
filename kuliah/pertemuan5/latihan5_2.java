import java.util.Scanner;

public class latihan5_2
{
	int bilangan;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System.in);
		System.out.print("Masukkan bilangan:");
		bilangan = scan.nextInt();
		
		if (bilangan % 2 !=0)
		{
			System.out.printf("Nilai %d tidak habis dibagi 2\n", bilangan);
			System.out.printf("Sehingga nilai tersebut termasuk bilangan GANJIL");
		}
		else
		{
			System.out.printf("Nilai %d  habis dibagi 2\n", bilangan);
			System.out.printf("Sehingga nilai tersebut termasuk bilangan GENAP");
		}
	}	
}	