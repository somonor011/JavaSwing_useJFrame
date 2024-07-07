import javax.swing.*;

public class Main extends JFrame{

    public Main(){
        setLayout(null); // set layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500); // set Size

        setTitle("Frame Title goes here");

        setResizable(false); // can't resize frame
        setLocationRelativeTo(this); // show frame center on screen
        setVisible(true); // show frame
    }

    public static void main(String[] args) {
        new Main();
    }
}