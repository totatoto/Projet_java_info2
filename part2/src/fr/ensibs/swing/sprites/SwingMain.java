package fr.ensibs.swing.sprites;


import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.ImageLoader;
import fr.ensibs.swing.graphic.SwingGraphic;
import fr.ensibs.swing.graphic.SwingImage;
import fr.ensibs.swing.graphic.SwingImageLoader;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class is the main entry point of the program and test to display a picture
 */
public class SwingMain {

    /**
     * Main method
     *
     * @param args arguments of the program
     */
    public static void main(String[] args) {
		
		// JFrame which will be displayed
        JFrame f = new JFrame("SwingMain");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        f.setContentPane(pan);

        Graphic<SwingImage> graphic = new SwingGraphic(pan);
        ImageLoader<SwingImage> loader = new SwingImageLoader();
		
		// Load the image
		SwingImage img = loader.load("test", null);
		
		// Display the image
		graphic.display(img);

        f.pack();
        f.setVisible(true);
    }

}
