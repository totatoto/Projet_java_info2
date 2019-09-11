package fr.ensibs.swing.sprites;

import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.ImageLoader;
import fr.ensibs.sprites.engines.Controller;
import fr.ensibs.swing.fs.SwingFileSystem;
import fr.ensibs.swing.graphic.SwingGraphicEmpty;
import fr.ensibs.swing.graphic.SwingImageLoader;
import fr.ensibs.util.fs.FileSystem;

import javax.swing.*;

/**
 * This class is the main entry point of the program and use the swing implementation of the different interfaces
 * @author Daphnis Chevreton
 */
public class SwingMain {

    /**
     * Main method
     * @param args arguments of the program
     */
    public static void main(String[] args) {
        Graphic graphic = new SwingGraphicEmpty(new JLabel());
        FileSystem system = new SwingFileSystem();
        ImageLoader loader = new SwingImageLoader();

        Controller controller = new Controller(graphic, loader, system);
        controller.displayImage("test.png");
    }

}
