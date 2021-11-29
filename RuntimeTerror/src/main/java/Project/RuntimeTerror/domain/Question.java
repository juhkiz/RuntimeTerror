package Project.RuntimeTerror.domain;

import java.util.List;

import javax.persistence.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long questionId;
	private String questionType;
	private String question;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Option> options;
	
	@ManyToOne
	@JoinColumn(name = "questionnaireId")
	private Questionnaire questionnaire;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer> answers;
	

	public Question() {
	}


	public Question(String questionType, String question, List<Option> options) {
		super();
		this.questionType = questionType;
		this.question = question;
		this.options = options;
	}


	public Question(String questionType, String question) {
		super();
		this.questionType = questionType;
		this.question = question;
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


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Option> getOptions() {
		return options;
	}


	public void setOptions(List<Option> options) {
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
