package com.qo.c;

import com.qo.m.Campus;
import com.qo.m.Faculty;
import com.qo.m.Organization;
import com.qo.m.University;
import com.qo.s.CampusService;
import com.qo.s.Facultyservice;
import com.qo.s.OrganizationService;
import com.qo.s.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Facultycontroller {

    @Autowired
    OrganizationService organizationservice;
    
    @Autowired
    UniversityService universityService;
    @Autowired
    CampusService Campusservice;
    @Autowired
    Facultyservice facultyservice;

        @RequestMapping("/aaaaaa")
        public String AddFaculty(ModelMap modelmap)
{
    List<Campus>campus=Campusservice.getallCampus();

    modelmap.addAttribute("campus",campus);
   return "";

}


        @RequestMapping("///")
        public String viewFaculty(ModelMap modelmap)
{  List<University>university=universityService.getalluniversity();
    List<Organization> organization=organizationservice.getallOrganization();
    List<Faculty>faculty=facultyservice.getallFaculty();
    List<Campus>campus=Campusservice.getallCampus();
    modelmap.addAttribute("campus",campus);
    modelmap.addAttribute("faculty",faculty);
    modelmap.addAttribute("university",university);
    modelmap.addAttribute("organization",organization);
   return "";
}

    @RequestMapping("/")
    public String editFaculty(@RequestParam("id")int b, ModelMap modelMap)
{
     facultyservice.getfacultybyid(b);
    List<University>university=universityService.getalluniversity();
    List<Organization> organization=organizationservice.getallOrganization();
     List<Campus>campus= Campusservice.getallCampus();
     List<Faculty>faculty=facultyservice.getallFaculty();
      modelMap.addAttribute("faculty",faculty);
      modelMap.addAttribute("campus",campus);
        return "";
}

    @RequestMapping("/wew")
    public String deleteFaculty(@RequestParam("id")int a)
{
          Faculty faculty=facultyservice.getfacultybyid(a);
                     facultyservice.deletefaculty(faculty);


    return  "";
}
        @RequestMapping("/q")
        public String saveFaculty(@ModelAttribute("faculty")Faculty faculty,@RequestParam("Campus")String c)
        {
            int a=Integer.parseInt(c);
            faculty.setIcd(a);
            facultyservice.savefaculty(faculty);

            return"jjj";
        }



}
