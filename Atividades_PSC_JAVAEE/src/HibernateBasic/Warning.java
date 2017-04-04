package HibernateBasic;

import javax.persistence.*;

@Entity
public class Warning {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	private String description;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
