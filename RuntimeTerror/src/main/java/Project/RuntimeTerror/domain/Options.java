package Project.RuntimeTerror.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Options {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long optionId;
	private String option1;
	private String option2;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Question> question;

	public Options() {
	}

	public Options(String option1, String option2) {
		super();
		this.option1 = option1;
		this.option2 = option2;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}
}
