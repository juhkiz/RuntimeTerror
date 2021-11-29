package Project.RuntimeTerror.domain;
import java.util.List;

import javax.persistence.*;

@Entity
public class Questionnaire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long questionnaireId;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Question> questions;
	
	public Questionnaire() {}

	public Questionnaire(String name, List<Question> questions) {
		super();
		this.name = name;
		this.questions = questions;
	}

	public Long getQuestionnaireId() {
		return questionnaireId;
	}

	public void setQuestionnaireId(Long questionnaireId) {
		this.questionnaireId = questionnaireId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
