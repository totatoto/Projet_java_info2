package fr.ensibs.swing.sprites;


import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.ImageLoader;
import fr.ensibs.sprites.engines.Controller;
import fr.ensibs.swing.fs.SwingFileSystem;
import fr.ensibs.swing.graphic.SwingGraphic;
import fr.ensibs.swing.graphic.SwingImage;
import fr.ensibs.swing.graphic.SwingImageLoader;
import fr.ensibs.util.fs.FileSystem;

import javax.swing.*;
import java.io.File;

/**
 * This class is the main entry point of the program and use the swing implementation of the different interfaces
 *
 * @author Daphnis Chevreton
 */
public class SwingMain {

    /**
     * Main method
     *
     * @param args arguments of the program
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("SwingMain");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        f.setContentPane(pan);

        Graphic<SwingImage> graphic = new SwingGraphic(pan);
        FileSystem system = new SwingFileSystem();
        ImageLoader<SwingImage> loader = new SwingImageLoader();

        Controller<SwingImage> controller = new Controller<>(graphic, loader, system);
        controller.displayImage("resources/test.png");

        f.pack();
        f.setVisible(true);
    }

}
