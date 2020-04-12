import java.util.Scanner;

public class latihan5_10
{
	int gajiPokok;
	String golongan;
	double tunjangan;
	Scanner scan;
	
	public void run()
	{
		
		scan = new Scanner(System.in);
		System.out.print("Masukkan Golongan (a-d): ");
		golongan = scan.next();
		
		switch(golongan)
		{
			case "a": gajiPokok = 2000000; tunjangan = 0 * gajiPokok; break;
			case "b": gajiPokok = 2500000; tunjangan = 0.025 * gajiPokok; break;
			case "c": gajiPokok = 3000000; tunjangan = 0.05 * gajiPokok; break;
			case "d": gajiPokok = 4000000; tunjangan = 0.075 * gajiPokok; break;
			default: System.out.println("Golongan tidak ada");
		}

	
		
		System.out.printf("\nInformasi Gaji Pegawai:\n");
		System.out.printf("================\n");
		System.out.printf("Gaji Pokok: %d \n", gajiPokok);
		System.out.printf("Golongan: %s \n", golongan);
		System.out.printf("Tunjangan: %.2f \n", tunjangan);
		System.out.printf("Gaji Total: %.2f \n", (gajiPokok+tunjangan));
		System.out.printf("================\n");
	}
}	