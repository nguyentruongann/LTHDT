package CongNhan;

import java.util.Scanner;

public class DanhSachCongNhan {

	private CongNhan[] list;
	int count;
	Scanner sc=new Scanner(System.in);
	
	public DanhSachCongNhan(int n) {
		super();
		list=new CongNhan[n];
		this.count = 0;
	}
	
	public boolean addCongNhan(CongNhan add) {
		if(list.length==count) {
			return false;
		}
		else {
			list[count]=add;
			count++;
		}
		return true;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static void sWap(CongNhan a,CongNhan b) {
		String tam=a.getmCN();
		a.setmCN(b.getmCN());
		b.setmCN(tam);
		String tam1=a.getmTen();
		a.setmTen(b.getmTen());;
		b.setmTen(tam1);
		int tam2=a.getmSoSP();
		a.setmSoSP(b.getmSoSP());
		b.setmSoSP(tam2);
	}
	
	public void xoaCN(String K) {
		for(int i=0;i<count;i++) 
			if(list[i].getmCN().equals(K)) {
				for(int j=i;j<count;j++) {
					list[j]=list[j+1];
				}
				count--;
				return;
				}
	}
	public void sapXep() {
		int s;
		for(int i=1;i<count;i++) {
			s=i;
			for(int j=i;j<count;j++) {
				if(list[s].getmSoSP()>list[j].getmSoSP()) {
					s=j;
				}
				sWap(list[s], list[i]);
				
			}
		}
		
	}
	public void xuat() {
		System.out.println("Danh Sach Cong Nhan: ");
		for(int i=0;i<count;i++) 
			System.out.println(list[i]);
	}
}
