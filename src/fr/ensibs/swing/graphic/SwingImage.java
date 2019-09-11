package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Image;

public class SwingImage implements Image {
	
	BufferedImage image;
	
	public SwingImage()
	
	/**
	 * Get the name of the image
	 * @return the name of the image
	 * @post return != null && return not empty (return.length() > 0)
	 */
	String getName() {
		
	}

	/**
	 * Get the width of the image
	 * @return the width of the image
	 * @post return > 0
	 */
	int getWidth() {
		
	}

	/**
	 * Get the height of the image
	 * @return the height of the image
	 * @post return > 0
	 */
	int getHeight() {
		
	}

	/**
	 * Get the dimension of the image
	 * @return the dimension of the image
	 * @post return.width == getWidth() && return.height == getHeight() && return.width > 0 && return.height > 0
	 */
	Dimension getDimension() {
		
	}
}