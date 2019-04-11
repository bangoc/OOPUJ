/*
  Drills: Try different version of read and write and
          compare performance on a large file.
*/
import java.io.*;

class CopyFileTWR {
  public static void main(String args[]) throws IOException {
    int n;
    if (args.length != 2) {
      System.out.println("Usage: CopyFile from to");
      return;
    }

    // Copy a File
    try (FileInputStream fin = new FileInputStream(args[0]);
         FileOutputStream fout = new FileOutputStream(args[1])) {
      byte buffer[] = new byte[1024];
      do {
        n = fin.read(buffer);
        if (n != -1)
          fout.write(buffer, 0, n);
      } while (n != -1);
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}