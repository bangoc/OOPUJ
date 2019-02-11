class StaticError {
  int denom;
  static int val;

  // Can access a static variable
  static int halfOfVal() {
    return val / 2;
  }

  // Can't access a non-static variable
  static int valDivDenom() {
    return val / denom;
  }
}