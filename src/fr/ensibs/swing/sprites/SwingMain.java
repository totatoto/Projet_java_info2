package fr.ensibs.swing.sprites;


import fr.ensibs.swing.graphic.SwingGraphic;

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
        JFrame f = new JFrame("nom");
        f.setVisible(true);
        f.setSize(1300, 1000);
        JPanel pan = new JPanel();
        f.add(pan);
        Graphic graphic = new SwingGraphic(pan);
        System.out.println(pan.getComponents().length);

        //Graphic graphic = new SwingGraphicEmpty(new JLabel());
        FileSystem system = new SwingFileSystem();
        ImageLoader loader = new SwingImageLoader();

        Controller controller = new Controller(graphic, loader, system);
        System.out.println(pan.getComponents().length);
        controller.displayImage("test.png");
        System.out.println(((ImageIcon)((JLabel)pan.getComponents()[0]).getIcon()).getImage());
        f.repaint();
    }

}
