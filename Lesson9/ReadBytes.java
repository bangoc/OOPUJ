// Read an array of bytes from the keyboard

/*
  Drill tasks: change the size of the data array
               and vary the input length.
*/

import java.io.*;
class ReadBytes {
  public static void main(String args[])
      throws IOException {
        byte data[] = new byte[20];

        System.out.println("Enter some characters.");
        int n = System.in.read(data);
        System.out.print("You entered " + n + " bytes: ");
        for (int i = 0; i < n; ++i)
          System.out.print((char)data[i]);
        System.out.println();
      }
}