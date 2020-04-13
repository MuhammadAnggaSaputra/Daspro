import java.util.Scanner;

public class switchnilai
{
	int i;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System.in);
		System.out.print("Nilai:");
		i = scan.nextInt();
		switch(i)
		{
			case 10: System.out.println("Sepuluh"); 
			case 20: System.out.println("Sepuluh");
			default: System.out.println("Tidak Sesuai");
		}
	}
}	