import java.io.*;
import java.util.*;

public class Main {
    
    public static int recursion(File root, String search) throws IOException {
        // BEGIN SOLUTION
        int count = 0;
        if (root.getName().contains(search)) count++;
        if (root.isFile()) return count;
        for (File fileOrFolder : root.listFiles()) {
            count += recursion(fileOrFolder, search);
        }
        return count;
        // END SOLUTION
        // STUB: System.out.println(root.getName());
        // STUB: System.out.println(root.isDirectory() ? " is directory " : " is file");
        // STUB: return 0;
    }
    
    public static int count(String search) throws IOException {
        File rootFolder = new File(System.getProperty("user.dir"));
        return recursion(rootFolder, search);
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println(count("project"));
    }    
}
