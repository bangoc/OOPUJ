package com.mock;

public class DataSource {
  public Connection getConnection() {
    return new Connection();
  }
}