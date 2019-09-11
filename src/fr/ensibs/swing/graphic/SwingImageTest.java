package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class SwingImageTest implements Image {

    private BufferedImage image;

    private String name;

    private Dimension dimension;


    public SwingImageTest(BufferedImage image, String name){
        this.image = image;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWidth() {
        return image.getWidth();
    }

    @Override
    public int getHeight() {
        return image.getHeight();
    }

    @Override
    public Dimension getDimension() {
        if(dimension == null)
            dimension = new Dimension(getWidth(), getHeight());
        return dimension;
    }
}
