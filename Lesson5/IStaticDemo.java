class IStaticImpl implements IStatic {

}

class IStaticDemo {
  public static void main(String args[]) {
    System.out.println(IStatic.getZeroValue());

    // error: static interface method is not inherited
    // by an implementing class
    // System.out.println(IStaticImpl.getZeroValue());

    // error: static interface method is not inherited
    // by a subinterface
    System.out.println(IExtendedStatic.getZeroValue());
  }
}