package fr.ensibs.swing.fs;

import fr.ensibs.util.fs.FileSystem;

import java.io.*;

/**
 * Implementation of the file system for swing use
 * @author Daphnis Chevreton
 */
public class SwingFileSystem implements FileSystem {

    /**
     * {@inheritDoc}
     */
    @Override
    public InputStream openFile(String path) {

        //Input stream that will be returned if there is no error
        InputStream res = null;

        //Check if path is not null or empty
        if(path != null && path.length() > 0){

            //Create a file from the path and check if the file exists on the disk
            File file = new File(path);
            if(file.exists()){
                try {
                    //If the file exists, we try to open an input stream on the file and we return it
                    res = new BufferedInputStream(new FileInputStream(file));
                } catch (FileNotFoundException e) {
                    System.out.println("Couldn't load file from file system, trying from resources");
                }
            }else{
                //if the file does not exists on the disk, we try looking for it in the resources of the program
                res = getClass().getClassLoader().getResourceAsStream(path);
            }

        }
        return res;
    }
}
