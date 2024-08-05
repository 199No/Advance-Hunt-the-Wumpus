import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPress implements KeyListener {

    private Player player;
    private boolean isWPressed = false;
    private boolean isAPressed = false;
    private boolean isDPressed = false;
    private boolean isSpacePressed = false;

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
        
        if (keyCode == KeyEvent.VK_W && !isAPressed) {
            isWPressed = true;
            player.moveUp();
        } else if (keyCode == KeyEvent.VK_A) {
            isAPressed = true;
            player.moveLeft();
        } else if (keyCode == KeyEvent.VK_D ) {
            isDPressed = true;
            player.moveRight();
        }
        else if (keyCode == KeyEvent.VK_SPACE){
            isSpacePressed = true;
            player.attack();
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
        else if (keyCode == KeyEvent.VK_SPACE){
            isSpacePressed = false;
        }
    } 
}
