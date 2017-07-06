package com.crt;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

public class FileLocationFinder {

    public static void main(final String[] args) {
        String rootFolder = args[0];
        String fileName = args[1];

        long start = System.currentTimeMillis();
        File target = searchFileWithFileUtils(new File(rootFolder), fileName);
        System.out.println(target.getAbsolutePath());
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        target = searchFileRecursive(new File(rootFolder), fileName);
        System.out.println(target.getAbsolutePath());
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        target = searchFileFast(rootFolder, fileName);
        System.out.println(target.getAbsolutePath());
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        target = searchFileJava8(rootFolder, fileName);
        System.out.println(target.getAbsolutePath());
        System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms");
    }


    // Solution with FileUtils#listFiles
    //--------------------------------------------

    public static File searchFileWithFileUtils(final File file, final String fileName) {
        File target = null;
        if(file.isDirectory()) {
            Collection<File> files = FileUtils.listFiles(file, null, true);
            for (File currFile : files) {
                if (currFile.isFile() && currFile.getName().equals(fileName)) {
                    target = currFile;
                    break;
                }
            }
        }
        return target;
    }


    // Recursive solution
    //--------------------------------------------

    public static File searchFileRecursive(final File file, final String search) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                File target = searchFileRecursive(f, search);
                if(target != null) {
                    return target;
                }
            }
        } else {
            if (search.equals(file.getName())) {
                return file;
            }
        }
        return null;
    }


    // Fastest solution
    //--------------------------------------------

    public static File searchFileFast(final String directoryName, final String fileName) {
        File target = null;
        if(directoryName != null && fileName != null) {
            File directory = new File(directoryName);
            if(directory.isDirectory()) {
                File file = new File(directoryName, fileName);
                if(file.isFile()) {
                    target = file;
                }
                else {
                    List<File> subDirectories = getSubDirectories(directory);
                    do {
                        List<File> subSubDirectories = new ArrayList<File>();
                        for(File subDirectory : subDirectories) {
                            File fileInSubDirectory = new File(subDirectory, fileName);
                            if(fileInSubDirectory.isFile()) {
                                return fileInSubDirectory;
                            }
                            subSubDirectories.addAll(getSubDirectories(subDirectory));
                        }
                        subDirectories = subSubDirectories;
                    } while(subDirectories != null && ! subDirectories.isEmpty());
                }
            }
        }
        return target;
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


    // Solution with Java 8 Files API
    //--------------------------------------------

    public static File searchFileJava8(final String rootFolder, final String fileName) {
        File target = null;
        Path root = Paths.get(rootFolder);
        try (Stream<Path> stream = Files.find(root, Integer.MAX_VALUE, (path, attr) ->
                path.getFileName().toString().equals(fileName))) {
            Optional<Path> path = stream.findFirst();
            if(path.isPresent()) {
                target = path.get().toFile();
            }
        }
        catch (IOException e) {
        }

        return target;
    }

}
