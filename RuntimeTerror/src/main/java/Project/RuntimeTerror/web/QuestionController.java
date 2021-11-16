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

import Project.RuntimeTerror.domain.CheckboxQuestion;
import Project.RuntimeTerror.domain.CheckboxQuestionRepository;
import Project.RuntimeTerror.domain.OpenQuestion;
import Project.RuntimeTerror.domain.OpenQuestionRepository;
import Project.RuntimeTerror.domain.RadioButtonRepository;
import Project.RuntimeTerror.domain.RadiobuttonQuestion;

@CrossOrigin
@Controller
public class QuestionController {
	
	@Autowired
	private RadioButtonRepository qRepo;
	
	@Autowired
	private CheckboxQuestionRepository checkboxRepo;
	
	@Autowired
	private OpenQuestionRepository openRepo;
	
	@RequestMapping(value="/questions", method = RequestMethod.GET)
    public @ResponseBody List<RadiobuttonQuestion> questionListRest() {	
        return (List<RadiobuttonQuestion>) qRepo.findAll();
    }
	@RequestMapping(value="/checkboxquestions", method = RequestMethod.GET)
    public @ResponseBody List<CheckboxQuestion> checkboxQuestinListRest() {	
        return (List<CheckboxQuestion>) checkboxRepo.findAll();
    }
	@RequestMapping(value="/openquestions", method = RequestMethod.GET)
    public @ResponseBody List<OpenQuestion> openQuestinListRest() {	
        return (List<OpenQuestion>) openRepo.findAll();
    }
	@RequestMapping(value="/addquestions")                        //ohjaa addquestions.html 
       public String addQuestions(Model model) {
    	   model.addAttribute("question",new RadiobuttonQuestion());
       return "addquestions";
    }
	
	
}