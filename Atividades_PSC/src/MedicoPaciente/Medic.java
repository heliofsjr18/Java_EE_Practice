/*
 * Developed by Hélio Ferreira
 */

package MedicoPaciente;

import javax.swing.JOptionPane;

public class Medic {
	
	private String crm;
	private String specialty;
	private String healthInsurance;
	private String name;
	private String phone;
	private String birthdate;			
	
	public String getBirthdate() 
	{
		return birthdate;
	}
	
	
	public void setBirthdate(String birthdate) 
	{
		this.birthdate = birthdate;
	}
	
	
	public String getPhone() 
	{
		return phone;
	}
	
	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public String getHealthInsurance() 
	{
		return healthInsurance;
	}
	
	
	public void setHealthInsurance(String healthInsurance) 
	{
		this.healthInsurance = healthInsurance;
	}
	
	
	public String getSpecialty() 
	{
		return specialty;
	}
	
	
	public void setSpecialty(String specialty) 
	{
		this.specialty = specialty;
	}
	
	
	public String getCrm() 
	{
		return crm;
	}
	
	
	public void setCrm(String crm) 
	{
		this.crm = crm;
	}
	
	public Medic newRegister()
	{		
		this.name = JOptionPane.showInputDialog(null, " Insert Name ", "Register new Doctor!!!", JOptionPane.INFORMATION_MESSAGE);
		this.crm = JOptionPane.showInputDialog(null, " Insert CRM ", "Register new Doctor!!!", JOptionPane.INFORMATION_MESSAGE);
		this.healthInsurance = JOptionPane.showInputDialog(null, " Insert Health Insurance ", "Register new Doctor!!!", JOptionPane.INFORMATION_MESSAGE);
		this.phone = JOptionPane.showInputDialog(null, " Insert Phone ", "Register new Doctor!!!", JOptionPane.INFORMATION_MESSAGE);
		this.birthdate = JOptionPane.showInputDialog(null, " Insert Birthdate ", "Register new Doctor!!!", JOptionPane.INFORMATION_MESSAGE);
		
		return this;
	}
}