package net.codejava.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.Model.Upcoming;

@Controller
public class UpcomingAppController {
	
	
	@Autowired
	private UpcomingService service1;

	/*@RequestMapping(value="/1")
	public String viewHomePage(Model model)
	{
		List<Upcoming> listU = service1.listAll();
		model.addAttribute("listU", listU);
		
		return "index";
	}*/
	
	@RequestMapping("/new1")
	public String showNewUpcomingForm(Model model1)
	{
		Upcoming u = new Upcoming();
		model1.addAttribute("u", u);
		return "new_upcoming";
	}
	
	@RequestMapping(value = "/save1", method = RequestMethod.POST)
	public String saveUpcoming(@ModelAttribute("u") Upcoming u)
	{
		service1.save(u);
		return "redirect:/";
	}
	
	@RequestMapping("/edit1/{idu}")
	public ModelAndView editUpcomingForm(@PathVariable(name ="idu")Long idu)
	{
		ModelAndView mav = new ModelAndView("edit_upcoming");
		Upcoming u = service1.get(idu);
		mav.addObject("u", u);
		return mav;
	}
	
	@RequestMapping("/delete1/{idu}")
	public String deleteUpcoming(@PathVariable(name ="idu")Long idu)
	{
		service1.delete(idu);
		return "redirect:/";
	}
	

}
