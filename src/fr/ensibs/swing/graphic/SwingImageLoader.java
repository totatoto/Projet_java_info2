package fr.ensibs.swing.graphic;

import java.io.InputStream;

import java.awt.Image
//import fr.ensibs.graphic.Image;
import fr.ensibs.graphic.ImageLoader;

/**
 * Allows to load an SwingImage
 */
public class SwingImageLoader {
	
	/**
	 * Load a SwingImage from an input stream
	 * @param is the input stream to use
	 * @return the image loaded from the input stream or null if an error occurred while reading the input stream
	 * @pre is != null
	 */
	public Image load(InputStream is) {
		InputStream in = new FileInputStream("image.png");
		return ImageIO.read(in);
	}
}