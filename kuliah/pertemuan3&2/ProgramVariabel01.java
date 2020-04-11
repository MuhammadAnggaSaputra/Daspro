public class ProgramVariabel01
{
	int jumlah;
	double harga_per_unit, harga_total;
	
	public void run()
	{
		jumlah = 10;
		harga_per_unit = 17.5;
		harga_total = jumlah * harga_per_unit;
		System.out.printf("Harga total = %f\n", harga_total);
	}
}