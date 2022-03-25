//package com.ContohWebRusak.Controller;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.ContohWebRusak.Model.WebModel;
//import com.ContohWebRusak.Repository.WebRepository;
//
//@Controller
//
//public class WebController1 {
//	@Autowired
//	WebRepository webRepository;
//	
//	String judul1 = "siap";
//	String judul2 = "asik";
//	
//	@GetMapping("/")
//	private String index() {
//		return "index";
//	}
//	
//	@GetMapping("/about")
//	private String about() {
//		return "about";
//		
//	}
//	@GetMapping("/services")
//	private String services(Model model) {
//		model.addAttribute("judulModel", judul1);
//		return "services";
//	}	
//	@GetMapping("/blog")
//	private String blog(Model model,@RequestParam(value="huruf",defaultValue= "")String huruf) {
//		if(huruf.equalsIgnoreCase("")) {
//				model.addAttribute("listWeb", webRepository.findAll());
//		}else {
//			model.addAttribute("listWeb", webRepository.getUserByNama(huruf));
//		}
//		model.addAttribute("judulModel",judul1);
//		return "blog";
//
//	}
//	@GetMapping("/contact")
//	private String contact(Model model) {
//		model.addAttribute("judulModel", judul1);
////		return "contact";		
////	}
//}
