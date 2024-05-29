package springMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springMVC.mvc.entity.Student;
import springMVC.mvc.service.StudentService;

@Controller
public class StudentController {

	
	
	@Autowired
	StudentService studentService; 
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public ModelAndView getDomain(Model model) {
		model.addAttribute("cmd", new Student());
		return new ModelAndView("Student", "student",new Student() );
	}
	
	@RequestMapping(path= "/save", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute(name="student") Student std) {
		System.out.println(std);
		studentService.save(std);
		return new ModelAndView("Success");
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.GET)
	public ModelAndView updateStudent(Model model) {
		model.addAttribute("cmd", new Student());
		return new ModelAndView("update", "student",new Student() );
	}	
	
	@RequestMapping(path= "/updateStudent", method = RequestMethod.POST)
	public ModelAndView updateStudent(@ModelAttribute(name="student") Student std)
	{
		studentService.update(std);
		return new ModelAndView("Success");
	}
	
	@RequestMapping(path="/getAll",method=RequestMethod.GET)
	public ModelAndView getAll(Model model) {
		List<Student> list=studentService.getAll();
		model.addAttribute("dataList",list);
		System.out.println(list);
		return new ModelAndView("GetAll");
	}
}
