import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFrame extends JFrame
{

    private JLabel userInfo;
    private JLabel nameInput;
    private JComboBox majorCombo;
    private JRadioButton single;
    private JRadioButton married;
    private JRadioButton separated;
    private JTextField nameField;
    // Provides an overarching Listener to implement all that's needed.
    private ActionListener listener;
    // Sets Window size of GUI Frame.
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 500;

    public GUIFrame()
    {

        // Initialization of overarching variables.
        userInfo = new JLabel();
        listener = new ChoiceListener();

        userInfo.setBorder(new TitledBorder(new EtchedBorder(Color.CYAN, Color.BLUE), "Outputs"));

        // Adds the User Information outputs to the Frame in the North position.
        add(userInfo, BorderLayout.NORTH);

        // Adds all the Controllable Panels to the frame in the South position.
        // (As declared in the 'createControlPanel' method)
        createControlPanel();

        // Calls to the loop method that is also called everytime the Listener is enacted.
        // This bit is responsible for Default values being presented upon running the program.
        setUserInfo();

        // Sets the size parameters (x, y) to the Frame size variables.
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

    }

    // Creates a new type of Listener that calls the loop method everytime an event occurs.
    class ChoiceListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            setUserInfo();
        }

    }

    // Allows the grouping of all three Controllable Panels.
    public void createControlPanel()
    {

        JPanel name = createName();
        JPanel major = createMajor();
        JPanel status = createStatus();

        JPanel controlPanel = new JPanel();
        // Allows the ability to format the panels so that they are 3 high and 1 across.
        controlPanel.setLayout(new GridLayout(3, 1));

        // Adds in order of Top to Bottom.
        controlPanel.add(name);
        controlPanel.add(major);
        controlPanel.add(status);

        // Declaration of Position relative to overarching GUI Frame.
        add(controlPanel, BorderLayout.SOUTH);

    }

    // Method creation for varying text field.
    public JPanel createName()
    {

        // Setting the size of the TextField allows it so that when you initially
        // open the program there is space to type rather than a tiny box.
        nameField = new JTextField(10);
        nameInput = new JLabel("Your Name: ");
        nameField.addActionListener(listener);
        nameField.setEditable(true);

        JPanel namePanel = new JPanel();

        // Outputs the 'Your Name: ' request prior to the empty text box.
        namePanel.add(nameInput);
        namePanel.add(nameField);

        // Adds a title and a Box around the panel.
        namePanel.setBorder(new TitledBorder(new EtchedBorder(Color.BLACK, Color.GRAY), "Name"));

        return namePanel;
    }

    // Method creation for Controllable Dropbox.
    public JPanel createMajor()
    {

        majorCombo = new JComboBox();
        // Also adds in Chronological order, Top to bottom - First to last.
        majorCombo.addItem("Computer Science");
        majorCombo.addItem("Education");
        majorCombo.addItem("Business");
        majorCombo.addItem("Marketing");
        majorCombo.addItem("Psychology");

        // This makes it so that the user cannot Backspace or Remove characters / create their own value / entry.
        majorCombo.setEditable(false);
        majorCombo.addActionListener(listener);

        JPanel majorPanel = new JPanel();
        majorPanel.add(majorCombo);
        majorPanel.setBorder(new TitledBorder(new EtchedBorder(Color.BLACK, Color.GRAY), "Major"));

        return majorPanel;

    }

    // Method creation for selectable given options.
    public JPanel createStatus()
    {

        single = new JRadioButton("Single");
        single.addActionListener(listener);

        // Selected by default upon running the program.
        single.setSelected(true);

        married = new JRadioButton("Married");
        married.addActionListener(listener);

        separated = new JRadioButton("Separated");
        separated.addActionListener(listener);

        // Groups all 3 options together to check for selected options.
        // If not grouped then all 3 could be selected due to them not communicating that there is already an option selected.
        ButtonGroup status = new ButtonGroup();

        status.add(single);
        status.add(married);
        status.add(separated);

        JPanel statusPanel = new JPanel();
        statusPanel.setBorder(new TitledBorder(new EtchedBorder(Color.BLACK, Color.GRAY), "Marital Status"));

        statusPanel.add(single);
        statusPanel.add(married);
        statusPanel.add(separated);

        return statusPanel;
    }

    // Loop that is referenced in the Listener that is
    // implemented into all the Controllable Panels and options.
    public void setUserInfo()
    {

        String status = "";

        // Triple if statement check. Since only 1 value can be selected at a time, no need for 'or' or && symbols.
        if(single.isSelected()) { status = "Single"; }
        else if (married.isSelected()) { status = "Married"; }
        else if (separated.isSelected()) { status = "Separated"; }

        // HTML is necessary in order to implement Line-breaks in a JLabel.
        userInfo.setText("<html><span style='font-size:20px'>User Information:<br/>" + nameField.getText() + "<br/>" + majorCombo.getSelectedItem() + "<br/><i>" + status + "</i></html>");

    }

}
