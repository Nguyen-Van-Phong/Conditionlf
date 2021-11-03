package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		//9.1 
		Scanner  sc = new Scanner(System.in);
		System.out.println("nhap so nguyen a");
		int a = sc.nextInt();
		if (a>=0) {
			System.out.println("a la so nguyen duong ");
		}else{
			if(a==0) {
				System.out.println("a la so khong duong khong am");
			}else
				System.out.println("a la so nguyen am");
			}
				// 9.2 
		System.out.println("nhap vao so nguyen n:");
		int n = sc.nextInt();
		if (n % 3 ==0) {
			System.out.println("chia het cho 3");
		}
		if (n % 5 ==0) {
				System.out.println("chia het cho 5");
				}
		else {
			System.out.println("khong chia het cho 5");
		}
				// 9.3 
		System.out.println("Nhap thang trong nam ");
		int t = sc.nextInt();
		if( t == 1 || t== 3 || t==5 || t==7 || t==8 || t==10 || t==12)
			System.out.println("thang co 31 ngay ");
		else if( t ==4 || t ==6|| t ==9|| t ==11)
			System.out.println("thang co 30 ngay ");
		else if( t==2 )
			System.out.println("Thang co 28 ngay");
		//9.4 
		Scanner scpt = new Scanner(System.in);
		System.out.println("Nhap he so bac 2, d = ");
		float d = sc.nextFloat();
		System.out.println("Nhap he so bac 1, b = ");
		float b = sc.nextFloat();
		System.out.println("Nhap he so tu do, c = ");
		float c = sc.nextFloat();
		// kiem tra he so
		if (d==0) {
			if (b==0) {
				System.out.println("Phuong trinh vo nghiem");
			}else {
				System.out.println("Phuong trinh co 1 nghiem: " + " x = " + (-d/c));
				
			  }
			}
			// tinh delta
			float delta = b*b - 4*a*c;
			float x1;
			float x2;
			// tinh nghiem phuong trinh
			if (delta > 0) {
				x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
				x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
				System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + "va x2 = " + x2);
			}else {
				System.out.println("Phuong trinh vo nghiem");
				
			}
		//9.5	
			System.out.println("Nhap g: ");
			int g = sc.nextInt();
			System.out.println("Nhap h: ");
			int h = sc.nextInt();
			System.out.println("Nhap u: ");
			int u = sc.nextInt();
			System.out.println("Day la mot tam giac");
			System.out.println("g,h,u la ba canh cau mot tam giac");
 }
 }		
		
		
		
	
		
		
	
	

	
