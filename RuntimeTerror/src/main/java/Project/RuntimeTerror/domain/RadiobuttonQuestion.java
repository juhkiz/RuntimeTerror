package Project.RuntimeTerror.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RadiobuttonQuestion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String kysymys;
	private String vaihtoehto1;
	private String vaihtoehto2;
	private String vaihtoehto3;
	
	public RadiobuttonQuestion() {}
	
	public RadiobuttonQuestion(String kysymys, String vaihtoehto1, String vaihtoehto2, String vaihtoehto3) {
		super();
		this.kysymys = kysymys;
		this.vaihtoehto1 = vaihtoehto1;
		this.vaihtoehto2 = vaihtoehto2;
		this.vaihtoehto3 = vaihtoehto3;
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

	@Override
	public String toString() {
		return "Question [kysymys=" + kysymys + ", vaihtoehto1=" + vaihtoehto1 + ", vaihtoehto2=" + vaihtoehto2
				+ ", vaihtoehto3=" + vaihtoehto3 + "]";
	}
}
