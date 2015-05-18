import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.WindowConstants;

public class Window
{
    JFrame frame = new JFrame();
    //XOButton buttons[] = new XOButton[9];
    
    /**
    public Grid(int width, int length) {
        frame.setLayout(new GridLayout(width,length));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.pack(); 
        frame.setVisible(true);
    }
    */
    private static final Color BG_COLOR = new Color( 0xbbada0 );
    private static final String FONT_NAME = "Arial";
    private static final int TILE_SIZE = 64;
    private static final int TILES_MARGIN = 16;
    
    public static void main(String args[]){
        JFrame myFrame = new JFrame("2048");
        myFrame.setSize(300,400);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
