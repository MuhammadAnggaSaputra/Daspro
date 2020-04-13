import java.util.Scanner;

public class hari
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
		
		if (hari == 1)
			System.out.println("Senin");
		
			else if (hari == 2)
				System.out.println("Selasa");
				
				else if (hari == 3)
					System.out.println("Rabu");
					
					else if (hari == 4)
						System.out.println("Kamis");
					
						else if (hari == 5)
							System.out.println("Jumat");
						
							else if (hari == 6)
								System.out.println("Sabtu");
							
								else
									System.out.println("Ahad");
					
						}
					}