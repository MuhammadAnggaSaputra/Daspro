import java.util.Scanner;

public class ProgramTugas3_2 
{
	final double PHI = 3.14;
	double luas, radius, tinggi;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System. in);
		System.out.println("Masukan Nilai R :");
		tinggi = scan.nextDouble();
		
		System.out.println("Masukan Nilai T :");
		radius = scan.nextDouble();
		
		luas = PHI * radius * (radius + 2 * tinggi) ;
		System.out.println("Jumlah luas Permukaan tabung tanpa tutup adalah = " + luas);
		
	}
}	
		
	