import javax.swing.*;

public class snakeGame extends JFrame {

    snakeGame() {
        super("Snake Game");
        add(new board());
        pack();

        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new snakeGame().setVisible(true);
    }
}