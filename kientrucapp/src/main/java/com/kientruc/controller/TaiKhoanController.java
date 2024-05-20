package com.kientruc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kientruc.entities.TaiKhoan;
import com.kientruc.service.TaiKhoanService;

@Controller
@RequestMapping("/taikhoan")
public class TaiKhoanController {
	
	@Autowired
	private TaiKhoanService service;
	
	@GetMapping("/dangKy")
	public ModelAndView formRegister() {
		return new ModelAndView("dangKy", "command", new TaiKhoan());
	}
	
	@PostMapping("/submit-dangky")
	public String addRegister(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan) {
		service.taoTaiKhoan(taiKhoan);
		return "redirect:/app/view-list";
	}
	
	@GetMapping("/dangNhap")
	public ModelAndView formLogin() {
	    return new ModelAndView("dangNhap", "command", new TaiKhoan());
	}
	
	@PostMapping("/check-dangnhap")
	public String checkLogin(@RequestParam("tenTaiKhoan") String tenTaiKhoan, @RequestParam("matKhau") String matKhau) {
	    TaiKhoan taiKhoan = service.dangNhap(tenTaiKhoan, matKhau);
	    if ("admin".equals(tenTaiKhoan) && "123".equals(matKhau)) {
	        return "redirect:/app/view-list-admin";
	    } else if (taiKhoan != null) {
	        return "redirect:/app/view-list";
	    } else {
	        System.out.println("Tên đăng nhập không hợp lệ");
	        return "redirect:/taikhoan/dangNhap";
	    }
	}
	
	
	@GetMapping("/logout")
	public String logout() {
		return "redirect:/taikhoan/dangNhap";
	}
}
