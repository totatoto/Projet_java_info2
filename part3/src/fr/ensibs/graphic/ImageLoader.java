package fr.ensibs.graphic;

import java.io.InputStream;
import fr.ensibs.graphic.Image;

/**
 * Allows to load an image
 */
public interface ImageLoader<ImageType extends Image> {
	
	/**
	 * Load an image from an input stream
	 * @param name name of the image
	 * @param is the input stream to use
	 * @return the image loaded from the input stream or null if an error occurred while reading the input stream
	 * @pre is != null
	 */
	ImageType load(String name, InputStream is);
}
