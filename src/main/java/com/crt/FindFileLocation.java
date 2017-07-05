package com.crt;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFileLocation {

    public static void main(final String[] args) {
        long start = System.currentTimeMillis();
        String location = locateRecursive(args[0], args[1]);
        System.out.println(location);
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        location = locate(args[0], args[1]);
        System.out.println(location);
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        location = searchFile(new File(args[0]), args[1]);
        System.out.println(location);
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");
    }

    
    // Algo 1 (récursif)
    //-----------------------------------------------
    
    public static String locateRecursive(final String directoryName, final String fileName) {
        String location = null;
        if(directoryName != null && fileName != null) {
            File directory = new File(directoryName);
            if(directory.isDirectory()) {
                File file = new File(directoryName, fileName);
                if(file.isFile()) {
                    location = file.getAbsolutePath();
                }
                else {
                    List<File> subDirectories = getSubDirectories(directory);
                    for(File subDirectory : subDirectories) {
                        location = locateRecursive(subDirectory.getAbsolutePath(), fileName);
                        if(location != null) {
                            return location;
                        }
                    }
                }
            }
        }
        return location;
    }

    
    // Algo 1 bis (récursif) - même algo mais avec code plus simple
    //-----------------------------------------------
    
    public static String searchFile(final File file, final String search) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                String path = searchFile(f, search);
                if(path != null) {
                    return path;
                }
            }
        } else {
            if (search.equals(file.getName())) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }
    
    
    // Algo 2 optimisé - un fichier a peu de chance de se trouver tout en bas dans l'arborescence
    // Il est ainsi plus judicieux d'explorer l'arborescence par niveau (profondeur) et non de façon récursive
    //-----------------------------------------------

    public static String locate(final String directoryName, final String fileName) {
        String location = null;
        if(directoryName != null && fileName != null) {
            File directory = new File(directoryName);
            if(directory.isDirectory()) {
                File file = new File(directoryName, fileName);
                if(file.isFile()) {
                    location = file.getAbsolutePath();
                }
                else {
                    List<File> subDirectories = getSubDirectories(directory);

                    do {
                        List<File> subSubDirectories = new ArrayList<File>();
                        for(File subDirectory : subDirectories) {
                            File fileInSubDirectory = new File(subDirectory, fileName);
                            if(fileInSubDirectory.isFile()) {
                                return fileInSubDirectory.getAbsolutePath();
                            }
                            subSubDirectories.addAll(getSubDirectories(subDirectory));
                        }
                        subDirectories = subSubDirectories;
                    } while(subDirectories != null && ! subDirectories.isEmpty());
                }
            }
        }
        return location;
    }

    private static List<File> getSubDirectories(final File directory) {
        File[] subDirectories = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(final File current, final String name) {
                return new File(current, name).isDirectory();
            }
        });
        return Arrays.asList(subDirectories);
    }

}
