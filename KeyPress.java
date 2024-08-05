import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPress implements KeyListener {

    private Player player;
    private boolean isWPressed = false;
    private boolean isAPressed = false;
    private boolean isDPressed = false;

    public KeyPress(Player player, Panel panel) {
        this.player = player;
        this.player.setPanel(panel);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // We won't use this method in this program
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        if (keyCode == KeyEvent.VK_W && !isWPressed) {
            isWPressed = true;
            player.moveUp();
        } else if (keyCode == KeyEvent.VK_A && !isAPressed) {
            isAPressed = true;
            player.moveLeft();
        } else if (keyCode == KeyEvent.VK_D && !isDPressed) {
            isDPressed = true;
            player.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        if (keyCode == KeyEvent.VK_W) {
            isWPressed = false;
        } else if (keyCode == KeyEvent.VK_A) {
            isAPressed = false;
        } else if (keyCode == KeyEvent.VK_D) {
            isDPressed = false;    }
        }
}