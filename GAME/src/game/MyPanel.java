package game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

//@author Marcin

class MyPanel extends JPanel {

    public MyPanel() {
        setPreferredSize(new Dimension(GAME.ileKolumn, GAME.ileWierszy));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        Rectangle2D[][] terrain = new Rectangle2D[GAME.ileWierszy][GAME.ileKolumn];
        for(int i = 0 ;i < GAME.ileWierszy; i++){
            for(int j = 0 ;j < GAME.ileKolumn; j++){
                terrain[i][j] = new Rectangle2D.Double(j,i, 1, 1);
                if(GAME.teren[i][j] == 0){
                    g2d.setColor(Color.black);
                }else if(GAME.teren[i][j] == 1){
                    g2d.setColor(Color.white);
                }else if(GAME.teren[i][j] == 2){
                    g2d.setColor(Color.yellow);
                }
                g2d.fill(terrain[i][j]);
            }
        }
        
        
        //Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 380, 380);
        //Ellipse2D circle = new Ellipse2D.Double(10, 10, 380, 380);
        
        //g2d.fill(rectangle);
        //g2d.setColor(Color.yellow);
        //g2d.fill(circle);
    }
    
}
