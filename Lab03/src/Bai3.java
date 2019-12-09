import java.util.Scanner;

/**
 * Copyright(C) [2019] [LuvinaSoftware]
 * [Bai3.java] Dec 8, 2019 Phuoc PV
 */

/**
 * @author PhuocPV
 *  Description
 */
public class Bai3 {

	/**
	 * Bai 3 : Nhap mang va tim gia tri x xuat hien 2 lan
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 
	 * HAm nhap mang
	 * @param Nhap vao n va nhap cac gia tri cua mang 
	 * @param Khong co gia tri tra ve
	 */
	public static void nhapMang(int arr[],int n)
	{
		System.out.println("Nhap cac gia tri : ");
		for (int i = 0 ; i < n ; i ++ )
		{
			System.out.print(" arr ["+i+"] = ");
			arr[i] = sc.nextInt();
		}
	}
	
	/**
	 * 
	 * Ham dem so lan xuat hien cua x trong mang 
	 * @param Nhap mang arr, n va so x can tim
	 * @return cout la so lan xuat hien cua x
	 */
	public static int findX(int arr[], int n, int x)
	{
		int count = 0;
		for (int i = 0 ; i < n ; i ++ )
		{
			if (arr[i] == x )
			{
				count ++ ;
			}
		}
		
		return count;
		
	}
	
	/**
	 * 
	 * Ham kiem tra xem x co xuat hien 2 lan hay khong
	 * @param arr la mang nhap vao
	 * @param n la so phan tu cua mang
	 * @param x la gia tri can tim kiem
	 * @return x co xuat hien dung 2 lan hay khong
	 */
//	public static boolean kiemtraX(int arr[], int n, int x)
//	{
//		if (findX(arr,n,x) == 2 )
//		{
//			return true;
//		}
//		return false;
//		
//	}
	public static void main(String[] args) {
		
		System.out.println(" NHap n : ");
		int n = sc.nextInt();      // Nhap gia tri cua n tu man hinh
		int arr[] = new int[n]; // Khoi tao bien mang arr[] voi n phan tu
	
		System.out.println("Nhap mang : ");
		nhapMang(arr,n);          // Goi ham nhapmang() de nhap cac phan tu mang arr
		
		System.out.println(" Nhap gia tri x can kiem tra : ");
		int x = sc.nextInt();          // Nhap gia tri cua x can kiem tra
		
		System.out.println(" findx : " +findX(arr,n,x)); // In ra so lan xuat hien cua x
		int temp = 0;
		for(int i = 0 ; i < n ; i ++ )
		{
			
			 if (findX(arr,n,x)==2 && arr[i] == x)
			 {
				 System.out.println("    " +arr[i]+"    ");
				 temp ++;
			 }
			
		}
		if (temp==0) {
			System.out.println("X khong xuat hien 2 lan ");
		}
		
		
	}

}
