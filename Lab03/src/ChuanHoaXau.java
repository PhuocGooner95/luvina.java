import java.util.Scanner;

/**
 * Copyright(C) [2019] [LuvinaSoftware]
 * [Bai6.java] Dec 9, 2019 Phuoc PV
 */

/**
 * @author PhuocPV
 *  Description
 */


public class ChuanHoaXau {
	
	static Scanner sc = new Scanner(System.in);

	 public String chuanHoa(String str) {
	        str = str.trim();
	        str = str.replaceAll("\\s+", " ");
	        return str;
	    }
	 
	    public String chuanHoaDanhTuRieng(String str) {
	        str = chuanHoa(str);
	        String temp[] = str.split(" ");
	        str = ""; // ? ^-^
	        for (int i = 0; i < temp.length; i++) {
	            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
	            if (i < temp.length - 1) // ? ^-^
	                str += " ";
	        }
	        return str;
	    }
	 
	    public static void main(String[] args) {
	        String str = sc.nextLine();
	        ChuanHoaXau chx = new ChuanHoaXau();
	        str = chx.chuanHoaDanhTuRieng(str);
	        System.out.println(str);
	    }
	}