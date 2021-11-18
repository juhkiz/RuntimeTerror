package Project.RuntimeTerror.domain;
import javax.persistence.*;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String question;
	
	@ManyToOne
	@JoinColumn(name="questionTypeId")
	private QuestionType questionType;
	
	@ManyToOne
	@JoinColumn(name="optionId")
	private Options option;

	public Question() {}

	public Question(String question, QuestionType questionType, Options option) {
		super();
		this.question = question;
		this.questionType = questionType;
		this.option = option;
	}
	public Question(String question, QuestionType questionType) {
		super();
		this.question = question;
		this.questionType = questionType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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
