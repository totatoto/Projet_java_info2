package fr.ensibs.swing.graphic;

import java.io.InputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import fr.ensibs.swing.graphic.SwingImage;
import fr.ensibs.graphic.ImageLoader;
import fr.ensibs.graphic.Image;

/**
 * Allows to load an SwingImage
 */
public class SwingImageLoader implements ImageLoader {

	@Override
	/**
	 * Load a SwingImage from an input stream
	 * @param is the input stream to use
	 * @return the image loaded from the input stream or null if an error occurred while reading the input stream
	 * @pre is != null
	 */
	public Image load (InputStream is) {
		try {
			return new SwingImage(ImageIO.read(is), "IMG_" + is.hashCode());
		} catch (IOException e) {
			return null;
		}
	}
}
