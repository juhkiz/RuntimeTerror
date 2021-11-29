package Project.RuntimeTerror.domain;
<<<<<<< HEAD
import java.util.List;

import javax.persistence.*;
=======

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
>>>>>>> 980550e3b66fdcedca63592d575816fc628b82a2

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
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
	
	public Question() {}

	public Question(String questionType, String question, List<Option> options) {
		super();
=======
	private Long id;
	private String title;

	@ManyToOne
	@JoinColumn(name = "questionTypeId")
	private QuestionType questionType;

	@ManyToOne
	@JoinColumn(name = "optionId")
	private Options option;

	public Question() {
	}

	public Question(String title, QuestionType questionType, Options option) {
		super();
		this.title = title;
>>>>>>> 980550e3b66fdcedca63592d575816fc628b82a2
		this.questionType = questionType;
		this.question = question;
		this.options = options;
	}
<<<<<<< HEAD
	
	public Question(String questionType, String question) {
		super();
=======

	public Question(String title, QuestionType questionType) {
		super();
		this.title = title;
>>>>>>> 980550e3b66fdcedca63592d575816fc628b82a2
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
