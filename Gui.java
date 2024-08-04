import javax.swing.JFrame;

public class Gui extends JFrame {

    private Player player;
    private KeyPress keyPresser;

    public Gui(Panel panel) {
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 750);
        setResizable(false);
        setLocationRelativeTo(null);

        player = new Player();
        keyPresser = new KeyPress(player, panel);
        addKeyListener(keyPresser);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        setVisible(true);
    }


}