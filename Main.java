import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class GUI here.
 * 
 * @author  (Arthur van Strien) 
 * @version (1)
 * @date    ()
 */
public class Main extends JFrame
{
    JPanel panel;
    JButton leftUpButton;
    JButton upButton;
    JButton rightUpButton;
    JButton leftButton;
    JButton stopButton;
    JButton rightButton;
    JButton leftDownButton;
    JButton downButton;
    JButton rightDownButton;
    JButton eightButton;
    
    public Main()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel(new BorderLayout());
        setContentPane(panel);
        createMenu();
        
        panel.add(createControlButtons(), BorderLayout.CENTER);
        
        setSize(500, 500);
        setVisible(true);
    }
    
    private void createMenu()
    {
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
            JMenu connection = new JMenu("Connectie");
            menubar.add(connection);
                JMenuItem openConnection = new JMenuItem("Open");
                connection.add(openConnection);
    }
    
    private JPanel createControlButtons()
    {
        JPanel buttons = new JPanel(new GridLayout(4, 3));
        
        ImageIcon leftUpImage = new ImageIcon("arrowupleft.png");
        leftUpButton = new JButton(leftUpImage);
        leftUpButton.setBackground(Color.WHITE);
        buttons.add(leftUpButton);
        
        ImageIcon upImage = new ImageIcon("arrowup.png");
        upButton = new JButton(upImage);
        upButton.setBackground(Color.WHITE);
        buttons.add(upButton);
        
        ImageIcon rightUpImage = new ImageIcon("arrowupright.png");
        rightUpButton = new JButton(rightUpImage);
        rightUpButton.setBackground(Color.WHITE);
        buttons.add(rightUpButton);
        
        ImageIcon leftImage = new ImageIcon("arrowleft.png");
        leftButton = new JButton(leftImage);
        leftButton.setBackground(Color.WHITE);
        buttons.add(leftButton);
        
        ImageIcon stopImage = new ImageIcon("stopSmall.jpg");
        stopButton = new JButton(stopImage);
        stopButton.setBackground(Color.WHITE);
        buttons.add(stopButton);
        
        ImageIcon rightImage = new ImageIcon("arrowright.png");
        rightButton = new JButton(rightImage);
        rightButton.setBackground(Color.WHITE);
        buttons.add(rightButton);
        
        ImageIcon leftDownImage = new ImageIcon("arrowdownleft.png");
        leftDownButton = new JButton(leftDownImage);
        leftDownButton.setBackground(Color.WHITE);
        buttons.add(leftDownButton);
        
        ImageIcon downImage = new ImageIcon("arrowdown.png");
        downButton = new JButton(downImage);
        downButton.setBackground(Color.WHITE);
        buttons.add(downButton);
        
        ImageIcon rightDownImage = new ImageIcon("arrowdownright.png");
        rightDownButton = new JButton(rightDownImage);
        rightDownButton.setBackground(Color.WHITE);
        buttons.add(rightDownButton);
 
        return buttons;
    }
}
