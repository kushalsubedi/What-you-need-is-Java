import java.awt.*;
import javax.swing.*;
/*
 * Java Swing vs AWT 
 * | AWT | Swing |
 * | --- | ----- |
 * | AWT components are platform dependent. | Swing components are platform independent. |
 * | AWT components are heavyweight. | Swing components are lightweight. |
 * | AWT doesn't support pluggable look and feel. | Swing supports pluggable look and feel. |
 * | AWT provides less components than Swing. | Swing provides more components than AWT. |
 * | AWT doesn't follow MVC(Model View Controller) | Swing follows MVC(Model View Controller) |
 * | AWT doesn't use double buffering to paint. | Swing uses double buffering to paint. |
 * | AWT is thread safe. | Swing is not thread safe. |
 * | AWT doesn't provide any advanced controls such as tabbed pane, scroll panes, tables, lists, color chooser
 *  dialog, date picker, and slider. | Swing provides all the advanced controls such as tabbed pane, scroll panes,
 *
 *
 *
 *
 * */
public class NewFrame {
    public static void main (String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("New Frame");
        frame.setSize(300, 200);
        frame.setLocation(100, 50);
        frame.setVisible(true);

    }
}
