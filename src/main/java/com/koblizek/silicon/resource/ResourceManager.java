package com.koblizek.silicon.resource;

import com.koblizek.silicon.util.ResourceLocationException;

import java.io.File;
import java.util.Arrays;

public final class ResourceManager {
    private final File directoryIn;

    public ResourceManager(File directoryIn) {
        if (!directoryIn.isDirectory()) throw new ResourceLocationException("Invalid path");
        this.directoryIn = directoryIn;
    }
    public File getDirectoryIn() {
        return directoryIn;
    }
    public File[] getFiles() {
        return directoryIn.listFiles();
    }
    public Resource[] getResources() {
        return Arrays.stream(getFiles())
                .map(Resource::new).toArray(Resource[]::new);
    }
    public Resource getResource(String name) {
        return Arrays.stream(getResources())
                .filter(r -> r.getName().equals(name)).findFirst().orElse(null);
    }
}
