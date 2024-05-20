package com.kientruc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kientruc.entities.PhieuNhap;
import com.kientruc.service.PhieuNhapService;

@Controller
@RequestMapping("/app")
public class PhieuNhapController {
	@Autowired
	private PhieuNhapService service;
	@GetMapping("/view-list")
	public ModelAndView viewList() {
		return new ModelAndView("view-list", "phieuNhap", service.getListPhieuNhap());
	}
	
	@GetMapping("/view-list-admin")
	public ModelAndView viewListAdmin() {
		return new ModelAndView("view-list-admin", "phieuNhap", service.getListPhieuNhap());
	}
	
	@GetMapping("/form-add")
	public ModelAndView formAdd() {
		return new ModelAndView("form-add", "command", new PhieuNhap());
	}
	@GetMapping("/form-update")
	public ModelAndView formUpdate(@RequestParam("maPhieuNhap") int id) {
		return new ModelAndView("form-update", "command", service.getPhieuNhap(id));
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("maPhieuNhap") int id) {
		service.deletePhieuNhap(id);
		return "redirect:/app/view-list-admin";
	}
	@PostMapping("/submit-update")
	public String update(@ModelAttribute("phieuNhap") PhieuNhap phieuNhap) {
		return "redirect:/app/view-list-admin";
	}
	@PostMapping("/form-add-sumit")
	public String addPhieuNhap(@ModelAttribute("phieuNhap") PhieuNhap phieuNhap) {
		service.addPhieuNhap(phieuNhap);	
		return "redirect:/app/view-list-admin";
	}
}
