import java.util.Scanner;
public class listCD {
	public CD[] ls;
	int count;
	static Scanner sc=new Scanner(System.in);
	public listCD(int n) {
		ls=new CD[n];
		count =0;
	}
	public boolean addCD(CD cdr) {
		for(int i=0;i<count;i++) 
			if(cdr.getMaCD()==ls[i].getMaCD()) {
				return false;}
			ls[count]=cdr;
			count++;
			return true;
	}
	public int soLuongCD() {
		return count;
	}
	public void xoaCDTheoMa(int k) {
		for(int i=0;i<count;i++) {
			if(ls[i].getMaCD()==k) {
				for(int j=i;j<count-1;j++) {
					ls[j]=ls[j+1];
				}
				count--;
				return;
			}
		}
	}

	public float sumGiaThanh() {
		int s=0;
		for(int i=0;i<count;i++) {
			s+=ls[i].getGiaThanh()*ls[i].getSoBaiHat();
		}return s;
	}
	public static void testSwap(CD a, CD b) {
		float tam=a.getGiaThanh();
		a.setGiaThanh(b.getGiaThanh());
		b.setGiaThanh(tam);
		int tam1=a.getMaCD();
		a.setMaCD(b.getMaCD());
		b.setMaCD(tam1);
		String tam2=a.getTuaCD();
		a.setTuaCD(b.getTuaCD());
		b.setTuaCD(tam2);
		int tam3=a.getSoBaiHat();
		a.setSoBaiHat(b.getSoBaiHat());
		b.setSoBaiHat(tam3);
}
	public void sortTangDan() {
		int s;
		for(int i=0;i<count;i++) {
			s=i;
			for(int j=i+1;j<count;j++) {
				if(ls[s].getTuaCD().compareTo(ls[j].getTuaCD())>0) {
					s=j;
				}
				if(i!=s) {
				testSwap(ls[i], ls[s]);
				}
			}
		}
		
	}
	public void sortGiamDan() {
		int max;
		for(int i=0;i<count-1;i++){
			max=i;
			for(int j=i+1;j<count;j++){
				if(ls[max].getGiaThanh()<ls[j].getGiaThanh()) {
					max=j; 
				}
				if(i!=max) {
						testSwap(ls[max], ls[i]);
				}
			}
		}
	}
	public int search(int macd) {
		for(int i=0;i<count;i++) {
			if(ls[i].getMaCD()==macd) {
				return i;
			}
		}
		return -1;
	}
	public void searchh(listCD ls) {
		System.out.println("\nNhap ma CD can tim: ");
		int z=sc.nextInt();
		ls.search(z);
		if(ls.search(z)!=-1) {
			System.out.println("Vi tri can tim la vi tri thu :"+ls.search(z));
		}
		else 
			System.out.println("Khong tim thay");
	}
	public void kq() {
		for(int i=0;i<count;i++)
			if(ls[i]!=null)
				System.out.println(ls[i]);
	}
}

