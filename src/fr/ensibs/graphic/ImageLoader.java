package fr.ensibs.graphic;

import java.io.InputStream;

import fr.ensibs.graphic.Image;


public interface ImageLoader {
	public Image load(InputStream is);
}