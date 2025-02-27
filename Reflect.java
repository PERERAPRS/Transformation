import java.awt.*;
import javax.swing.*;

public class Reflect extends JFrame{
    int xpoint[] = {50,100,75};
    int ypoint[] = {-50,-50,-100};

    int xalongx[] = new int[3];
    int yalongx[] = new int[3];

    int xalongy[] = new int[3];
    int yalongy[] = new int[3];
    
    int xalongOrigin[] = new int[3];
    int yalongOrigin[] = new int[3];
    public Reflect(){
        setTitle("Reflection");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(700,700);
    }
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
        g2.translate(getWidth()/2,getHeight()/2);
        // g2.drawLine(-getWidth()/2,0,getWidth()/2,0);
        // g2.drawLine(0,-getHeight()/2,0,getHeight()/2);

        g.setColor(Color.BLUE);
        g.drawPolygon(xpoint,ypoint,3);
        along_x_axis(g);
        along_y_axis(g);
        along_origin(g);

    }

    public void along_x_axis(Graphics g){
         //new x = x
         //new y = -y
          for(int i=0;i<3;i++){
            xalongx[i] = xpoint[i];
            yalongx[i] = ypoint[i]*-1;
          }
          g.setColor(Color.CYAN);
          g.drawPolygon(xalongx,yalongx,3);
          
    }

    public void along_y_axis(Graphics g){
        for(int i=0;i<3;i++){
            xalongy[i] = xpoint[i]*-1;
            yalongy[i] = ypoint[i];
        }
        g.setColor(Color.GREEN);
        g.drawPolygon(xalongy,yalongy,3);
    }

    public void along_origin(Graphics g){
        for(int i=0;i<3;i++){
            xalongOrigin[i] = xpoint[i]*-1;
            yalongOrigin[i] = ypoint[i]*-1;
        }
        g.setColor(Color.BLACK);
        g.drawPolygon(xalongOrigin,yalongOrigin,3);
    }
    public static void main(String []arg){
       new Reflect();
    }

}
