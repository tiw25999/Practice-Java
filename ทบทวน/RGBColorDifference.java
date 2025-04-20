import java.util.Scanner;

public class RGBColorDifference
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("RGB Color1: ");
		double c11= sc.nextDouble();
		double c12= sc.nextDouble();
		double c13= sc.nextDouble();
		System.out.print("RGB Color2: ");
		double c21= sc.nextDouble();
		double c22= sc.nextDouble();
		double c23= sc.nextDouble();
        double sum = Math.sqrt(Math.pow((c21 - c11),2) + Math.pow((c22 - c12),2) + Math.pow((c23 - c13),2));
		System.out.print("Color Difference = "+sum); }
}