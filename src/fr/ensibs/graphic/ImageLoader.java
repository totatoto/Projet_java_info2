package fr.ensibs.graphic;

import java.io.InputStream;
import fr.ensibs.graphic.Image;

/**
 * Allows to load an image
 */
public interface ImageLoader {
	
	/**
	 * Load an image from an input stream
	 * @param is the input stream to use
	 * @return the image loaded from the input stream or null if an error occurred while reading the input stream
	 * @pre is != null
	 */
	Image load(InputStream is);
}
