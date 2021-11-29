package Project.RuntimeTerror.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import Project.RuntimeTerror.domain.Questionnaire;
import Project.RuntimeTerror.domain.QuestionnaireRepository;

@CrossOrigin
@Controller
public class QuestionnaireController {
	
	
	@Autowired
	QuestionnaireRepository queRepo;

	@RequestMapping(value="/questionnaires", method = RequestMethod.GET)
    public @ResponseBody List<Questionnaire> questionnaireListRest() {	

        return (List<Questionnaire>) queRepo.findAll();
    }
}