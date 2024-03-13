import javax.swing.*;

public class GUIViewer
{

    public static void main(String[] args)
    {

        // Creates overarching Window frame. Calls for 'GUIFrame' method that implements all the other aspects.
        JFrame frame = new GUIFrameTest();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sets title of Window.
        frame.setTitle("User Information Viewer");
        frame.setVisible(true);

    }

}
