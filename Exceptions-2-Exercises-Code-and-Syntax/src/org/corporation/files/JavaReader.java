package org.corporation.files;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;

public class JavaReader{

    private String file;

    public JavaReader(String file){
        this.file = file;
    }

    public void readAndPrint() throws IOException {
        Path path = FileSystems.getDefault().getPath(file);
        BufferedReader reader =
                Files.newBufferedReader(path,Charset.forName("UTF-8"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}