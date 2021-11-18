package Project.RuntimeTerror.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Project.RuntimeTerror.domain.OptionsRepository;
import Project.RuntimeTerror.domain.Question;
import Project.RuntimeTerror.domain.QuestionRepository;
import Project.RuntimeTerror.domain.QuestionTypeRepository;

@CrossOrigin
@Controller
public class QuestionController {
	
	@Autowired
	OptionsRepository oRepo;
	
	@Autowired
	QuestionRepository qRepo;
	
	@Autowired
	QuestionTypeRepository qTypeRepo;
	
	
	
	
	
	
	@RequestMapping(value="/questions", method = RequestMethod.GET)
    public @ResponseBody List<Question> questionListRest() {	

        return (List<Question>) qRepo.findAll();
    }
	@RequestMapping(value="/addquestions")                        //ohjaa addquestions.html 
       public String addQuestions(Model model) {
    	   model.addAttribute("question",new Question());
       return "addquestions";
    }
	
	
}