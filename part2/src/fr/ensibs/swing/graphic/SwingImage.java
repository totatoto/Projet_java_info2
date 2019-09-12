package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Image;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

/**
 * This represent an image using Swing that can be loaded from the file system and then display on the screen
 */ 
public class SwingImage implements Image {

	/**
	 * The name of the image
	 */
    private String name;

	/**
	 * The linked BufferedImage
	 */
    private BufferedImage image;
	
	/**
	 * The dimension of the image
	 */
    private Dimension dimension;

	/**
	 * Create a new SwingImage
	 * @param image The linked BufferedImage
	 * @param name The name of the image
	 */
    public SwingImage(BufferedImage image, String name) {
        this.name = name;
        this.image = image;
        this.dimension = new Dimension(image.getWidth(), image.getHeight());
    }

	/**
	 * Get the bufferedImage
	 * @return the BufferedImage
	 * @post return != null
	 */
    public BufferedImage getImage() {
        return this.image;
    }

	/**
     * {@inheritDoc}
     */
    @Override
	public String getName() {
        return this.name;
    }

	/**
     * {@inheritDoc}
     */
    @Override
	public int getWidth() {
        return this.image.getWidth();
    }

	/**
     * {@inheritDoc}
     */
    @Override
	public int getHeight() {
        return this.image.getHeight();
    }

	/**
     * {@inheritDoc}
     */
    @Override
	public Dimension getDimension() {
        return this.dimension;
    }
}
