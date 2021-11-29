package Project.RuntimeTerror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Project.RuntimeTerror.domain.Option;
import Project.RuntimeTerror.domain.OptionsRepository;
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
	public CommandLineRunner bookDataDemo(UserRepository uRepository, QuestionnaireRepository queRepo, QuestionRepository qRepo, OptionsRepository oRepo) {
		return (args) -> {
			
			
			Option option1 = new Option("Hyvää");
			Option option2 = new Option("Pahaa");
			ArrayList<Option> options1 = new ArrayList<>();
			options1.add(option1);
			options1.add(option2);
			
			Option option3 = new Option("Sininen");
			Option option4 = new Option("Keltainen");
			Option option5 = new Option("Vihreä");
			Option option6 = new Option("Punainen");
			ArrayList<Option> options2 = new ArrayList<>();
			options2.add(option3);
			options2.add(option4);
			options2.add(option5);
			options2.add(option6);
			
			Question question2 = new Question("Checkbox","Lempivärit?", options2);
			Question question3 = new Question("Open","Kerro tarina");
			
			Question question1 = new Question("Radio","Mitä kuuluu?", options1);
			ArrayList<Question> questions1 = new ArrayList<>();
			questions1.add(question1);
			questions1.add(question2);
			questions1.add(question3);
			
			Questionnaire test1 = new Questionnaire("Testikysely",questions1);
			
			queRepo.save(test1);
			


			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");  // admin:admin
			uRepository.save(user2);
		};
	}
}
