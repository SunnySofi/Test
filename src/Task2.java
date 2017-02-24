public class Task2 {
    public static void main(String[] args) {
        /*
        List<String> list = Arrays.asList(args);
        Collections.reverse(list);
        System.out.println(list);
        */
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("mass[" + i + "] = " + args[i]);
        }
    }
}
