package fr.ensibs.graphic;

import java.io.InputStream;

/**
 * Allows to load an image
 */
public interface ImageLoader<ImageType> {
	
	/**
	 * Load an image from an input stream
	 * @param is the input stream to use
	 * @return the image loaded from the input stream or null if an error occurred while reading the input stream
	 * @pre is != null
	 */
	ImageType load(String name, InputStream is);
}
