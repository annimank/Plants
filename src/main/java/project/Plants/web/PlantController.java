package project.Plants.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import project.Plants.domain.PlantRepository;

@Controller
public class PlantController {
	
	@Autowired
	private PlantRepository plantRepository;
	
	@RequestMapping("/index")
	public String Plants() {
		return "index";
	}
	
	@RequestMapping(value = {"plantlist", "/"})
	public String Plantlist(Model model) {
		model.addAttribute("plants", plantRepository.findAll());
		return "plantlist";
	}
	
}
