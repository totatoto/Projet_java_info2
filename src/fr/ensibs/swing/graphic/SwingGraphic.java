package fr.ensibs.swing.graphic;

import fr.ensibs.graphic.Graphic;
import fr.ensibs.graphic.Image;

import javax.swing.*;
import java.util.Objects;

public class SwingGraphic implements Graphic {

    private JComponent component;

    public SwingGraphic(JComponent component){
        this.component = Objects.requireNonNull(component);
    }

    @Override
    public void display(Image image) {

    }
}
