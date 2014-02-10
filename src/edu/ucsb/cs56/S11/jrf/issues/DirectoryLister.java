package edu.ucsb.cs56.S11.jrf.issues;
import java.io.File;
import java.util.ArrayList;

    /**
     *Front end for some java directory manipulation
     *
     *@author Jasper Fredrickson
     *@version Mantis Ticket 0000231 for cs56, Spring 2011
     */

public class DirectoryLister {
    private String path;

    /**
     *Constructor taking a path name string as its param
     */
    public DirectoryLister(String path) {
        this.path = path;
    }

    /**
     * Method for returning the number of files in the given path
     */
    public int getNumFiles(){
        File folder = new File(this.path);
        File[] list = folder.listFiles();
        return list.length;
    }

    /**
     * Method for getting a list of the file names in the directory
     * Note: may be sorted by length of file names, short to long,  but not sure
     */
    public ArrayList<String> getFilenames(){
        File folder = new File(this.path);
        String[] list = folder.list();
        ArrayList<String> filenames = new ArrayList<String>();
        int i;
        for (i = 0; i < list.length; i++){
            filenames.add(list[i]);
        }
        return filenames;
    }

    /**
     * Method for getting a list of filenames with the
     * path name appended to them. Possibly sorted by file name length,
     * short to long?
     */
    public ArrayList<String> getFullFilenames(){
        File folder = new File(this.path);
        String[] list = folder.list();
        ArrayList<String> fullFilenames = new ArrayList<String>();
        int i;
        for (i = 0; i < list.length; i++){
            fullFilenames.add(path+"/" +list[i]);
        }
        return fullFilenames;
    }
}