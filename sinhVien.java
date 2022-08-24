package sinhVien;

public class sinhVien {
	private int msSV;
	private String hoTen;
	private float lt,th;
	public int getMsSV() {
		return msSV;
	}
	public sinhVien(int msSV, String hoTen, float lt, float th) {
		super();
		this.msSV = msSV;
		this.hoTen = hoTen;
		this.lt = lt;
		this.th = th;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getLt() {
		return lt;
	}
	public void setLt(float lt) {
		this.lt = lt;
	}
	public float getTh() {
		return th;
	}
	public void setTh(float th) {
		this.th = th;
	}
	public void setMsSV(int msSV) {
		this.msSV = msSV;
	}
	public double tBinh() {
		return (lt+th)/2;
	}
}
