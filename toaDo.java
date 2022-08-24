package toaDo;

public class toaDo {
	private String ten;
	private int x,y;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public toaDo(String ten, int x, int y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String s="";
		s+=s.format("%s(%d,%d)",getTen(),getX(),getY());
		return s;
	}
}
