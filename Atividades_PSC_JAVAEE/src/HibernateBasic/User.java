package HibernateBasic;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	Integer id;
	
	@Column(nullable=true, length=50)
	String email;
	
	@Column(nullable=false, length=1000)
	String password;
	
	@Column(nullable=false, length=50)
	String login;
	
	@Column(nullable=false, length=200)
	String name;
	
	@Column(nullable=false)
	@OneToOne
	UserIdentity userIdentity;
	
	@Column(nullable=false)
	@OneToOne
	ResidenceUnity residenceUnity;
	
}
