import java.util.Scanner;

public class switch2
{
	int hari;
	Scanner scan;
	
	public void run()
	{
		system.out.println("| 1=Senin, 2=Selasa, 3=Rabu, 4=Kamis |");
		System.out.println("| 5=Jumat, 6=Sabtu, 7=Minggu		|\n");
		scan = new Scanner(System.in);
		System.out.print("Hari:");
		hari = scan.nextInt();
		