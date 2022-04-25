import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GuiSwing {
        public static void main(String[] args) {
           
        /*JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info2", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info3", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info4", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info5", "title", JOptionPane.ERROR_MESSAGE);
*/
        //int answer = JOptionPane.showConfirmDialog(null, "bor, do you code!", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?");  
        //System.out.println("Hello "+ name);
          
        
        String[] responses = {"No youre awesome", "Thanks", "*blush"};
        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(
            null,
         "You are awesome",
          "Secret message",
           JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
             icon,
              responses,
              2);

    }
}
