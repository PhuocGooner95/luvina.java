import java.util.Scanner;

/**
 * Copyright(C) [2019] [LuvinaSoftware]

 * [Bai5.java] Dec 9, 2019 Phuoc PV
 */

/**
 * @author PhuocPV
 *  Description
 */
public class Bai5 {

static Scanner sc = new Scanner(System.in);
	
	/**
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
			if(arr[i] < 0 || arr[i] > 100)
			{
				System.err.println("Gia tri phai nam trong khoang 0 den 100 \nMoi ban nhap lai : ");
				nhapMang(arr,n);
			}
		}
	}
	/**
	 * 
	 * Ham tim phan tu lon nhat cua day
	 * @param arr la mang nhap vao
	 * @param n la so phan tu cua day
	 * @return max la gia tri lon nhat cua day
	 */
	public static int maxArray(int arr[], int n)
	{
		int max = arr[0];
		for (int i = 0 ; i < n ; i++)
		{
			if (max <= arr[i])
				max = arr[i];
		}
		return max;
	}
	
	/**
	 * Ham xac dinh phan tu lon nhat trong day
	 * @param arr la mang nhap vao
	 * @param n la so luong phan tu cua mang
	 */
	public static void maxPhanTu(int arr[],int n)
	{
		System.out.println(" Phan tu lon nhat cua day la : ");
		for ( int i = 0 ; i < n ; i++)
		{
			if (maxArray(arr,n) == arr[i])
			{System.out.println("A["+i+"] = " +arr[i] );}
		}
	}

/**
 * Ham sap xep day
 * @param arr la mang nhap vao 
 * @param n la so luong phan tu
 */
	public static void sapxepDay(int arr[], int n)
	{
		int temp ;
		for (int i = 0 ; i < n ; i++)
		{
			for ( int j = 0 ; j < n ; j ++)
			{
				if (arr[i] >= arr[j])
				{
					temp = arr[i] ;
					arr[i] = arr[j];
					arr[j] = temp ;
					
				}
			}
		}
	}
	/**
	 * 
	 * Them gia tri x vao day va sap xep dung thu tu
	 * @param arr la mang nhap vao
	 * @param n la so luong phan tu
	 * @param x  la bien so nhap vao de sap xep
	 */
	public static int locationXofArray(int arr[], int n , int x)
	{
		sapxepDay(arr,n);
		int location = 0;
	
		for (int i = 0 ; i <= n ; i++)
		{
			if( x <= arr[i] && x >= arr[i+1])
			{
				location = i+1;
			}
		}
		
		return location;
		
	}
	
	public static void addXtoArray(int arr[], int n, int x)
	{
		int location = locationXofArray(arr,n,x);
		for (int i = location; i <=n ; i++)
		{
			arr[i+1] = arr[i];
			arr[location] = x;
		}
		n++;	
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print( arr[i] + "         ");
		}
		
	}
	
	
	
	/**
	 * Ham main dung de thuc thi cac ham va thuc hien cac yeu cau cua de bai
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Nhap so luong cac phan tu : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		nhapMang(arr,n);  // Nhap mang 
//		maxPhanTu(arr,n); // In ra cac phan tu lon nhat 
//		sapxepDay(arr,n);  //Sap xep day giam dan 
		System.out.println("Mang sau khi sap xep giam dan : ");
		for( int i = 0 ; i < n; i++)
		{
			System.out.print(arr[i]+"        ");
		}
	
		System.out.println("Nhap gia tri x can chen vao day : ");
		int x = sc.nextInt();
		
		System.out.println("Day sau khi chen them x : ");
		addXtoArray(arr,n,x);
		
	}

}
