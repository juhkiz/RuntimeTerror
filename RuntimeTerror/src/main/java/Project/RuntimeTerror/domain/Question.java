package Project.RuntimeTerror.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String kysymys1;
	private String kysymys2;
	private String kysymys3;
	
	public Question(String kysymys1, String kysymys2, String kysymys3) {
		super();
		this.kysymys1 = kysymys1;
		this.kysymys2 = kysymys2;
		this.kysymys3 = kysymys3;
	}
	
	public Question() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKysymys1() {
		return kysymys1;
	}

	public void setKysymys1(String kysymys1) {
		this.kysymys1 = kysymys1;
	}

	public String getKysymys2() {
		return kysymys2;
	}

	public void setKysymys2(String kysymys2) {
		this.kysymys2 = kysymys2;
	}

	public String getKysymys3() {
		return kysymys3;
	}

	public void setKysymys3(String kysymys3) {
		this.kysymys3 = kysymys3;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", kysymys1=" + kysymys1 + ", kysymys2=" + kysymys2 + ", kysymys3=" + kysymys3
				+ "]";
	}
}
