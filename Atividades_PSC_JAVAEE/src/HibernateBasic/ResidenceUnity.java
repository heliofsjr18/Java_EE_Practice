package HibernateBasic;

import javax.persistence.*;

@Entity
public class ResidenceUnity {

	@Id
	@GeneratedValue
	Integer id;
	
	@Column(nullable=false, length=1000)
	Integer number;
	
	@Column(nullable=false)
	String description;
	
}
