package fr.ensibs.swing.fs;

import fr.ensibs.util.fs.FileSystem;

import java.io.*;

public class SwingFileSystem implements FileSystem {

    @Override
    public InputStream openFile(String path) {
        InputStream res = null;
        if(path != null && path.length() > 0){
            File file = new File(path);
            if(file.exists()){
                try {
                    res = new BufferedInputStream(new FileInputStream(file));
                } catch (FileNotFoundException ignored) {
                }
            }else{
                res = getClass().getClassLoader().getResourceAsStream(path);
            }

        }
        return res;
    }
}
