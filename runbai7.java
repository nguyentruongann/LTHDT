package Bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class runbai7 {
	static Scanner sc = new Scanner(System.in);
	public static bai7 inPut() {
			System.out.print("Ma TP: ");
			String maHang=sc.next();
			System.out.print("Ten tp: ");
			String tenHang=sc.next();
			System.out.print("Gia tp: ");
			float gia=sc.nextFloat();
			System.out.print("Ngay san xuat: ");
			String nsxtp1=sc.next();
			System.out.print("Ngay het han: ");
			String nhhtp1=sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateNSXtp1=LocalDate.parse(nsxtp1, formatter);
			LocalDate dateNHHtp1=LocalDate.parse(nhhtp1, formatter);
			bai7 tp=new bai7(maHang, tenHang, gia, dateNSXtp1,dateNHHtp1);
			return tp;
	}
	public static void main(String[] args) {
//		String nsxtp1="01/09/2021";
//		String nhhtp1="01/09/2022";
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate dateNSXtp1=LocalDate.parse(nsxtp1, formatter);
//		LocalDate dateNHHtp1=LocalDate.parse(nhhtp1, formatter);
//		String tp1nsx=dateNSXtp1.format(formatter);
//		String tp1nhh=dateNSXtp1.format(formatter);
//		HangThucPham tp1=new HangThucPham("001", "H2S04", 1000,dateNSXtp1, dateNHHtp1);
//		System.out.println(tp1);
		bai7 tp1,tp2;
		System.out.println("Nhap tp1");
		tp1=inPut();
		System.out.println("Nhap tp2");
		tp2=inPut();
		System.out.println("MaHang\t\tTenHang\t\tGia\t\tNgaySX\t\t\tNgayHH\t\t\tGhiChu");
		System.out.println(tp1);
		System.out.println(tp2);
		
	}
}
