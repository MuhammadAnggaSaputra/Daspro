import java.util.Scanner;

public class switch1
{
	int gajiPokok, golongan;
	double tunjangan;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System.in);
		System.out.print("Masukkan Gaji Pokok:");
		gajiPokok = scan.nextInt();
		System.out.print("Masukkan Golongan (1-3):");
		golongan = scan.nextInt();
		
		switch(golongan)
		{
			case 1: tunjangan = 0.05 * gajiPokok; break;
			case 2: tunjangan = 0.10 * gajiPokok; break;
			case 3: tunjangan = 0.15 * gajiPokok; break;	
			default: System.out.println("Golongan tidak ada");
		}
		
		System.out.printf("\nInformasi Gaji Pegawai:\n");
		System.out.printf("================\n");
		System.out.printf("Gaji Pokok: %d \n", gajiPokok);
		System.out.printf("Golongan: %d \n", golongan);
		System.out.printf("Tunjangan: %.2f \n", tunjangan);
		System.out.printf("Gaji Total: %.2f \n", (gajiPokok+tunjangan));
		System.out.printf("================\n");
	}
}	