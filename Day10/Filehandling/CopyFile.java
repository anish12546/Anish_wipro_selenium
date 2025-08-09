//Q7
package assignment10;


import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        FileWriter fw = new FileWriter("copy.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
