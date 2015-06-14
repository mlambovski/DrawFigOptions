package lab10zad3;

import javax.swing.JFrame;

public class Painter {

    public static void main(String[] args) {
        PaintPanel panel = new PaintPanel();
        JFrame app = new JFrame("A simple paint program");
        app.setSize(400, 350);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.add(panel);
    }
}
