import java.util.Scanner;

/**
 * Copyright(C) [2019] [LuvinaSoftware]
 * [Bai4.java] Dec 9, 2019 Phuoc PV
 */

/**
 * @author PhuocPV
 *  Bai tap 4 : Nhap vao ma tran 2 chieu va tinh tong duong cheo chinh
 */
public class Bai4 {
	// Tao bien static Scanner sc dung de nhap tu ban phim 
	// Dung chung cho tat ca cac bien
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Ham nhap mang 2 chieu n*n
	 * Nhap vao cac gia tri cua n phan tu mang array tu ban phim
	 */
	public static void nhapMang(int array[][], int n)
	{
		System.out.println("Nhap cac phan tu cua mang : ");
		for (int i = 0 ; i < n ; i++ )
		{
			for ( int j = 0 ; j < n ; j++)
			{
				System.out.println("Array["+i+"]["+j+"] = ");
				array[i][j] = sc.nextInt();
			}
		}
	}
	
	/**
	 * Ham tinh tong duong cheo chinh cua ma tran
	 * Nhap vao ma tran array[n][n]
	 * In ra tong duong cheo chinh
	 */
	public static int sumDuongCheo(int array[][], int n)
	{
		int sum = 0 ;
		for (int i = 0 ; i < n ; i++)
		{
			sum += array[i][i];//cac phan tu tren duong cheo chinh la a[i][i]
		}
		return sum;
		
	}
	
	/**
	 * Ham in cac phan tu ma tran ra man hinh
	 * Nhap vao cac phan tu ma tran va in ra man hinh
	 */
	public static void xuatMaTran(int array[][], int n)
	{
		System.out.println("Ma tran vua nhap : ");
		for (int i = 0 ; i < n ; i ++)
		{
			for (int j = 0 ; j < n ; j ++)
			{
				System.out.print(array[i][j]+"        ");
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * Ham main dung de thuc hien cac yeu cau de bai
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Nhap so luong phan tu cua mang : ");
		int n = sc.nextInt();   // Nhap n tu ban phim
		int array[][] = new int[n][n];  // Tao mang ma tran array[n][n] phan tu
		
		nhapMang(array,n); // Nhap n phan tu mang tu ban phim
		xuatMaTran(array,n);
		
		System.out.println("Tong cac phan tu tren duong cheo chinh : "+sumDuongCheo(array,n));
		// In tong cac phan tu tren duong cheo ra man hinh
		
		

	}

}
