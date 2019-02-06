class Vehicle {
  int passengers;
  int fuelcap;
  int kpl;

  int range() {
    return fuelcap * kpl;
  }
}

class VehicleDemo {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();

    int range1, range2;

    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.kpl = 21;

    sportscar.passengers = 2;
    sportscar.fuelcap = 14;
    sportscar.kpl = 12;

    System.out.print("Minivan can carry " + minivan.passengers + ". ");
    System.out.println("Minivan range is " + minivan.range());

    System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
    System.out.println("Sportscar range is " + sportscar.range());
  }
}