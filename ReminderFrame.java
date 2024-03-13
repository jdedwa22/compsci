import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReminderFrame extends JFrame
{

    private JButton button;
    private JLabel result;
    private int hours;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 150;

    public ReminderFrame()
    {

        hours = 7;

        createFrame();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

    }

    class AddClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {

            result.setText("You need to study at least " + hours + " hours per week to be able to successfully pass ACO 102");

        }

    }

    private void createFrame()
    {

        button = new JButton("Study Reminder");
        ActionListener listener = new AddClickListener();
        button.addActionListener(listener);

        result = new JLabel("Jacob Dale Edwards");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(result);
        add(panel);

    }

}
