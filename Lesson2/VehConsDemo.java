class Vehicle {
  int passengers;
  int fuelcap;
  int kpl;
  Vehicle(int p, int f, int k) {
    passengers = p;
    fuelcap = f;
    kpl = k;
  }
  int range() {
    return kpl * fuelcap;
  }
  double fuelneeded(int km) {
    return (double)km/kpl;
  }
}

class VehConsDemo {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle(7, 16, 21);
    Vehicle sportscar = new Vehicle(2, 14, 12);

    double litres;
    int dist = 252;
    litres = minivan.fuelneeded(dist);
    System.out.println("To go " + dist + " km minivan needs " +
                       litres + " litres of fuel.");
    litres = sportscar.fuelneeded(dist);
    System.out.println("To go " + dist + " km sportscar needs " +
                       litres + " litres of fuel.");
  }
}