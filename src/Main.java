import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RestaurantSuggester implements ActionListener {
    JFrame mainFrame;
    JPanel mBorderPanel, gridPanel, borderPanel2;
    JLabel cuisineQuestionLabel, locationQuestionLabel, priceRangeQuestionLabel;
    JButton submitButton, resetButton;
    JTextField cuisineAnswerField, locationAnswerField, priceRangeField, answerField;
    String cuisineAnswer, locationAnswer, priceRangeAnswer;

    public static void main(String[] args) {
        RestaurantSuggester code = new RestaurantSuggester(); // creates an instance of Restaurant Suggester
    }

    public RestaurantSuggester() {
        GUIStuff();
    }

    private void GUIStuff() {
        mainFrame = new JFrame("Restaurant Suggester"); // creates + titles "Restaurant Suggester"
        mainFrame.setBackground(new Color(31, 32, 35)); // background color of title
        mainFrame.setSize(600, 400); // size of JFrame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mBorderPanel = new JPanel(new BorderLayout());
        mBorderPanel.setOpaque(true);
        mainFrame.add(mBorderPanel);

        mBorderPanel = new JPanel(new BorderLayout());
        mainFrame.add(mBorderPanel);

        gridPanel = new JPanel(new GridLayout(6, 2)); // Updated grid layout to make questions  above text fields
        mBorderPanel.add(gridPanel, BorderLayout.NORTH);

        cuisineQuestionLabel = new JLabel("What cuisine are you in the mood for?"); // text for cuisine question
        gridPanel.add(cuisineQuestionLabel);
        cuisineAnswerField = new JTextField(20); // text field for cuisine answer
        gridPanel.add(cuisineAnswerField);
        cuisineQuestionLabel.setBackground(new Color(195, 135, 227));
        cuisineQuestionLabel.setOpaque(true);
        cuisineAnswerField.setBackground(new Color(229, 209, 237));


        locationQuestionLabel = new JLabel("What is your location?"); // new text for location question
        gridPanel.add(locationQuestionLabel);
        locationAnswerField = new JTextField(20); // text field for location answer
        gridPanel.add(locationAnswerField);
        locationQuestionLabel.setBackground(new Color(195, 135, 227));
        locationQuestionLabel.setOpaque(true);
        locationAnswerField.setBackground(new Color(229, 209, 237));

        priceRangeQuestionLabel = new JLabel("What is your price range?"); // new text for price range question
        gridPanel.add(priceRangeQuestionLabel);
        priceRangeField = new JTextField(20); // text field for price range answer
        gridPanel.add(priceRangeField);
        priceRangeQuestionLabel.setBackground(new Color(195, 135, 227));
        priceRangeQuestionLabel.setOpaque(true);
        priceRangeField.setBackground((new Color(229, 209, 237)));

        borderPanel2 = new JPanel();
        submitButton = new JButton("Submit");
        submitButton.setOpaque(true);
        submitButton.setBackground(new Color(34, 139, 34));

        resetButton = new JButton("Reset");
        resetButton.setOpaque(true);
        resetButton.setBackground(new Color(255, 69, 0));

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        borderPanel2.add(submitButton);
        borderPanel2.add(resetButton);
        mBorderPanel.add(borderPanel2, BorderLayout.SOUTH);

        // Make the frame visible
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}