public class Main {
    public static void main(String[] args) {
        for (int i : new Randoms(10, 40)) {
            System.out.println(i);
            if (i == 20) {
                System.out.println("хорош");
                break;
            }
        }
    }
}
