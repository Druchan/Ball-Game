package Frames;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ball_Game extends Frame implements MouseMotionListener {

    int MagnetX = 200;
    int MagnetY = 200;
    int Radius=20;

    public void paint(Graphics g ){
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(MagnetX, MagnetY, 2*Radius, 2*Radius);
    }

    Ball_Game(){
        addMouseMotionListener(this);
        setSize(400,400);
        setLayout(null);
        setTitle("Magnet Game!");
        setVisible(true);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x < MagnetX+Radius){
            MagnetX++;
        }
        if (x > MagnetX+Radius){
            MagnetX--;
        }
        if (y < MagnetY+Radius){
            MagnetY++;
        }
        if (y > MagnetY+Radius){
            MagnetY--;
        }
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x < MagnetX+Radius){
            MagnetX++;
        }
        if (x > MagnetX+Radius){
            MagnetX--;
        }
        if (y < MagnetY+Radius){
            MagnetY++;
        }
        if (y > MagnetY+Radius){
            MagnetY--;
        }
        repaint();

    }

    public static void main(String[] args) {
        new Ball_Game();
    }
}
