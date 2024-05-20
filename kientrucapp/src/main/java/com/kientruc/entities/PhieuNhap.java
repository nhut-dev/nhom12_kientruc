package com.kientruc.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PhieuNhap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maPhieuNhap;
	private float tongTien;
	private Date ngayTao;
	
	@Embedded
	private ChiTietPhieuNhap chiTietPhieuNhap;

	private String thietBi;
	
	@ManyToOne
	@JoinColumn(name = "maNguoiDung")
	private NguoiDung nguoiDung;
	
	public PhieuNhap() {
		// TODO Auto-generated constructor stub
	}
	
	public PhieuNhap(float tongTien, Date ngayTao, ChiTietPhieuNhap chiTietPhieuNhap, String thietBi) {
		super();
		this.tongTien = tongTien;
		this.ngayTao = ngayTao;
		this.chiTietPhieuNhap = chiTietPhieuNhap;
		this.thietBi = thietBi;
	}

	public int getMaPhieuNhap() {
		return maPhieuNhap;
	}

	public void setMaPhieuNhap(int maPhieuNhap) {
		this.maPhieuNhap = maPhieuNhap;
	}

	public float getTongTien() {
		return tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public ChiTietPhieuNhap getChiTietPhieuNhap() {
		return chiTietPhieuNhap;
	}

	public void setChiTietPhieuNhap(ChiTietPhieuNhap chiTietPhieuNhap) {
		this.chiTietPhieuNhap = chiTietPhieuNhap;
	}

	public String getThietBi() {
		return thietBi;
	}

	public void setThietBi(String thietBi) {
		this.thietBi = thietBi;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	@Override
	public String toString() {
		return "PhieuNhap [maPhieuNhap=" + maPhieuNhap + ", tongTien=" + tongTien + ", ngayTao=" + ngayTao
				+ ", chiTietPhieuNhap=" + chiTietPhieuNhap + ", thietBi=" + thietBi + ", nguoiDung=" + nguoiDung + "]";
	}
	
	
	
}
