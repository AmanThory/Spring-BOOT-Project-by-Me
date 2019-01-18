package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.User;
import com.example.demo.repository.UserRepo;

@Controller
public class UserController {

	@Autowired
	UserRepo urepo;
	
	@Autowired
	User user2;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		StringTrimmerEditor st = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, st);		
	}
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index.jsp");
		
		return mv;
	}
	
	@RequestMapping("/show")
	public String showRegister(Model model) {
		
		model.addAttribute("user", user2);
		
		return "register.jsp";
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user") User user , BindingResult result) {
		
		System.out.println("This is Validation Method..."); 
		
		if(result.hasErrors()) {
			return "register.jsp";
		}

		urepo.save(user);
		return "redirect:login.jsp";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String uemail,@RequestParam String upassword) {
		
		User user = urepo.login(uemail, upassword);
		ModelAndView mv = new ModelAndView("welcome.jsp");
		mv.addObject("user", user);
		
		return mv;
	}
	
	@RequestMapping("/allData")
	public ModelAndView all() {
		
		List<User> user = (List<User>) urepo.findAll();
		ModelAndView mv = new ModelAndView("allData.jsp");
		mv.addObject("user", user);
		
		return mv;
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") Integer id) {

		urepo.deleteById(id);
		return "redirect:/allData";
	}
	
	@RequestMapping("/updateShowData")
	public ModelAndView update(@RequestParam("id") Integer id) {
		
		User user = urepo.update(id);
		ModelAndView mv = new ModelAndView("update.jsp");
		mv.addObject("user", user);
		
		return mv;
	}
	
/*	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update( ) {
		System.out.println("update...");
		urepo.update(user);
		
		return "redirect:/allData";
	}
	*/
}





