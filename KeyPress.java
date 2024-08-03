import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPress implements KeyListener {

    private Player player;

    public KeyPress(Player player) {
        this.player = player;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // We won't use this method in this program
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //player.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            //player.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            //player.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // We won't use this method in this program
    }
}