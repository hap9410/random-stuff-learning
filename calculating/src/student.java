import javax.swing.*;

public class student {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("student");
        frame.setContentPane(new student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
