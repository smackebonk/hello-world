/**
 * 
 */
package SwingDemo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Kalle
 *
 */
public class MyFrame extends JFrame
{
    private JButton saveButton;
    private JButton exitButton;
    private JTextField inputField;
    private JLabel outputLabel;
    private JPanel myPanel;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    public MyFrame()
    {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    class ClickListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent arg0)
        {
            if(arg0.getSource() == saveButton)
            {
                outputLabel.setText(inputField.getText());
            }
            if(arg0.getSource() == exitButton)
            {
                System.exit(0);
            }
        }
        
    }
    public void createComponents()
    {
        ClickListener click = new ClickListener();
        saveButton = new JButton("Save");
        saveButton.addActionListener(click);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(click);
        inputField = new JTextField(20);
        outputLabel = new JLabel("");
        myPanel = new JPanel(new BorderLayout());
        myPanel.add(inputField, BorderLayout.NORTH);
        myPanel.add(outputLabel, BorderLayout.CENTER);
        myPanel.add(saveButton, BorderLayout.WEST);
        myPanel.add(exitButton, BorderLayout.EAST);
        add(myPanel);
        
    }

}
