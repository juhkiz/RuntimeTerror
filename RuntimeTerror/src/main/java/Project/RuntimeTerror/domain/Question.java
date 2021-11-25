package Project.RuntimeTerror.domain;

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
		this.questionType = questionType;
		this.option = option;
	}

	public Question(String title, QuestionType questionType) {
		super();
		this.title = title;
		this.questionType = questionType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	public Options getOption() {
		return option;
	}

	public void setOption(Options option) {
		this.option = option;
	}
}
