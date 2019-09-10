package fr.ensibs.sprites.engines;

/**
 * Controller handle the basic logic of the application
 * @inv graphic != null
 */
public class Controller {
	
	/**
	 * Graphics allowing to draw on the device's screen
	 */
	private Graphic graphic;
	
	/**
	 * ImageLoader used to load images
	 * @inv
	 */
	private ImageLoader loader;
	
	/**
	 * 
	 */
	private FileSystem fileSystem;
	
	/**
	 *
	 * 
	 * @param graphic 
	 * @param loader
	 * @param fs
	 */
	public Controller (Graphic graphic, ImageLoader loader, FileSystem fs) {
		this.graphic = graphic;
		this.loader = loader;
		this.fileSystem = fs;
	}
	
	/**
	 * 
	 * @param filename
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
