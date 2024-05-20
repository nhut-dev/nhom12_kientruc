package com.kientruc.entities;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietPhieuNhap {
	
	private int soLuong;
	private float gia;
	private String tinhTrang;
	private String chiTiet;
	
	public ChiTietPhieuNhap() {
		// TODO Auto-generated constructor stub
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String getChiTiet() {
		return chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}

	public ChiTietPhieuNhap(int soLuong, float gia, String tinhTrang, String chiTiet) {
		super();
		this.soLuong = soLuong;
		this.gia = gia;
		this.tinhTrang = tinhTrang;
		this.chiTiet = chiTiet;
	}

	@Override
	public String toString() {
		return "ChiTietPhieuNhap [soLuong=" + soLuong + ", gia=" + gia + ", tinhTrang=" + tinhTrang + ", chiTiet="
				+ chiTiet + "]";
	}
	
	
}
