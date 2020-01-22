package com.oar.app.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrainController {
	
	@Autowired
	TrainService trainService;
	
	@RequestMapping(value="savetrain",method=RequestMethod.POST)
	
	public ModelAndView saveTrain(@ModelAttribute Train train) {
		
		Train train2= trainService.saveTrain(train);
		if(train2!=null)
		{
			return new ModelAndView("homepage", "trainid", train2.getTrainno());
		}
		else {
			return new ModelAndView("homepage",  "error","Error in saving");
		}
		
	}

}
