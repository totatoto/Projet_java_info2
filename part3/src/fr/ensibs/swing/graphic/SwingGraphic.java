package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.Image;

import javax.swing.*;
import java.util.Objects;

/**
 * Swing implementation of the graphic interface
 * @author Daphnis Chevreton
 */
public class SwingGraphic implements Graphic<SwingImage> {

    /**
     * Component on which the image will be drawn
     */
    private JComponent component;

    /**
     * Label used to display that the image has been correctly loaded
     */
    private JLabel label;

    /**
     * Create a new swing
     * @param component the component that will hold the image
     * @throws NullPointerException if the component is null
     */
    public SwingGraphic(JComponent component){
        this.component = Objects.requireNonNull(component);
        this.label = new JLabel();
        this.component.add(label);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(SwingImage image) {
        //if the image is not null, which should never be the case, if contracts are respected, we display a text in the console
        //to show that the image has been correctly loaded
        if(image != null)
            System.out.println(String.format("Image %s correctly loaded", image.getName()));
        label.setText(image != null ? "Correctly loaded" : "Error");
    }
}
