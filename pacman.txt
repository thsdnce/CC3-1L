import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Area;
import java.text.AttributedCharacterIterator;
import java.util.Random;

public class PacMan extends JPanel implements ActionListener, KeyListener {

    int x = 50;
    int y = 50;
    private Timer timer;
    private long startTime = -1;
    private long duration = 10;
    int n;
    String sc = "0";
    String ssc = "0";
    String hsc = "0";
    String hhsc = "0";
    static Color color1;
    int startangle = 30;
    int endangle = 300;
    int count = 1;
    Random random = new Random();
    int fx = random.nextInt(400);
    int fy = random.nextInt(400);
    Rectangle chaR;
    Rectangle food;
    Timer t = new Timer(5, this);
    static JFrame jf = new JFrame();
    static PacMan pac = new PacMan();
    /*static JFrame jf = new JFrame();
    static JFrame fj = new JFrame();
    static JButton bt = new JButton();
    static PacMan pac = new PacMan();
    static EndState est = new EndState();
    public EndState es;
    public PacMan pm; */

    PacMan() {
        t.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }
    /* public void EndState(){      
        fj.setSize(500, 700);
        fj.setResizable(false);
        fj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fj.setVisible(true);
        
        JLabel lbl = new JLabel();
        lbl.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
        lbl.setText("YOU WIN!!!!");
        fj.add(lbl);
        fj.setVisible(true);
        
    } */

    public void eat(Graphics g) {

        Area a = new Area((Shape) chaR);
        Area b = new Area(food);

        a.intersect(new Area(b));
        b.intersect(new Area(a));
        if (!a.isEmpty() || !b.isEmpty()) {
            Random random = new Random();
            //dimensions of frame
            fy = random.nextInt(450) + 10;
            fx = random.nextInt(350) + 10;
            //score
            int result = Integer.parseInt(sc);
            result++;
            sc = String.valueOf(result);

            if (result==2) {//Joptionpane & Dispose on close function     
                paint2(g);
                
            }

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //background

        Graphics2D graphic = (Graphics2D) g;
        graphic.setColor(Color.BLACK); // bg color 
        graphic.fillRect(0, 0, 550, 600);
        food = new Rectangle(fx, fy, 60, 60);
        graphic.fill(food);
        g.setColor(new Color(255,215,0)); // color of the food 
        g.fillOval(fx + 8, fy + 8, 30, 30); // size of the food 
         
        graphic.setColor(Color.YELLOW);
        chaR = new Rectangle(40 + x, 40 + y, 5, 5);
        graphic.fill(chaR);

        graphic.setColor(Color.YELLOW);
        graphic.fillArc(x, y, 100, 100, startangle, endangle);

        // Score
        g.setFont(new Font("Century Gothic", Font.BOLD, 20));
        graphic.setColor(Color.BLACK);
        graphic.drawString("Score: ", 20, 630);
        
        graphic.drawString(sc, 340, 630);

        eat(g);
        

    }
    
    public void paint2(Graphics g){
        Graphics2D graphic = (Graphics2D) g;
        g.setFont(new Font("Century Gothic", Font.ITALIC, 20));
        graphic.setColor(Color.WHITE);
        graphic.drawString("You Win: ", 250, 350);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {

            startangle = 140;
            endangle = 260;

//          
            count++;

            if (count % 2 == 0) {
                startangle = 360;
                endangle = 360;
            }
            if (y > -42) {
                y -= 5;
            } else {
                y = 500;
            }

        } else if (key == KeyEvent.VK_DOWN) {
            startangle = 300;
            endangle = 300;

            count++;
            if (count % 2 == 0) {

                startangle = 360;
                endangle = 360;
            }

            if (y < 500) {
                y += 5;
            } else {
                y = -42;
            }
        } else if (key == KeyEvent.VK_LEFT) {
            startangle = 225;
            endangle = 290;

            count++;

            if (count % 2 == 0) {
                startangle = 360;
                endangle = 360;
            }
            if (x > -42) {
                x -= 5;
            } else {
                x = 500;
            }

        } else if (key == KeyEvent.VK_RIGHT) {
            startangle = 30;
            endangle = 300;

            count++;
            if (count % 2 == 0) {
                startangle = 360;
                endangle = 360;
            }
            if (x < 500) {
                x += 5;
            } else {
                x = -50;
            }
        }
        System.out.println(count);

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        jf.add(pac);
        jf.setSize(500, 700);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }

}