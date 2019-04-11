/*
  Drills: Try different version of read and write and
          compare performance on a large file.
*/
import java.io.*;

class CopyFile {
  public static void main(String args[]) throws IOException {
    int n;
    FileInputStream fin = null;
    FileOutputStream fout = null;
    if (args.length != 2) {
      System.out.println("Usage: CopyFile from to");
      return;
    }

    // Copy a File
    try {
      fin = new FileInputStream(args[0]);
      fout = new FileOutputStream(args[1]);
      byte buffer[] = new byte[1024];
      do {
        n = fin.read(buffer);
        if (n != -1)
          fout.write(buffer, 0, n);
      } while (n != -1);
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    } finally {
      try {
        if (fin != null)
          fin.close();
      } catch (IOException exc) {
        System.out.println("Error Closing Input File");
      }
      try {
        if (fout != null)
          fout.close();
      } catch (IOException exc) {
        System.out.println("Error Closing Output File");
      }
    }
  }
}