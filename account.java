package bai8;


public class account {

	private long accoutNumber;
	private String name;
	private double blance;
	private final Double rate=0.035;
//	public account() {
//		accoutNumber = 99999;
//		name = "Chua Xac Dinh";
//		blance = 50000;
//	}
	public account( String name,long accoutNumber, double blance) {
		super();
		this.accoutNumber = accoutNumber;
		this.name = name;
		this.blance = blance;
	}
	public long getAccoutNumber() {
		return accoutNumber;
	}
	public void setAccoutNumber(long accoutNumber) {
		this.accoutNumber = accoutNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBlance() {
		return blance;
	}
	public void setBlance(Double blance) {
		this.blance = blance;
	}
	public Double getRate() {
		return rate;
	}
	public boolean deposit(double amount) {	
		if(amount>0)
			return true;
		else return false;
	}
	public boolean withdraw(double amount) {	
		if(amount>0)
			return true;
		else return false;
	}
	public void napTien(account acc,double k) {
		if(deposit(k)==true) {
			acc.setBlance(acc.getBlance()+k);
			System.out.println("Nap Tien OK.");
		}
		else {
			System.out.println("Khong the nap Tien.");
		}
	}
	public void rutTien(account acc,double k,double fee) {
		if(withdraw(k)==true&&blance>k) {
			acc.setBlance(acc.getBlance()-k-fee);
			System.out.println("Rut Tien OK.");
		}
		else {
			System.out.println("Khong the Rut Tien.");
		}
	}
	public void tienLai(account acc) {
		acc.setBlance(acc.getBlance()+acc.getBlance()*rate);
		System.out.println("Tien lai ok");
	}
	public void chuyenTien(account acc1, account acc2,double k) {
		if(acc2.getBlance()>k&&k>0) {
			acc2.setBlance(acc2.getBlance()-k);
			acc1.setBlance(acc1.getBlance()+k);
			System.out.println("Chuyen Tien Ok.");
		}
		else {
			System.out.println("Khong the chuyen tien");
		}
	}
	@Override
	public String toString() {
		return "account [accoutNumber=" + accoutNumber + ", name=" + name + ", blance=" + blance +"d" + ", rate=" + rate
				+ "]";
	}
	
}
