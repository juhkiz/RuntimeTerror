package Project.RuntimeTerror.domain;

import java.util.List;

import javax.persistence.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;


@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long questionId;
	
	@NotEmpty
	private String questionType;
	
	@NotEmpty
	private String questionName;
	private String options;
	
	@ManyToOne
	@JoinColumn(name = "questionnaireId")
	private Questionnaire questionnaire;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer> answers;
	

	public Question() {
	}
	

	public Question(String questionType, String questionName, String options) {
		super();
		this.questionType = questionType;
		this.questionName = questionName;
		this.options = options;
	}


	public Question(String questionType, String questionName, String options, List<Answer> answers) {
		super();
		this.questionType = questionType;
		this.questionName = questionName;
		this.options = options;
		this.answers = answers;
	}


	public Question(String questionType, String questionName) {
		super();
		this.questionType = questionType;
		this.questionName = questionName;
	}


	public Long getQuestionId() {
		return questionId;
	}


	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}


	public String getQuestionType() {
		return questionType;
	}


	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}


	public String getQuestionName() {
		return questionName;
	}


	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}


	public String getOptions() {
		return options;
	}


	public void setOptions(String options) {
		this.options = options;
	}


	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}


	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
