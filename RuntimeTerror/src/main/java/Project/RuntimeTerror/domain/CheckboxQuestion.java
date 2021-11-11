package Project.RuntimeTerror.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckboxQuestion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String kysymys;
	private String vaihtoehto1;
	private String vaihtoehto2;
	private String vaihtoehto3;
	private String vaihtoehto4;
	private String vaihtoehto5;
	
	public CheckboxQuestion() {}
	
	public CheckboxQuestion(String kysymys, String vaihtoehto1, String vaihtoehto2, String vaihtoehto3,
			String vaihtoehto4, String vaihtoehto5) {
		super();
		this.kysymys = kysymys;
		this.vaihtoehto1 = vaihtoehto1;
		this.vaihtoehto2 = vaihtoehto2;
		this.vaihtoehto3 = vaihtoehto3;
		this.vaihtoehto4 = vaihtoehto4;
		this.vaihtoehto5 = vaihtoehto5;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKysymys() {
		return kysymys;
	}
	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}
	public String getVaihtoehto1() {
		return vaihtoehto1;
	}
	public void setVaihtoehto1(String vaihtoehto1) {
		this.vaihtoehto1 = vaihtoehto1;
	}
	public String getVaihtoehto2() {
		return vaihtoehto2;
	}
	public void setVaihtoehto2(String vaihtoehto2) {
		this.vaihtoehto2 = vaihtoehto2;
	}
	public String getVaihtoehto3() {
		return vaihtoehto3;
	}
	public void setVaihtoehto3(String vaihtoehto3) {
		this.vaihtoehto3 = vaihtoehto3;
	}
	public String getVaihtoehto4() {
		return vaihtoehto4;
	}
	public void setVaihtoehto4(String vaihtoehto4) {
		this.vaihtoehto4 = vaihtoehto4;
	}
	public String getVaihtoehto5() {
		return vaihtoehto5;
	}
	public void setVaihtoehto5(String vaihtoehto5) {
		this.vaihtoehto5 = vaihtoehto5;
	}
	@Override
	public String toString() {
		return "CheckboxQuestion [kysymys=" + kysymys + ", vaihtoehto1=" + vaihtoehto1 + ", vaihtoehto2=" + vaihtoehto2
				+ ", vaihtoehto3=" + vaihtoehto3 + ", vaihtoehto4=" + vaihtoehto4 + ", vaihtoehto5=" + vaihtoehto5
				+ "]";
	}
	
}
