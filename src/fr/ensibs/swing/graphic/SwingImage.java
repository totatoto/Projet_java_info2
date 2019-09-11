package fr.ensibs.swing.graphic;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import fr.ensibs.graphic.Image;

public class SwingImage implements Image {

	private String name;

	private BufferedImage image;
	private Dimension dimension;

	public SwingImage (BufferedImage image, String name) {
		this.name = name;
		this.image = image;
		this.dimension = new Dimension(image.getWidth(), image.getHeight());
	}

	public java.awt.Image getImage()
	{
		return (java.awt.Image) this.image;
	}

	@Override
	/**
	 * Get the name of the image
	 * @return the name of the image
	 * @post return != null && return not empty (return.length() > 0)
	 */
	public String getName() {
		return this.name;
	}

	@Override
	/**
	 * Get the width of the image
	 * @return the width of the image
	 * @post return > 0
	 */
	public int getWidth() {
		return this.image.getWidth();
	}

	@Override
	/**
	 * Get the height of the image
	 * @return the height of the image
	 * @post return > 0
	 */
	public int getHeight() {
		return this.image.getHeight();
	}

	@Override
	/**
	 * Get the dimension of the image
	 * @return the dimension of the image
	 * @post return.width == getWidth() && return.height == getHeight() && return.width > 0 && return.height > 0
	 */
	public Dimension getDimension() {
		return this.dimension;
	}
}
