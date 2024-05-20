package com.kientruc.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NguoiDung {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNguoiDung;
	private String tenNguoiDung;
	private int sdt;
	private String diaChi;
	
	@OneToMany(mappedBy = "nguoiDung")
	private List<PhieuNhap> phieuNhaps;
	
	public NguoiDung() {
		// TODO Auto-generated constructor stub
	}

	public NguoiDung(String tenNguoiDung, int sdt, String diaChi, List<PhieuNhap> phieuNhaps) {
		super();
		this.tenNguoiDung = tenNguoiDung;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.phieuNhaps = phieuNhaps;
	}

	public NguoiDung(String tenNguoiDung, int sdt, String diaChi) {
		super();
		this.tenNguoiDung = tenNguoiDung;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}

	public int getMaNguoiDung() {
		return maNguoiDung;
	}

	public void setMaNguoiDung(int maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}

	public String getTenNguoiDung() {
		return tenNguoiDung;
	}

	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public List<PhieuNhap> getPhieuNhaps() {
		return phieuNhaps;
	}

	public void setPhieuNhaps(List<PhieuNhap> phieuNhaps) {
		this.phieuNhaps = phieuNhaps;
	}

	@Override
	public String toString() {
		return "NguoiDung [maNguoiDung=" + maNguoiDung + ", tenNguoiDung=" + tenNguoiDung + ", sdt=" + sdt + ", diaChi="
				+ diaChi + ", phieuNhaps=" + phieuNhaps + "]";
	}
	
	
	
}
