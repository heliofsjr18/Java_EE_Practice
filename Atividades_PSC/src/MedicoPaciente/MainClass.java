/*
 * Developed by Hélio Ferreira
 */

package MedicoPaciente;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainClass {
	
	public static MainClass mainObject = new MainClass();
	public static ArrayList<Medic> medicArray = new ArrayList<Medic>();
	public static ArrayList<Patient> patientArray = new ArrayList<Patient>();
	public static ArrayList<Appointment> appointmentArray = new ArrayList<Appointment>();
	
	public static void main(String [] args)
	{
		Integer choice = Integer.parseInt(JOptionPane.showInputDialog(null, " Type 1 for register a new Medic\n "
				+ "Type 2 for register a new Pacient\n "
				+ "Type 3 for create a new Appointment:", 
				"Welcome!!!", JOptionPane.INFORMATION_MESSAGE));
		switch (choice) 
		{
		
		case 1: medicArray.add(new Medic().newRegister());
		JOptionPane.showMessageDialog(null, "A new Medic was inserted","Successful",JOptionPane.INFORMATION_MESSAGE);
		mainObject.restart();
		
		case 2: new Patient().newRegister();  			
		JOptionPane.showMessageDialog(null, "A new Patient was inserted","Successful",JOptionPane.INFORMATION_MESSAGE);
		mainObject.restart();
		
		case 3: JOptionPane.showInputDialog(null," Choose a medic\n " + medicArray.get(medicArray.size()).getName()," New Appointment ",JOptionPane.INFORMATION_MESSAGE); 
		new Appointment(new Medic(), new Patient()).newRegister();  			
		JOptionPane.showMessageDialog(null, "A new Appointment was inserted","Successful",JOptionPane.INFORMATION_MESSAGE);
		mainObject.restart();
		
		default: JOptionPane.showMessageDialog(null, "Invalid Option", "Error", JOptionPane.ERROR_MESSAGE);
		mainObject.restart();		
		
		}	
	}
	
	public void restart()
	{
		main(null);
	}
	
}