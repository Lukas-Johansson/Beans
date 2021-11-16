import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Välj 7 nnummer ");
        int x = Integer.parseInt(a);
        int k = x/7;
        String medel = "Medelvärdet är" + k;
        JOptionPane.showMessageDialog(null,  medel);

    }
}