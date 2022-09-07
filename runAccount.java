package bai8;

import java.util.Scanner;

public class runAccount {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		account acc1=new account("Ted Murphy", 72354, 100000);
		account acc2=new account("Jane Smith", 69713, 40000);
		account acc3=new account("Edward Demsey", 93757, 700000);
		acc1.napTien(acc1, 250000.0);
		acc2.napTien(acc2, 500000.0);
		acc2.rutTien(acc2, 430000.0, 2000.0);
		acc3.tienLai(acc3);
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		acc1.chuyenTien(acc1, acc2, 100000.0);
		System.out.println(acc1);
		System.out.println(acc2);
	}
}
