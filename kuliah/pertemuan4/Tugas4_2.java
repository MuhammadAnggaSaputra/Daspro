import java.util.Scanner;

public class Tugas4_2
{
	String no_rekening, nama;
	float saldo;
	
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System. in);
		System.out.println("Masukkan No Rekening Anda :");
		no_rekening = scan.nextLine();
		
		System.out.println("Masukkan Nama Anda :");
		nama = scan.nextLine();
		
		System.out.println("Masukkan Saldo Anda :");
		saldo = scan.nextFloat();
		
		System.out.printf("%13s | %-22s | Rp.%-4.2f ", no_rekening, nama, saldo );
 	}
}	
	