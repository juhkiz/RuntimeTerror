package Project.RuntimeTerror.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AnswerTesting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long answerId;
	private int questionId;
	private String answer;
	
	public AnswerTesting() {}

	public AnswerTesting(int questionId, String answer) {
		super();
		this.questionId = questionId;
		this.answer = answer;
	}

	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
