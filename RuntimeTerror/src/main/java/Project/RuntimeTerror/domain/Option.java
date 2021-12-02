package Project.RuntimeTerror.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Option {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long optionId;
	private String option;
	
	@ManyToOne
	@JoinColumn(name = "questionId")
	private Question question;
	
	public Option(String option) {
		super();
		this.option = option;
	}
	
	public Option() {}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return option;
	}
}
