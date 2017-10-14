package game;
import javax.swing.JFrame;
import javax.swing.JPanel;

//@author Marcin

public class MyFrame extends JFrame{
    
    public MyFrame(){
        super("GAME");
        JPanel panel = new MyPanel();
        add(panel);
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
}
