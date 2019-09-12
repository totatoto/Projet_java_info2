package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.ImageLoader;

import javax.imageio.ImageIO;
import java.io.InputStream;

/**
 * Allows to load an SwingImage
 */
public class SwingImageLoader implements ImageLoader<SwingImage> {

    @Override
	public SwingImage load(String name, InputStream is) {
        try {
            return new SwingImage(ImageIO.read(is), name);
        } catch (Exception e) {
            return null;
        }
    }
}
