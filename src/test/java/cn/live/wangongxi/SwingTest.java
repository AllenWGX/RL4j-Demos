package cn.live.wangongxi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

 
public class SwingTest
{
    public static void main ( String[] args )
    {
    	WinGrid grid = new WinGrid ();
    	grid.shiftSoilder(0, 0);
    }
}
 
class WinGrid extends JFrame
{
    private static final long serialVersionUID = 1L;
    GridLayout grid;
    JPanel chessboard;
    
    public void shiftSoilder(int i , int j){
    	assert(chessboard.getComponentCount() == 100);
    	Component[] components = chessboard.getComponents();
    	JLabel label0 = (JLabel)components[0];
    	label0.setIcon(null);
    	//
    	JLabel label1 = (JLabel)components[10];
    	label1.setIcon(new ImageIcon("dunk.jpg"));
    	//
    	JOptionPane.showMessageDialog(chessboard, "提示消息", "标题",JOptionPane.WARNING_MESSAGE);
    	return;
    }
    
    WinGrid ()
    {
    	chessboard = new JPanel ();
        grid = new GridLayout (10, 10);
        chessboard.setLayout (grid);
        JLabel[][] label = new JLabel[10][10];
        //
        ImageIcon image = new ImageIcon("dunk.jpg");
        ImageIcon imageDst = new ImageIcon("princess.png");
        
        //
        for ( int i = 0; i < label.length; i++ )
        {
            for ( int j = 0; j < label[i].length; j++ )
            {
                label[i][j] = new JLabel ();
                label[i][j].setOpaque(true);
                if( i == 0 && j == 0 ){
                	label[i][j] = new JLabel (image);
                }
                else if( i == 9 && j == 9 ){
                	label[i][j] = new JLabel (imageDst);
                }
                else if (( i + j ) % 2 == 0)
                    label[i][j].setBackground (Color.white);
                else
                    label[i][j].setBackground (Color.gray);
                chessboard.add (label[i][j]);
            }
        }
        add (chessboard, BorderLayout.CENTER);
        setBounds (10, 10, 1000, 1000);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible (true);
    }
}
