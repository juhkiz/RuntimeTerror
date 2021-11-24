package Project.RuntimeTerror;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Project.RuntimeTerror.domain.Options;
import Project.RuntimeTerror.domain.OptionsRepository;
import Project.RuntimeTerror.domain.Question;
import Project.RuntimeTerror.domain.QuestionRepository;
import Project.RuntimeTerror.domain.QuestionType;
import Project.RuntimeTerror.domain.QuestionTypeRepository;
import Project.RuntimeTerror.domain.User;
import Project.RuntimeTerror.domain.UserRepository;


@SpringBootApplication
public class RuntimeTerrorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RuntimeTerrorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDataDemo(QuestionRepository qRepo, OptionsRepository oRepo, QuestionTypeRepository qTypeRepo, UserRepository uRepository) {
		return (args) -> {
			
			QuestionType radio = new QuestionType("Radio");
			QuestionType checkbox = new QuestionType("Checkbox");
			QuestionType open = new QuestionType("Open");
			qTypeRepo.save(radio);
			qTypeRepo.save(checkbox);
			qTypeRepo.save(open);
			
			Options o1 = new Options("Ihminen","Alien");
			Options o2 = new Options("Vihreä","Sininen");
			Options o3 = new Options("Koira","Kissa");
			Options o4 = new Options("Lenkkeily","Punttisali");

			oRepo.save(o1);
			oRepo.save(o2);
			oRepo.save(o3);
			oRepo.save(o4);
			
			Question q1 = new Question("Kuka olet?", radio, o1);
			Question q2 = new Question("Lempi värit?", checkbox, o2);
			Question q3 = new Question("Kerro jotakin?", open);
			Question q4 = new Question("Lempi eläin?", radio, o3);
			Question q5 = new Question("Miten päiväsi menee?", open);
			Question q6 = new Question("Lempi harrastus?", checkbox, o4);
			qRepo.save(q1);
			qRepo.save(q2);
			qRepo.save(q3);
			qRepo.save(q4);
			qRepo.save(q5);
			qRepo.save(q6);


			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");  // admin:admin
			uRepository.save(user2);
		};
	}
}
