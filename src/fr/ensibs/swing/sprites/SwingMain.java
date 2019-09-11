package fr.ensibs.swing.sprites;

import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.ImageLoader;
import fr.ensibs.sprites.engines.Controller;
import fr.ensibs.swing.fs.SwingFileSystem;
import fr.ensibs.swing.graphic.SwingGraphic;
import fr.ensibs.swing.graphic.SwingImageLoader;
import fr.ensibs.util.fs.FileSystem;

import javax.swing.*;

public class SwingMain {

    public static void main(String[] args) {
        Graphic graphic = new SwingGraphic(new JLabel());
        FileSystem system = new SwingFileSystem();
        ImageLoader loader = new SwingImageLoader();

        Controller controller = new Controller(graphic, loader, system);
        controller.displayImage("img/test.png");
    }

}
