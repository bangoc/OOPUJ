public interface IID {
  int getUserID();

  default int getAdminID() {
    return 1;
  }
}