package fr.ensibs.util.fs;

import java.io.InputStream;

/**
 * Representation of the device file system
 */
public interface FileSystem {
	
	/**
	 * Open a file from a path into an InputStream, if the file cannot be found in the file system, it will check for
	 * a file in the resources bundle in the jar. If nothing can be found, null is returned
	 * @param path The path of the file to open
	 * @return The InputStream generated from the filepath or null if no file is found
	 * @pre path != null && path.length() > 0
	 */
	InputStream openFile(String path);
}
