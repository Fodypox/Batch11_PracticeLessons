package Week11.Monday;

public class TasksforSB {
    public static void main(String[] args) {
        /**
         * we have String Hello world, and we need to add beautiful between them;
         * */
        String original = "Hello world";
        String toInsert = " beautiful";

        StringBuilder sb = new StringBuilder(original);

        int index = 5;
        sb.insert(index,toInsert);
        System.out.println(sb.toString());
    }
}
