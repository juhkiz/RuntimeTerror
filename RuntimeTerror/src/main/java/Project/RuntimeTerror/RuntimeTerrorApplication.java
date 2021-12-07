package Project.RuntimeTerror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Project.RuntimeTerror.domain.Answer;
import Project.RuntimeTerror.domain.AnswerRepository;
import Project.RuntimeTerror.domain.Option;
import Project.RuntimeTerror.domain.Question;
import Project.RuntimeTerror.domain.QuestionRepository;
import Project.RuntimeTerror.domain.Questionnaire;
import Project.RuntimeTerror.domain.QuestionnaireRepository;
import Project.RuntimeTerror.domain.User;
import Project.RuntimeTerror.domain.UserRepository;


@SpringBootApplication
public class RuntimeTerrorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RuntimeTerrorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDataDemo(UserRepository uRepository, QuestionnaireRepository queRepo, QuestionRepository qRepo, AnswerRepository ansRepo) {
		return (args) -> {

			Question question1 = new Question("Checkbox", "Lempivärisi?", "Sininen, Punainen, Vihreä");
			qRepo.save(question1);
			
			Question question2 = new Question("Open", "Kerro tarina");
			qRepo.save(question2);
			
			Question question3 = new Question("Radio", "Mitä kuuluu?", "Hyvää, Huonoa, En kerro");
			qRepo.save(question3);
			

			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");  // admin:admin
			uRepository.save(user2);
		};
	}
}
