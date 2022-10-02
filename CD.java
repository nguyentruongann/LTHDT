
public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private float giaThanh;

	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public float getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}
	//	public CD(int maCD, String tuaCD, int soBaiHat, Double giaThanh) {
//		super();
//		this.maCD = maCD;
//		this.tuaCD = tuaCD;
//		this.soBaiHat = soBaiHat;
//		this.giaThanh = giaThanh;
//	}
	public CD(int maCD,String tuaCD,int soBaiHat ,float giaThanh) {
		super();
		this.maCD =maCD;
		if(tuaCD=="")
			this.tuaCD = "Chua Xac Dinh";
		else 
			this.tuaCD=tuaCD;
		if(soBaiHat <0)
			System.out.println("Khong hop le");
		else	
			this.soBaiHat = soBaiHat;
		if(giaThanh <0)
			System.out.println("Khong hop le");
		else
			this.giaThanh =giaThanh ;
	}
	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", giaThanh=" + giaThanh + "]";
	}

//	public String toString() {
//		String s="";
//		s+=s.format("%d\t\t%s\t\t%d\t\t\t%.2",getMaCD(),getTuaCD(),getSoBaiHat(),getGiaThanh());
//		return s;
//	}
}