package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Image;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SwingImage implements Image {

    private String name;

    private BufferedImage image;
    private Dimension dimension;

    public SwingImage(BufferedImage image, String name) {
        this.name = name;
        this.image = image;
        this.dimension = new Dimension(image.getWidth(), image.getHeight());
    }

    public BufferedImage getImage() {
        return this.image;
    }

    @Override
	public String getName() {
        return this.name;
    }

    @Override
	public int getWidth() {
        return this.image.getWidth();
    }

    @Override
	public int getHeight() {
        return this.image.getHeight();
    }

    @Override
	public Dimension getDimension() {
        return this.dimension;
    }
}
