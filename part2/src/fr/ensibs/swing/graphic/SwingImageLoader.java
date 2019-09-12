package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.ImageLoader;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Allows to load an SwingImage
 */
public class SwingImageLoader implements ImageLoader<SwingImage> {

	/**
     * {@inheritDoc}
     */
    @Override
	public SwingImage load(String name, InputStream is) {
        try {
            return new SwingImage(ImageIO.read(new FileInputStream("test.jpg")), name);
        } catch (IOException e) {
            return null;
        }
    }
}
