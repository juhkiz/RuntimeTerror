package Project.RuntimeTerror.domain;
import java.util.List;

import javax.persistence.*;

@Entity
public class QuestionType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long questionTypeId;
	private String questionType;
	
	@OneToMany
	private List<Question> questions;

	public QuestionType(){}
	
	public QuestionType(String questionType) {
		super();
		this.questionType = questionType;
	}

	public Long getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(Long questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
}
