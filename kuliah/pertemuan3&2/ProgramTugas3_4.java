import java.util.Scanner;

public class ProgramTugas3_4
{
	int a, b, c; 
	float rata_rata, jumlah ;
	Scanner scan;
	
	public void run()
	{
			
		scan = new Scanner(System. in);
		System.out.println("Masukan Nilai awal");
		a = scan.nextInt();
		
		System.out.println("Masukan Nilai Kedua");
		b = scan.nextInt();
		
		System.out.println("Masukan Nilai Ketiga");
		c = scan.nextInt();
		
		jumlah = a + b + c;
		rata_rata = jumlah / 3 ;
		
		System.out.println("Jumlah Nilai A + B + C adalah :" + jumlah );
		System.out.println("Jumlah Nilai rata-rata adalah  :" + rata_rata );
		
	}
}	
		