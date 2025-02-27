import java.awt.*;
import javax.swing.*;

public class Transformation extends JFrame{
    int xpoint[] = {100, 200, 200, 100};
    int ypoint[] = {100, 100, 200, 200};

    int xtrans[] = new int[4];
    int ytrans[] = new int[4];

    int xscale[] = new int[4];
    int yscale[] = new int[4];

    int xrota[] = new int[4];
    int yrota[] = new int[4];

    Transformation(){
        setTitle("Transformation");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setVisible(true);

    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.GREEN);
        g.drawPolygon(xpoint, ypoint, 4);
        transition(g, 200, 200);
        scaling(g,2,2);
        clock_wise_rotation(g,20);
        anti_clocwise_rotation(g,20);
        

    }
    public void transition(Graphics g,int tx,int ty){
        for(int i=0; i<4;i++){
            xtrans[i] = xpoint[i]+tx;
            ytrans[i] = ypoint[i]+ty;
        }
        g.setColor(Color.BLUE);
        g.drawPolygon(xtrans, ytrans, 4);
    }

    public void scaling(Graphics g,int sx,int sy){
        for(int i=0;i<4;i++){
            xscale[i] = xpoint[i]*sx;
            yscale[i] = ypoint[i]*sy;
        }
        g.setColor(Color.ORANGE);
        g.drawPolygon(xscale, yscale, 4);
    }

    public void clock_wise_rotation(Graphics g,double degree){
        double a = Math.toRadians(degree);
        for(int i=0;i<4;i++){
            xrota[i] = (int)(xpoint[i]*Math.cos(a)+ypoint[i]*Math.sin(a));
            yrota[i] = (int)(-xpoint[i]*Math.sin(a)+ypoint[i]*Math.cos(a));
        }
        // for(int s: xrota){
        //     System.err.println(s);
        // }
        // for(int s: yrota){
        //     System.err.println(s);
        
        g.setColor(Color.RED);
        g.drawPolygon(xrota, yrota, 4);       
    }
    public void anti_clocwise_rotation(Graphics g,double degree){
        double a = Math.toRadians(degree);
        for(int i=0;i<4;i++){
            xrota[i] = (int)(xpoint[i]*Math.cos(a)-ypoint[i]*Math.sin(a));
            yrota[i] = (int)(xpoint[i]*Math.sin(a)+ypoint[i]*Math.cos(a));
        }
        g.setColor(Color.BLACK);
        g.drawPolygon(xrota, yrota, 4);
    }

    


    public static void main(String []arg){
         new Transformation();
    }





}