package CongNhan;

public class CongNhan {
	

	private String mCN;
	private String mTen;
	private int mSoSP;
	
	
	public String getmCN() {
		return mCN;
	}
	public void setmCN(String mCN) {
		this.mCN = mCN;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	
	/**
	 * @param mCN
	 * @param mTen
	 * @param mSoSP
	 */
	public CongNhan(String mCN, String mTen, int mSoSP) {
		super();
		this.mCN = mCN;
		this.mTen = mTen;
		if(getmSoSP()>0)
			System.out.println("Khong hop le");
		else
			this.mSoSP = mSoSP;
	}
	
	public float tinhLuong(int mSoSP) {
		if(getmSoSP()>=0&&getmSoSP()<200)
			return (float) (getmSoSP()*0.5);
		else if(getmSoSP()<400)
			return (float) (getmSoSP()*0.55);
		else if(getmSoSP()<600)
			return (float) (getmSoSP()*0.6);
		else 
			return (float) (getmSoSP()*0.65);
	}
	@Override
	public String toString() {
		return "CongNhan [mHo=" + mCN + ",\tmTen=" + mTen + ",\tmSoSP=" + mSoSP + ",\tTien Luong="+tinhLuong(getmSoSP())+"]";
	}
}
