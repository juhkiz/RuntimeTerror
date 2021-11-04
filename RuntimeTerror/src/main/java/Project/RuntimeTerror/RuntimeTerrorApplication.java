package Project.RuntimeTerror;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Project.RuntimeTerror.domain.Question;
import Project.RuntimeTerror.domain.QuestionRepository;

@SpringBootApplication
public class RuntimeTerrorApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RuntimeTerrorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RuntimeTerrorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDataDemo(QuestionRepository questionRepo) {
		return (args) -> {
			log.info("Save questions");
			Question question1 = new Question("Mikä on nimesi","Mikä on ikäsi","Mikä on sukunimesi");
			Question question2 = new Question("Mikä on nimesi?","Mikä on ikäsi?","Mikä on sukunimesi?");
			Question question3 = new Question("Mikä on nimesi???","Mikä on ikäsi???","Mikä on sukunimesi???");
			questionRepo.save(question1);
			questionRepo.save(question2);
			questionRepo.save(question3);

			
			log.info("fetch all questions");
			for (Question question : questionRepo.findAll())
			{
				log.info(question.toString());
			}
		};
	}

}
