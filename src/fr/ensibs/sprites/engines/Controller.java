package fr.ensibs.sprites.engines;

import fr.ensibs.graphic.*;
import fr.ensibs.util.fs.*;

/**
 * Controller handle the basic logic of the application
 * @inv graphic != null
 * @inv loader != null
 * @inv fileSystem != null
 */
public class Controller {
	
	/**
	 * Graphics allowing to draw on the device's screen
	 */
	private Graphic graphic;
	
	/**
	 * ImageLoader used to load images
	 */
	private ImageLoader loader;
	
	/**
	 * File System
	 */
	private FileSystem fileSystem;
	
	/**
	 * Construct a new controller from the given arguments
	 * 
	 * @param graphic graphic drawer
	 * @param loader image loader
	 * @param fs file system
	 * @throws NullPointerException if one of the argument is null
	 * @pre graphic != null && loader != null && fs != null
	 */
	public Controller (Graphic graphic, ImageLoader loader, FileSystem fs) {
		if(graphic == null || loader == null || fs == null)
			throw new NullPointerException();
		
		this.graphic = graphic;
		this.loader = loader;
		this.fileSystem = fs;
	}
	
	/**
	 * Display the specified image on the device's screen
	 * @param filename path to the image file that should be displayed
	 */
	public void displayImage (String filename) {
		InputStream is = this.fileSystem.openFile(filename);
		if (is != null) {
			Image img = this.loader.load(is);
			if (img != null) {
				this.graphic.display(img);
			}
		}
	}
}
