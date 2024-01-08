package Week11.Monday;

public class StringBuilderTasks {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello ");
//        sb.append("world");
//        sb.append("!");
//
//        System.out.println(sb.toString());
//        sb.reverse();
//        System.out.println(sb.toString());
//        String word = "hello";
//        char charToRemove = 'l';
//        StringBuilder removedString = new StringBuilder();
//        for (char c:word.toCharArray()) {
//            if (c != charToRemove){
//                removedString.append(c);
//            }
//        }
//        System.out.println(removedString.toString());

        String original = "Hello!";
        StringBuilder sb1 = new StringBuilder(original);
        String toInsert = ", Beautiful";
        int index = 5;
        sb1.insert(index,toInsert);
        System.out.println(sb1.toString());
        String toReplace = "handsome";

        int start = 7;
        int end = "Beautiful".length()+start;
        sb1.replace(start,end,toReplace);
        System.out.println(sb1.toString());

    }
}
