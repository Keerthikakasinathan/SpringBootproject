package com.example.Springboot.Springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Springboot.Springboot.Model.Boutique;
import com.example.Springboot.Springboot.Repository.BoutiqueRepository;

@Controller
public class BoutiqueController {
	@Autowired(required=true)
	private BoutiqueRepository resp;
	@RequestMapping("Home")
	public String user() {
		return "Home.jsp";
	}
	@RequestMapping("adduser")
	public String adduser(Boutique boutique) {
		resp.save(boutique);
		return "Home.jsp";
	}
	@RequestMapping("getuser")
	public ModelAndView getuser(@RequestParam int shopno) {
		ModelAndView mav=new ModelAndView("showuser.jsp");
		Boutique boutique=resp.findById(shopno).orElse(new Boutique());
	    mav.addObject(boutique);
	    return mav;
	}
	@RequestMapping("deleteuser")
	public ModelAndView deleteuser(@RequestParam int shopno) {
		ModelAndView mav=new ModelAndView("deleteuser.jsp");
		Boutique boutique=resp.findById(shopno).orElse(new Boutique());
	    resp.deleteById(shopno);
	    mav.addObject(boutique);
	    return mav;
	}
	@RequestMapping("updateuser")
	public ModelAndView deleteuser(Boutique boutique) {
		ModelAndView mav=new ModelAndView("updateuser.jsp");
		boutique=resp.findById(boutique.getShopno()).orElse(new Boutique());
	    resp.deleteById(boutique.getShopno());
	    mav.addObject(boutique);
	    return mav;
	}
}
