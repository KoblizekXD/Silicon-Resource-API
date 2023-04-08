package com.koblizek.silicon.resource;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Resource {
    private final File file;

    protected Resource(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public FileInputStream toInputStream() throws FileNotFoundException {
        return new FileInputStream(file);
    }
    public boolean endsWith(String extension) {
        return file.getName().endsWith(extension);
    }
    public Document asDocument(DocumentBuilder builder) throws IOException, SAXException {
        return builder.parse(file);
    }
    public String getName() {
        return file.getName();
    }
}
