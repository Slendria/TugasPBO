import java.util.Scanner;
public class Prisma {

	public Prisma() {}

        
	public static void main(String[] args)	{
		// TODO Auto-generated method stub
		System.out.println("Penghitung Volume Prisma (Kelvin Garcia)");
        System.out.println("==============================================");
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the area of base:");
        double base=s.nextDouble();
        System.out.println("Enter the height:");
        double height=s.nextDouble();
        

         
         double  area=base*height ;
         System.out.println("Volume Of Prism is: " + area);
	}

}
