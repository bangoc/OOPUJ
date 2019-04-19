import java.util.TreeMap;

class TreeMapDemo {
  public static void main(String args[]) {
    TreeMap<String, String> dict = new TreeMap<>();
    dict.put("student", "Sinh vien");
    dict.put("teacher", "Giao vien");

    if (args.length != 1) {
      System.out.println("Usage: java TreeMapDemo student\nor java TreeMapDemo \"#all\"");
      return;
    }

    if (args[0].equals("#all")) {
      System.out.println("Dictionary contents: ");
      for (java.util.Map.Entry<String, String> entry: dict.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
      }
    } else {
      String meaning = dict.get(args[0]);
      if (meaning == null) {
        System.out.println("The word " + args[0] + " not found!");
      } else {
        System.out.println(meaning);
      }
    }
  }
}