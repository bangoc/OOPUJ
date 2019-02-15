/*
  Add a parameterized metod that computes the fuel
  required for a given distance
*/

class Vehicle {
  int passengers;
  int fuelcap;
  int kpl;
  int range() {
    return kpl * fuelcap;
  }
  double fuelneeded(int miles) {
    return (double) miles / kpl;
  }
}

class CompFuel {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle();
    Vehicle sportcars = new Vehicle();
    double litres;
    int dist = 252;

    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.kpl = 21;

    sportcars.passengers = 2;
    sportcars.fuelcap = 14;
    sportcars.kpl = 12;

    litres = minivan.fuelneeded(dist);
    System.out.println("To go " + dist + " km minivan needs " +
                        litres + " litres of fuel.");

    litres = sportcars.fuelneeded(dist);
    System.out.println("To go " + dist + " km sportcars needs " +
                        litres + " litres of fuel.");
  }
}