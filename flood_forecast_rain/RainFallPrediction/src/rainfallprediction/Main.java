/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rainfallprediction;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main {
    public static void main(String[] args) 
    {                
        try
        {                    			
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                                                
            HomePage hp=new HomePage();
            hp.setTitle("Main");
            hp.setVisible(true);
            hp.setResizable(false);                         
	}
	catch (Exception ex)
	{            
            //System.out.println(ex);
	}   
    }
}

