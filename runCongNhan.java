package CongNhan;

import java.util.Scanner;

public class runCongNhan {
	static Scanner sc=new Scanner(System.in);
	static DanhSachCongNhan list=new DanhSachCongNhan(100);
	public static CongNhan inputDSCN() {
		System.out.println("Nhap ma cn: ");
		String mCN=sc.next();
		System.out.println("Nhap ten cong nhan:");
		String mTen=sc.next();
		System.err.println("Nhap so luong SP: ");
		int mSP=sc.nextInt();
		CongNhan CN=new CongNhan(mCN, mTen, mSP);
		return CN;
	}
	public static void main(String[] args) {
//		CongNhan cn1,cn2,cn3;
//		cn1=inputDSCN();
//		cn2=inputDSCN();
//		cn3=inputDSCN();
		CongNhan cn1=new CongNhan("001", "An dz", 400);
		CongNhan cn2=new CongNhan("002", "An coding", 6666);
		CongNhan cn3=new CongNhan("003", "annnnn", 555);
		
		list.addCongNhan(cn1);
		list.addCongNhan(cn2);
		list.addCongNhan(cn3);
		System.out.println("Danh Sach Cong Nhan: ");
		boolean choose=true;
		do {
			System.out.println("1.Xuat Danh Sach.");
			System.out.println("2.Add vao danh sach.");
			System.out.println("3.Xoa theo ma");
			System.out.println("4.Sap Xep tang dan theo so luong.");
			System.out.println("Nhap lua chon");
			int m=sc.nextInt();
			switch (m) {
			case 1: {
				list.xuat();
				break;
			}
			case 2:{
				CongNhan cnadd;
				System.out.println("Nhap cong nhan can them: ");
				cnadd=inputDSCN();
				list.addCongNhan(cnadd);
				break;
			}
			case 3:{
				System.out.println("Nhap Ma CN can xoa");
				String s=sc.next();
				list.xoaCN(s);
				break;
			}
			case 4:{
				list.sapXep();
				list.xuat();
				break;
			}
			default:
				System.out.println("End");
				choose=false;
				break;
			}
		}while(choose);
	}
}
