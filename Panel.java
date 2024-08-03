import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Panel extends JPanel {

    private int playerX = 0;
    private int playerY = 0;
    private Image coin;

    public Panel() {
        coin = Toolkit.getDefaultToolkit().getImage("Coin.gif").getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        
    }

    public void setPlayerPosition(int x, int y) {
        this.playerX = x;
        this.playerY = y;
        repaint(); // Request the JPanel to repaint itself
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(coin, 0, 0, this);
    }
}