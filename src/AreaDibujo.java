import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class AreaDibujo extends JPanel {
    public AreaDibujo(){
        super();
        setBounds(70,100,400,400);
        setBackground(Color.GREEN);
    }
    public void paint(Graphics g){
        super.paint(g);
        //parada Base
        g.fillRect(90,20,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(90,100,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(90,180,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(90,260,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(90,340,100,40);
        g.setColor(Color.lightGray);

        g.fillRect(210,20,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(210,100,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(210,180,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(210,260,100,40);
        g.setColor(Color.lightGray);
        //parada de
        g.fillRect(210,340,100,40);
        g.setColor(Color.gray);
    }
}
