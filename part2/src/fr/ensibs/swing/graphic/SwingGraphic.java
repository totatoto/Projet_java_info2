package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComponent;
import java.util.Objects;

/**
 * Swing implementation of the graphic interface
 */
public class SwingGraphic implements Graphic<SwingImage> {

    /**
     * Component on which the image will be drawn
     */
    private JComponent component;

    /**
     * Create a new SwingGraphic
     * @param component the component that will hold the image
     * @throws NullPointerException if the component is null
     */
    public SwingGraphic(JComponent component){
        this.component = Objects.requireNonNull(component);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(SwingImage image) {
        this.component.add(new JLabel(new ImageIcon(((SwingImage)image).getImage())));
    }
}