import java.util.Scanner;

public class runCD{
	static Scanner sc=new Scanner(System.in);
	static listCD ls=new listCD(6);
	public static CD inputList() {
		System.out.println("Nhap ma cd: ");
		int maCD=sc.nextInt();
		System.out.println("Nhap Tua CD:");
		String tuaCD=sc.next();
		System.out.println("Nhap so luong bai hat:");
		int soBaiHat=sc.nextInt();
		System.out.println("Nhap gia: ");
		float giaThanh=sc.nextFloat();
		CD cd=new CD(maCD, tuaCD, soBaiHat, giaThanh);
		return cd;
	}
	public static void main(String[] args) {
//Bo Test
//		CD cd1=new CD(123,"s", 3, 4000);
//		CD cd2=new CD(234,"a", 1, 5000);
//		CD cd3=new CD(345,"a", 2, 7000);
//		CD cd4=new CD(456,"v", 6, 2000);
//		CD cd5=new CD(567,"d", 4, 1000);
//		ls.addCD(cd1);
//		ls.addCD(cd2);
//		ls.addCD(cd3);
//		ls.addCD(cd4);
//		ls.addCD(cd5);
		
		CD cd1,cd2;
		cd1=inputList();
		cd2=inputList();
		ls.addCD(cd1);
		ls.addCD(cd2);
		//Menu
		int n;
		boolean k=true;
		do {
		
			System.out.println("1.Xoa CD theo ma.");
			System.out.println("2.So luong CD.");
			System.out.println("3.Tong gia thanh.");
			System.out.println("4.Sap xep tang dan theo tua CD.");
			System.out.println("5.Sap xep giam dan theo gia thanh.");
			System.out.println("6.Tim kiem vi tri CD theo maCD.");
			System.out.println("7.Xuat List CD.");
			System.out.printf("Nhap lua chon: ");
			n=sc.nextInt();
			switch (n) {
			case 1: {
				System.out.printf("Nhap maCd can xoa: ");
				int k1=sc.nextInt();
				ls.xoaCDTheoMa(k1);
				break;
			}
			case 2:{
				System.out.println("So luong CD la:"+ls.soLuongCD());
				break;
			}
			case 3:{
				System.out.println("Tong gia thanh cac CD la: "+ls.sumGiaThanh());
				break;
			}
			case 4:{
				ls.sortTangDan();
				break;
			}
			case 5:{
				ls.sortGiamDan();
				break;
			}
			case 6:{
				ls.searchh(ls);
				break;
			}
			case 7:{
				System.out.println("-----------------------------------List CD-----------------------------------");
				ls.kq();
				break;
			}
			default:
				System.out.println("Bye Bye...");
				k=false;
				break;
			}
		}while(k);
	}
}
