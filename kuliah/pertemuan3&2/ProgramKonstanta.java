public class ProgramKonstanta
{
	final double PHI = 3.14;
	double radius, luas, keliling;
	
	
	public void run()
	{
		radius = 2.3;
		luas = PHI * radius * radius;
		keliling = 2 * PHI * radius;
		System.out.printf("luas lingkran = %f\n", luas);
		System.out.printf("keliling lingkran = %f\n", keliling);
	}
}	