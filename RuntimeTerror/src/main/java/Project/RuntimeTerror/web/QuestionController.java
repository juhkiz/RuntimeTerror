package Project.RuntimeTerror.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	    public String save(@Valid Question question, BindingResult result, Model model){
	        if (result.hasErrors()) {
	        	model.addAttribute("question",new Question());
	        	return "addquestions";
	        }
		 	qRepo.save(question);
	        return "redirect:questionlist"; 
	 }
	 
	 @RequestMapping(value="/questionlist")
	    public String questionList(Model model) {	
	        model.addAttribute("questions", qRepo.findAll());
	        return "questionlist";
	    }
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	    public String deleteQuestion(@PathVariable("id") Long questionId, Model model) {
	    	qRepo.deleteById(questionId);
	        return "redirect:../questionlist";
	    }
}