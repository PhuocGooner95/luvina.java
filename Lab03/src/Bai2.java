import java.util.Scanner;

/**
 * Copyright(C) [2019] [LuvinaSoftware]

 * [Bai2.java] Dec 8, 2019 Phuoc PV
 */

/**
 * @author PhuocPV
 *  Tim so Fibonaci thu n
 */
public class Bai2 {

	/**
	 * Tim so Fibonaci thu n
	 * @param Nhap vao n
	 * Tra ve Fibonaci thu n
	 */
	
	public static int Fibonaci(int n)
	{
		if (n <= 0)
			return 0;
		if(n==1||n==2) {
			return 1;
		}	
		return  Fibonaci(n-1) + Fibonaci(n-2);
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n : ");
		int n = sc.nextInt();
		
		System.out.println(" So Fibonaci thu " +n+ " la : "+ Fibonaci(n));
		
	}

}
