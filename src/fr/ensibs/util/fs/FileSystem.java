package fr.ensibs.util.fs;

import java.io.InputStream;


public interface FileSystem {
	InputStream openFile(String path);
}