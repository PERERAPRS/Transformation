import java.awt.*;
import javax.swing.*;

public class Shearing extends JFrame {
   
    int xpoint[] = {100, 200, 200, 100};
    int ypoint[] = {100, 100, 200, 200};

    int xshear[] = new int[4];
    int yshear[] = new int[4];

    public Shearing(){
        setTitle("Reflection");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(700,700);
    }
    public void paint(Graphics g){
         super.paint(g);
         g.setColor(Color.RED);
         g.drawPolygon(xpoint,ypoint,3);
         shearing(g, 1, 0);

    }

    public void shearing(Graphics g,int shx,int shy){
        for(int i=0;i<4;i++){
            xshear[i] = xpoint[i] + shx*ypoint[i];
            yshear[i] = ypoint[i] + shy*xpoint[i];
        }
        g.setColor(Color.GREEN);
        g.drawPolygon(xshear,yshear,3);

    }

 public static void main(String []arg){
    new Shearing();
 }
}
