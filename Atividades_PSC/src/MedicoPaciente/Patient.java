/*
 * Developed by Hélio Ferreira
 */


package MedicoPaciente;


import javax.swing.JOptionPane;

public class Patient {

	private String rg;
	private String birthdate;
	private String name;
		
	
	public String getRg() {
		return rg;
	}
	
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	public String getBirthdate() {
		return birthdate;
	}
	
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Patient newRegister()
	{		
		this.name = JOptionPane.showInputDialog(null, " Insert Name ", "Register new Patient!!!", JOptionPane.INFORMATION_MESSAGE);
		this.rg = JOptionPane.showInputDialog(null, " Insert RG ", "Register new Patient!!!", JOptionPane.INFORMATION_MESSAGE);
		this.birthdate = JOptionPane.showInputDialog(null, " Insert Birthdate ", "Register new Patient!!!", JOptionPane.INFORMATION_MESSAGE);
		
		return this;
	}
	
}