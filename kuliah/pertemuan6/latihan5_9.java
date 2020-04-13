import java.util.Scanner;

public class latihan5_9
{
	
	int hari;
	Scanner scan;
	
	public void run()
	{
		System.out.println("| 1 =Senin , 2 =Selasa , 3 =Rabu , 4 =Kamis |");
		System.out.println("| 5 =Jumat , 6 =Sabtu , 7 =Ahad |\n");
		scan = new Scanner(System.in);
		System.out.print("Hari : ");
		hari = scan.nextInt();
		
	switch(hari)
	{
		case 1: System.out.println("Senin"); break;
		case 2: System.out.println("Selasa"); break;
		case 3: System.out.println("Rabu"); break;
		case 4: System.out.println("Kamis"); break;
		case 5: System.out.println("Jumat"); break;
		case 6: System.out.println("Sabtu"); break;
		case 7: System.out.println("Ahad"); break;
		default: System.out.println("hari tidak terdaftar");
	}
					
	}
}