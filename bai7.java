package Bai7;

import java.text.ParseException;
import java.time.LocalDate;
public class bai7 {
	private String maHang ;
	private String tenHang="xxx";
	private float donGia;
	private LocalDate ngaySX;
	private LocalDate ngayHetHan;
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia =  donGia;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public bai7(String maHang, String tenHang, float donGia, LocalDate ngaySX, LocalDate ngayHetHan) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
		this.ngayHetHan = ngayHetHan;
	}
	
	public boolean hetHan() {
		return	ngayHetHan.isBefore(LocalDate.now())?true:false;		
	}
	
	public String toString() {
		String k;
		if (hetHan())
			k="Da Het Han";
		else 
			k="Con Han";
		String s="";
		s+=s.format("%10s\t\t%10s\t\t%10.2f"+"\t\t"+getNgaySX()+"\t\t"+getNgayHetHan()+"\t\t"+k,getMaHang(),getTenHang(),getDonGia());
		return s;
	}
	
}
