import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFrameTest extends JFrame
{

    private JLabel nameRequest;
    private JLabel label;
    private JLabel nameLabel;
    private JLabel majorLabel;
    private JLabel marriageLabel;
    private JComboBox majorCombo;
    private JRadioButton single;
    private JRadioButton married;
    private JRadioButton separated;
    private JTextField nameField;
    private ActionListener listener;

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 500;

    public GUIFrameTest()
    {

        label = new JLabel("User Information: ");
        listener = new ChoiceListener();

        createControlPanel();
        createOutputs();
        setUserInfo();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

    }

    class ChoiceListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            setUserInfo();
        }

    }

    public void createControlPanel()
    {
        JPanel name = createName();
        JPanel major = createMajor();
        JPanel status = createStatus();

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 1));

        controlPanel.add(name);
        controlPanel.add(major);
        controlPanel.add(status);

        add(controlPanel, BorderLayout.SOUTH);
    }

    public void createOutputs()
    {
        nameLabel = new JLabel(nameField.getText());
        majorLabel = new JLabel(majorCombo.getSelectedItem().toString());
        marriageLabel = new JLabel();

        JPanel outputsPanel = new JPanel();

        outputsPanel.setLayout(new GridLayout(4,1));
        outputsPanel.setBorder(new TitledBorder(new EtchedBorder(Color.CYAN, Color.BLUE), "Outputs"));

        outputsPanel.add(label);
        outputsPanel.add(nameLabel);
        outputsPanel.add(majorLabel);
        outputsPanel.add(marriageLabel);

        add(outputsPanel, BorderLayout.NORTH);
    }

    public JPanel createName()
    {

        nameField = new JTextField(10);
        nameRequest = new JLabel("Your Name: ");
        nameField.addActionListener(listener);
        nameField.setEditable(true);

        JPanel namePanel = new JPanel();

        namePanel.add(nameRequest);
        namePanel.add(nameField);

        namePanel.setBorder(new TitledBorder(new EtchedBorder(Color.BLACK, Color.GRAY), "Name"));

        return namePanel;

    }

    public JPanel createMajor()
    {

        majorCombo = new JComboBox();
        majorCombo.addItem("Computer Science");
        majorCombo.addItem("Education");
        majorCombo.addItem("Business");
        majorCombo.addItem("Marketing");
        majorCombo.addItem("Psychology");

        majorCombo.setEditable(false);
        majorCombo.addActionListener(listener);

        JPanel majorPanel = new JPanel();
        majorPanel.add(majorCombo);
        majorPanel.setBorder(new TitledBorder(new EtchedBorder(Color.BLACK, Color.GRAY), "Major"));

        return majorPanel;

    }

    public JPanel createStatus()
    {

        single = new JRadioButton("Single");
        single.addActionListener(listener);

        single.setSelected(true);

        married = new JRadioButton("Married");
        married.addActionListener(listener);

        separated = new JRadioButton("Separated");
        separated.addActionListener(listener);

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

    public void setUserInfo()
    {
        String name = nameField.getText();
        nameLabel.setText(name);

        String major = (String) majorCombo.getSelectedItem();
        majorLabel.setText(major);

        if (single.isSelected()) { marriageLabel.setText("Single"); }
        else if (married.isSelected()) { marriageLabel.setText("Married"); }
        else if (separated.isSelected()) { marriageLabel.setText("Separated"); }

        nameLabel.repaint();
        majorLabel.repaint();
        marriageLabel.repaint();
    }

}