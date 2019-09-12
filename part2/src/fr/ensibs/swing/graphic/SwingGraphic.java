package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComponent;
import java.awt.Graphics;
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
	 * ImageDisplay to make possible to draw the image
	 */
    private ImageDisplay display;

    /**
     * Create a new SwingGraphic
     * @param component the component that will hold the image
     * @throws NullPointerException if the component is null
     */
    public SwingGraphic(JComponent component){
        this.component = Objects.requireNonNull(component);
        display = new ImageDisplay();
        this.component.add(display);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void display(SwingImage image) {
        display.setPreferredSize(image.getDimension());
        display.current = image;
        display.repaint();
    }
	
	/**
	 * Make possible to draw the image
	 */
	private static class ImageDisplay extends JComponent {

		/**
		 * The SwingImage to display on
		 */
        private SwingImage current;

		/**
		 * {@inheritDoc}
		 */
        @Override
        public void paintComponent(Graphics g) {
            if (current != null)
                g.drawImage(current.getImage(), 0, 0, current.getWidth(), current.getHeight(), null);
        }
    }
}
