package com.kientruc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class TaiKhoan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maTaiKhoan;
	private String name;
	private String tenTaiKhoan;
	private String matKhau;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private PhieuNhap phieuNhap;
	
	public TaiKhoan() {
		// TODO Auto-generated constructor stub
	}

	public TaiKhoan(String name, String tenTaiKhoan, String matKhau, PhieuNhap phieuNhap) {
		super();
		this.name = name;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.phieuNhap = phieuNhap;
	}

	public TaiKhoan(String name, String tenTaiKhoan, String matKhau) {
		super();
		this.name = name;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
	}

	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public PhieuNhap getPhieuNhap() {
		return phieuNhap;
	}

	public void setPhieuNhap(PhieuNhap phieuNhap) {
		this.phieuNhap = phieuNhap;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maTaiKhoan=" + maTaiKhoan + ", name=" + name + ", tenTaiKhoan=" + tenTaiKhoan + ", matKhau="
				+ matKhau + ", phieuNhap=" + phieuNhap + "]";
	}
	
	
}
