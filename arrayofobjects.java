public class arrayofobjects {
   arrayofobjects(int id, String name) {
        this.id = id;
        this.name = name;
    }
    int id;
    String name;
    public static void main(String[] args) {
        arrayofobjects[] arr = new arrayofobjects[3];
        arr[0] = new arrayofobjects(1, "Alice");
        arr[1] = new arrayofobjects(2, "Bob");
        arr[2] = new arrayofobjects(3, "Charlie");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ID: " + arr[i].id + ", Name: " + arr[i].name);
        }
    } 
}
