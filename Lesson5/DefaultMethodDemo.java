class UserImpl implements IID {
  public int getUserID() {
    return 100;
  }

  // It is not required to override a default interface method
}

class AdminImpl implements IID {
  public int getUserID() {
    return 99;
  }

  // It is possible to override a default interface method
  public int getAdminID() {
    return 110;
  }
}

class DefaultMethodDemo {
  public static void main(String args[]) {
    UserImpl user = new UserImpl();
    AdminImpl admin = new AdminImpl();
    System.out.println(user.getUserID() + " " + user.getAdminID());
    System.out.println(admin.getAdminID() + " " + admin.getAdminID());
  }
}