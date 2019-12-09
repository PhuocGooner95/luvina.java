import java.util.Scanner;

/**
 * Copyright(C) [2019] [LuvinaSoftware]
 * [Bai1.java] Dec 8, 2019 Phuoc PV
 */

/**
 * @author PhuocPV
 *  Chuong trinh thuat toan sap xep nhanh
 */
public class Bai1 {

	/**
	 * Des
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n : ");
		int n ;	
		n = sc.nextInt();
		int arr[] = new int[n];
		
		
		for ( int i = 0 ; i < n ; i ++)
		{
			 arr[i] = sc.nextInt();
		}
		System.out.println("Xuat mang vua nhap");
		for(int i = 0 ; i < n ; i++) {
			System.out.print("    " + arr[i] + "   ");
		}

	}

}
