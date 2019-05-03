package com.mock;

public class PreparedStatement implements AutoCloseable{
  public ResultSet executeQuery() {
    return new ResultSet();
  }

  public int executeUpdate() {
    return 0;
  }

  public void setInt(int pos, int value) {}

  public void setString(int pos, String value) {}

  public void execute() {}

  @Override
  public void close() {

  }
}