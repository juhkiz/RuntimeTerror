package Project.RuntimeTerror;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Project.RuntimeTerror.domain.CheckboxQuestion;
import Project.RuntimeTerror.domain.CheckboxQuestionRepository;
import Project.RuntimeTerror.domain.OpenQuestion;
import Project.RuntimeTerror.domain.OpenQuestionRepository;
import Project.RuntimeTerror.domain.RadiobuttonQuestion;
import Project.RuntimeTerror.domain.RadioButtonRepository;

@SpringBootApplication
public class RuntimeTerrorApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RuntimeTerrorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RuntimeTerrorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDataDemo(RadioButtonRepository questionRepo, CheckboxQuestionRepository checkboxRepo, OpenQuestionRepository openRepo) {
		return (args) -> {
			log.info("Save questions");
			RadiobuttonQuestion question1 = new RadiobuttonQuestion("Tähän kyssäri", "vastaus1","vastaus2","vastaus3");
			RadiobuttonQuestion question2 = new RadiobuttonQuestion("Tähän kyssäri2", "vastaus1","vastaus2","vastaus3");
			RadiobuttonQuestion question3 = new RadiobuttonQuestion("Tähän kyssäri3", "vastaus1","vastaus2","vastaus3");
			questionRepo.save(question1);
			questionRepo.save(question2);
			questionRepo.save(question3);
			
			CheckboxQuestion checkboxQ1 = new CheckboxQuestion("Kysymys1", "vastaus1","vastaus2","vastaus3","vastaus4","vastaus5");
			CheckboxQuestion checkboxQ2 = new CheckboxQuestion("Kysymys2", "vastaus1","vastaus2","vastaus3","vastaus4","vastaus5");
			CheckboxQuestion checkboxQ3 = new CheckboxQuestion("Kysymys3", "vastaus1","vastaus2","vastaus3","vastaus4","vastaus5");
			checkboxRepo.save(checkboxQ1);
			checkboxRepo.save(checkboxQ2);
			checkboxRepo.save(checkboxQ3);
			
			OpenQuestion openQ1 = new OpenQuestion("Tämä on avoin kysymys");
			OpenQuestion openQ2 = new OpenQuestion("Tämä on avoin kysymys2");
			OpenQuestion openQ3 = new OpenQuestion("Tämä on avoin kysymys3");
			openRepo.save(openQ1);
			openRepo.save(openQ2);
			openRepo.save(openQ3);
			
			log.info("fetch all questions");
			for (RadiobuttonQuestion question : questionRepo.findAll())
			{
				log.info(question.toString());
			}
		};
	}

}
