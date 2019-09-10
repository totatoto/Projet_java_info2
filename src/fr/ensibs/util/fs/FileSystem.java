package fr.ensibs.util.fs;

import java.io.InputStream;

/**
 * Representation of the device file system
 */
public interface FileSystem {
	
	/**
	 * Open a file from a path into an InputStream
	 * @param path The path of the file to open
	 * @return The InputStream generated from the filepaths
	 * @pre path != null && path.length > 0
	 */
	InputStream openFile(String path);
}