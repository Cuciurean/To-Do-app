package net.codejava.Controller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.codejava.Model.Today;
import net.codejava.Model.Upcoming;
import net.codejava.View.WeatherService;

@Controller
public class TodayAppController {
	
	@Autowired
	private TodayService service;
	
	@Autowired
	private UpcomingService service1;
	
	private WeatherService weatherService;
	
	 public net.codejava.Model.Weather currentWeather() throws IOException, ParseException, JSONException, org.json.simple.parser.ParseException, java.text.ParseException {
	    	return weatherService.getCurrentWeather("Cluj-Napoca");
	    }

	 public static final String uploadDir = System.getProperty("user.dir") + "/uploadDir/";
	 
	 
	 
	 
	@RequestMapping("/")
	public String viewHomePage(Model model) throws ParseException, JSONException, IOException, org.json.simple.parser.ParseException, java.text.ParseException
	{
		List<Today> listT = service.listAll();
		model.addAttribute("listT", listT);
		
		List<Upcoming> listU = service1.listAll();
		model.addAttribute("listU", listU);
		
		File file = new File(uploadDir);
        model.addAttribute("files", file.listFiles());
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewTodayForm(Model model)
	{
		Today t = new Today();
		model.addAttribute("t", t);
		return "new_today";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveToday(@ModelAttribute("t") Today t)
	{
		service.save(t);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editTodayForm(@PathVariable(name ="id")Long id)
	{
		ModelAndView mav = new ModelAndView("edit_today");
		Today t = service.get(id);
		mav.addObject("t", t);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteToday(@PathVariable(name ="id")Long id)
	{
		service.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword)
	{
		ModelAndView mav = new ModelAndView("search");
		List<Today> result = service.search(keyword);
		mav.addObject("result", result);
		
		return mav;
	}
	
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	    public String uploadFiles(@RequestParam("uploadedFiles") MultipartFile[] uploadedFiles) throws IOException {
	        for(MultipartFile f : uploadedFiles) {
	            File file = new File(uploadDir + f.getOriginalFilename());
	            f.transferTo(file);
	        }
	        return "redirect:/";
	    }
	
	
}
