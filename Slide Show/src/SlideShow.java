import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
/* This import is used for the random button */
import java.util.Random;

public class SlideShow extends JFrame {

	//Declare Variables
	private JPanel slidePane;
	private JPanel textPane;
	private JPanel buttonPane;
	private CardLayout card;
	private CardLayout cardText;
	private JButton btnPrev;
	private JButton btnNext;
	private JLabel lblSlide;
	private JLabel lblTextArea;
	/* Used for random button functionality */
	/* Should make the max button tied to how many items are on the screen, but
	 * I'm having a little trouble with that. 
	 * 
	 * NOTE TO SELF:
	 * 
	 * Should tie the 'max' variable to the length of the slides list to make this program expandable.
	 * 
	 */
	private JButton randomButton;
	int min = 1;
    int max = 5;
    
	/**
	 * Create the application.
	 */
	public SlideShow() throws HeadlessException {
		initComponent();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initComponent() {
		//Initialize variables to empty objects
		card = new CardLayout();
		cardText = new CardLayout();
		slidePane = new JPanel();
		textPane = new JPanel();
		
		// Set the (x, y, width, height) of the text area
		textPane.setBounds(200, 447, 400, 70);
		textPane.setVisible(true);
		
		// Slide Buttons
		buttonPane = new JPanel();
		btnPrev = new JButton();
		btnNext = new JButton();
		randomButton = new JButton();
		
		// Slide Labels
		lblSlide = new JLabel();
		lblTextArea = new JLabel();
		
		// Styling for elements of the program
		lblSlide.setForeground(new java.awt.Color(249, 241, 240));
		slidePane.setBackground(new java.awt.Color(35, 43, 27));
		textPane.setBackground(new java.awt.Color(103, 65, 38));
		
		// Style buttons
		buttonPane.setBackground(new java.awt.Color(164, 92, 64));
		// Previous button
		btnPrev.setBackground(new java.awt.Color(246, 238, 224));
		btnPrev.setForeground(new java.awt.Color(164, 92, 64));
		btnPrev.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new java.awt.Color(35, 43, 27),1),
				BorderFactory.createLineBorder(new java.awt.Color(246, 238, 224), 4)));
		// Set size of Previous button
		btnPrev.setPreferredSize(new Dimension(80, 20));
		
		// Next button
		btnNext.setBackground(new java.awt.Color(246, 238, 224));
		btnNext.setForeground(new java.awt.Color(164, 92, 64));
		btnNext.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new java.awt.Color(35, 43, 27),1),
				BorderFactory.createLineBorder(new java.awt.Color(246, 238, 224), 4)));
		// Set size of Next button
		btnNext.setPreferredSize(new Dimension(80, 20));
		
		// Random button
		randomButton.setBackground(new java.awt.Color(246, 238, 224));
		randomButton.setForeground(new java.awt.Color(164, 92, 64));
		randomButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new java.awt.Color(35, 43, 27),1),
				BorderFactory.createLineBorder(new java.awt.Color(246, 238, 224), 4)));
		// Set size of random button
		randomButton.setPreferredSize(new Dimension(80, 20));
		
		//Setup frame attributes
		setSize(800, 600);
		
		// Make it so the program cannot be resized
		setResizable(false);
		setLocationRelativeTo(null);
		
		// Title of program
		setTitle("Top 5 Destinations SlideShow");
		
		// Set the layout with a border
		getContentPane().setLayout(new BorderLayout(15, 80));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Setting the layouts for the panels
		slidePane.setLayout(card);
		textPane.setLayout(cardText);
		
		//logic to add each of the slides and text
		for (int i = 1; i <= 5; i++) {
			lblSlide = new JLabel();
			lblTextArea = new JLabel();
			lblSlide.setText(getResizeIcon(i));
			lblTextArea.setText(getTextDescription(i));
			slidePane.add(lblSlide, "card" + i);
			textPane.add(lblTextArea, "cardText" + i);
		}
		
		getContentPane().add(slidePane, BorderLayout.CENTER);
		getContentPane().add(textPane, BorderLayout.SOUTH);

		buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		
		/**
		 * Put the Previous Button on the page
		 */
		
		btnPrev.setText("Previous");
		btnPrev.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				goPrevious();
			}
		});
		buttonPane.add(btnPrev);
		
		/**
		 * Put the Random Button on the page
		 */
		randomButton.setText("Random");
		randomButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				goRandom();
			}
		});
		buttonPane.add(randomButton);
		
		
		/**
		 * Put the Next Button on the page
		 */
		btnNext.setText("Next");
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				goNext();
			}
		});
		buttonPane.add(btnNext);
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		
	
	/**
	 * Previous Button Functionality
	 */
	private void goPrevious() {
		card.previous(slidePane);
		cardText.previous(textPane);
	}
	
	/* Method to get a random slide */
	private void goRandom() {
		/* Generate random number */
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		// For loop determines 
		for (int i = 0; i < random_int; i++) {
			card.next(slidePane);
			cardText.next(textPane);
		}
	}
	
	/**
	 * Next Button Functionality
	 */
	private void goNext() {
		card.next(slidePane);
		cardText.next(textPane);
	}

	/**
	 * Method to get the images
	 */
	private String getResizeIcon(int i) {
		String image = ""; 
		String imageFilePath = "";
		/* Implement DRY standards by making the image file paths their own variable and using string concatenation  
		 * to combine the file path and the HTML for the slide */
		if (i==1){
			imageFilePath = "/resources/simplyhealing.jpg";
		} else if (i==2){
			imageFilePath = "/resources/anandaspa.jpg";
		} else if (i==3){
			imageFilePath = "/resources/longevitywellness.jpg";
		} else if (i==4){
			imageFilePath = "/resources/kamalaya.jpg";
		} else if (i==5){
			imageFilePath = "/resources/eastman.jpg";
		}
		// Create the HTML and put it on the slide
		image = "<html><body style='padding-left: 110px;'><img width=500 height=400 src='" + getClass().getResource(imageFilePath) + "'</body></html>";
		return image;
	}
	
	/**
	 * Method to get the text values
	 */
	private String getTextDescription(int i) {
		// Define variables to be used in conditional statement
		String text = ""; 
		String location = "";
		String description = "";
		String link = "";
		
		// This sets up each card's location, description, and link
		// Depending on which slide number the user is on
		if (i==1){
			location = " Simply Healing, England";
			description = "Residential Holistic detox retreat set in the West Sussex countryside.";
			link = "https://www.simplyhealingcentre.com";
		} else if (i==2){
			location = " Ananda, India";
			description = "A 24,000 sq ft world class spa set in the beautiful himalayas that is set on the 100 acre Maharaja's Palace.";
			link = "https://www.anandaspa.com/en/home";
		} else if (i==3){
			location = " Longevity Wellness, Portugal";
			description = "An adult-only health and wellness facility that includes a rooftop infinity pool and breathtaking views of the bay of Alvor.";
			link = "https://longevitywellnessworldwide.com/";
		} else if (i==4){
			location = " Kamalaya, Thailand";
			description = "A wellness sanctuary and Holistic spa resort with amazing views of the fresh sea air of Kamalaya.";
			link = "https://www.kamalaya.com/index.htm";
		} else if (i==5){ 
			location = " Spa Eastman, Canada";
			description = "A Health and wellness retreat outfitted with a restaurant, boutique, and a vast array of activities and events.";
            link = "https://www.spa-eastman.com/en/";
		}
		/* Set up the HTML for the slide text */
		text = "<html><head><style>@import url('https://fonts.googleapis.com/css2?family=Barlow&family=Lobster&display=swap');</style></head>"
				+ "<body style='text-align: center; padding-left: 10px; border: 6px solid #362419; color: #F9F1F0;font-family: 'Barlow', sans-serif;>"
				+ "<font size='5'>"
				+ "#" + i + location
				+ "</font>"
				+ "<br>"
				+ description
				+ "<br>"
				+ "<font size='1'>"
				+ "Image from: " + link
				+ "</font>"
				+ "</body></html>";
		return text;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				SlideShow ss = new SlideShow();
				ss.setVisible(true);
			}
		});
	}
}