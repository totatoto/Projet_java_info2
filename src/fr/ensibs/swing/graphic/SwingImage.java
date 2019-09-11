package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Image;

public class SwingImage implements Image {
	
	private String name;
	private int width;
	private int height;
	private int[] pixels;
	
	private Dimension dimensions;
	
	public SwingImage (BufferedImage image) {
		this.name = "JSPquellenom"; // TODO je ne sais pas quelle nom doit avoir l'image.
		this.width = image.getWidth();
		this.height = image.getHeight();
		this.pixels = image.getData().getPixels(0, 0, this.width, this.height, this.pixels); // TODO jsp si c'est ça.
		
		this.dimensions = new Dimension(this.width, this.height);
	}
	
	@Override
	/**
	 * Get the name of the image
	 * @return the name of the image
	 * @post return != null && return not empty (return.length() > 0)
	 */
	String getName() {
		return this.name;
	}

	@Override
	/**
	 * Get the width of the image
	 * @return the width of the image
	 * @post return > 0
	 */
	int getWidth() {
		return this.width;
	}

	@Override
	/**
	 * Get the height of the image
	 * @return the height of the image
	 * @post return > 0
	 */
	int getHeight() {
		return this.height;
	}

	@Override
	/**
	 * Get the dimension of the image
	 * @return the dimension of the image
	 * @post return.width == getWidth() && return.height == getHeight() && return.width > 0 && return.height > 0
	 */
	Dimension getDimension() {
		return this.dimension;
	}
}