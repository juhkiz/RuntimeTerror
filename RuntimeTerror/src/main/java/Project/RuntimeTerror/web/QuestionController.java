package Project.RuntimeTerror.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Project.RuntimeTerror.domain.Option;
import Project.RuntimeTerror.domain.Question;
import Project.RuntimeTerror.domain.QuestionRepository;

@CrossOrigin
@Controller
public class QuestionController {
	
	
	@Autowired
	QuestionRepository qRepo;

	@RequestMapping(value="/questions", method = RequestMethod.GET)
    public @ResponseBody List<Question> questionListRest() {	

        return (List<Question>) qRepo.findAll();
    }
	@RequestMapping(value="/addquestions")                        //ohjaa addquestions.html 
       public String addQuestions(Model model) {
    	   model.addAttribute("question",new Question());
       return "addquestions";
    }
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(Question question){
	        qRepo.save(question);
	        return "redirect:questionlist"; 
	 }
	 
	 @RequestMapping(value="/questionlist")
	    public String questionList(Model model) {	
	        model.addAttribute("questions", qRepo.findAll());
	        return "questionlist";
	    }
}