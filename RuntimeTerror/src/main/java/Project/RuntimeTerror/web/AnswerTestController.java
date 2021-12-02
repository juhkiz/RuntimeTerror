package Project.RuntimeTerror.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Project.RuntimeTerror.domain.AnswerTesting;
import Project.RuntimeTerror.domain.AnswerTestingRepository;


@CrossOrigin
@Controller
public class AnswerTestController {
	
	
	@Autowired
	AnswerTestingRepository testRepo;

	@RequestMapping(value="/answertests", method = RequestMethod.GET)
    public @ResponseBody List<AnswerTesting> AnswerTestRest() {	

        return (List<AnswerTesting>) testRepo.findAll();
    }
}