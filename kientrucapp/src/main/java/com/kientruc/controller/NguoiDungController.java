package com.kientruc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kientruc.entities.NguoiDung;
import com.kientruc.service.NguoiDungService;

@Controller
@RequestMapping("/nguoidung")
public class NguoiDungController {

	@Autowired
	private NguoiDungService service;

	@GetMapping("/view-list-admin-nguoidung")
	public ModelAndView viewListAdmin() {
		return new ModelAndView("view-list-admin-nguoidung", "nguoiDung", service.getListNguoiDung());
	}

	@GetMapping("/form-add-nguoidung")
	public ModelAndView formAdd() {
		return new ModelAndView("form-add-nguoidung", "command", new NguoiDung());
	}

	@GetMapping("/form-update-nguoidung")
	public ModelAndView formUpdate(@RequestParam("maNguoiDung") int id) {
		return new ModelAndView("form-update-nguoidung", "command", service.getNguoiDung(id));
	}

	@GetMapping("/delete-nguoidung")
	public String delete(@RequestParam("maNguoiDung") int id) {
		service.deleteNguoiDungs(id);
		return "redirect:/nguoidung/view-list-admin-nguoidung";
	}

	@PostMapping("/submit-update-nguoidung")
	public String update(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
		return "redirect:/nguoidung/view-list-admin-nguoidung";
	}

	@PostMapping("/form-add-sumit-nguoidung")
	public String addNguoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
		service.addNguoiDungs(nguoiDung);
		return "redirect:/nguoidung/view-list-admin-nguoidung";
	}

}
