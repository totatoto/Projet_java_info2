package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Image;
import fr.ensibs.graphic.ImageLoader;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.InputStream;

public class SwingImageLoaderTest implements ImageLoader {
    @Override
    public Image load(InputStream is) {
        try {
            return new SwingImageTest(ImageIO.read(is), "IMG_" + is.hashCode());
        } catch (IOException e) {
            return null;
        }
    }
}
