package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Image;
import fr.ensibs.graphic.ImageLoader;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;

/**
 * Allows to load an SwingImage
 */
public class SwingImageLoader implements ImageLoader<SwingImage> {

    @Override
	public SwingImage load(InputStream is) {
        try {
            return new SwingImage(ImageIO.read(is), "IMG_" + is.hashCode());
        } catch (IOException e) {
            return null;
        }
    }
}
