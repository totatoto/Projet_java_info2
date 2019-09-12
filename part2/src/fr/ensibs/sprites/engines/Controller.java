package fr.ensibs.sprites.engines;

import java.io.InputStream;

import fr.ensibs.graphic.Image;
import fr.ensibs.graphic.ImageLoader;
import fr.ensibs.graphic.Graphic;
import fr.ensibs.util.fs.FileSystem;

/**
 * Controller handle the basic logic of the application
 * @inv graphic != null
 * @inv loader != null
 * @inv fileSystem != null
 */
public class Controller<ImageType extends Image> {
	
	/**
	 * Graphics allowing to draw on the device's screen
	 */
	private Graphic<ImageType> graphic;
	
	/**
	 * ImageLoader used to load images
	 */
	private ImageLoader<ImageType> loader;
	
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
	public Controller (Graphic<ImageType> graphic, ImageLoader<ImageType> loader, FileSystem fs) {
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
			ImageType img = this.loader.load(filename, is);
			if (img != null) {
				this.graphic.display(img);
			}
		}
	}
}
