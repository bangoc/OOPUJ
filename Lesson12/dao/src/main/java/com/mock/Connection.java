package com.mock;

public class Connection implements AutoCloseable {
  public Statement createStatement() {
    return new Statement();
  }
  public PreparedStatement prepareStatement(String query) {
    return new PreparedStatement();
  }

  @Override
  public void close() {

  }
}