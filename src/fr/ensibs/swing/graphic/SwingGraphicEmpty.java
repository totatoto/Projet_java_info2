package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.Image;

import javax.swing.*;
import java.util.Objects;

/**
 * Swing implementation of the graphic interface
 * @author Daphnis Chevreton
 */
public class SwingGraphicEmpty implements Graphic {

    /**
     * Component on which the image will be drawn
     */
    private JComponent component;

    /**
     * Create a new swing
     * @param component the component that will hold the image
     * @throws NullPointerException if the component is null
     */
    public SwingGraphicEmpty(JComponent component){
        this.component = Objects.requireNonNull(component);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(Image image) {
        //if the image is not null, which should never be the case, if contracts are respected, we display a text to show that the image has been
        //correctly loaded
        if(image != null){
            component.add(new JLabel(("Image loaded")));
        }
    }
}
