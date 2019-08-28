package com.qo.c;

import com.qo.m.*;
import com.qo.s.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProgrammerController {

	@Autowired
	Programmeservice programmeservice;

	@Autowired
	UniversityService universityService;

	@Autowired
	CampusService campusService;

	@Autowired
	DeparmentService deparmentService;

	@Autowired
	Facultyservice facultyservice;


	@RequestMapping("/programme")
	public String addprogramme(ModelMap modelmap)
	{
		List<University> university=universityService.getalluniversity();
		List<Campus>campus=campusService.getallCampus();
		List<Faculty>faculty=facultyservice.getallFaculty();
		List<Deparment>deparment=deparmentService.getalldeparment();
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("faculty",faculty);
		modelmap.addAttribute("campus",campus);
		modelmap.addAttribute("university",university);
    	modelmap.addAttribute("deparment",deparment);

		return"programme";
	}


	@RequestMapping("/saveprogramme")
	public String saveprogramme(@ModelAttribute("programme") Programme programme, ModelMap modelmap, @RequestParam("campus") String c, @RequestParam("university") String b,
								@RequestParam("faculty")String a, @RequestParam("deparment")String w,Deparment deparment,Faculty faculty, Campus campus) {

		int q=Integer.parseInt(w);
			int o=Integer.parseInt(c);
			int z=Integer.parseInt(a);
			int l=Integer.parseInt(b);
		programme.setDeparmentid(q);
		deparment.setFaculty_id(z);
		faculty.setIcd(o);
		campus.setUniversityid(l);
		programmeservice.saveprogramme(programme);

		return "redirect:/viewprogramme";
	}
	
	@RequestMapping("/editprogramme")
	public String editprogramme(@RequestParam("programme")int z, ModelMap modelmap)
	{
		programmeservice.getprogrammebyid(z);
		List<University> university=universityService.getalluniversity();
	List<Campus>campus=campusService.getallCampus();
	List<Faculty>faculty=facultyservice.getallFaculty();
	List<Deparment>deparment=deparmentService.getalldeparment();
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("faculty",faculty);
		modelmap.addAttribute("campus",campus);
		modelmap.addAttribute("university",university);
    	modelmap.addAttribute("deparment",deparment);




		return "redirect:/viewprogramme";
	}

	@RequestMapping("/deleteprogramme")
  public String deleteProgramme(@RequestParam("id")int y)
  {
  	Programme programme=programmeservice.getprogrammebyid(y);
  	programmeservice.deleteprogramme(programme);


  	return "redirect:/viewprogramme";
  }
		

	
	
	
	
	
}
