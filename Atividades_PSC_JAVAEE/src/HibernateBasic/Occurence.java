package HibernateBasic;

import javax.persistence.*;


@Entity
public class Occurence {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	private Character status;
	
	@Column(nullable=false, unique=true, length=1000)	
	private Integer occurenceNumber;
	
	@Column(nullable=false)
	private String description;
	
	@ManyToMany
	@Column(nullable=true, unique=true)	
	private Fine fine;
		
	@ManyToMany
	@Column(nullable=true, unique=true)
	private Warning warning;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Integer getOccurenceNumber() {
		return occurenceNumber;
	}

	public void setOccurenceNumber(Integer occurenceNumber) {
		this.occurenceNumber = occurenceNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Fine getFine() {
		return fine;
	}

	public void setFine(Fine fine) {
		this.fine = fine;
	}

	public Warning getWarning() {
		return warning;
	}

	public void setWarning(Warning warning) {
		this.warning = warning;
	}

}