package com.mock;

public class ResultSet {
  public int ID;
  public String FNAME, LNAME;
  public boolean next() {
    return false;
  }
  public void close() {

  }

  public int getInt(String key) { return 0; }
  public String getString(String key) { return ""; }
}