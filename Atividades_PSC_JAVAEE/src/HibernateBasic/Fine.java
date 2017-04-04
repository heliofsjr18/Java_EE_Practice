package HibernateBasic;

import javax.persistence.*;



@Entity
public class Fine {
	
	@Id
	@GeneratedValue	
	private Integer id;
	
	@Column(nullable=false)
	private String description;
	
	@Column(nullable=false)
	private Double price;
	
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
