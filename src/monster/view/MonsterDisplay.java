package monster.view;

import javax.swing.JOptionPane;		//Like GUI

public class MonsterDisplay
{

	public void displayText(String textToDisplay)		//displayText only has 1 button
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String questionAsked)		//getResponse creates 2 buttons
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
	}
	
}
