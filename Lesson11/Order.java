

class Order {
  int id;
}

class Cd {
  int id;
}

class OrderItem {
  int order_id;
  int cd_id;
  int quantity;
}

class MktInfo {
  int cd_id;
  Review review;
  ArtistInfo info;
  SampleClip sample;
}
class Review {
}
class ArtistInfo {
}
class SampleClip {
}