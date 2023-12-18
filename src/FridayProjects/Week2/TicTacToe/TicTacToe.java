package FridayProjects.Week2.TicTacToe;

public class TicTacToe {
    public static void drawTable(char[][] board){
        System.out.println(" --1---2---3--");
        System.out.println("1| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
        System.out.println(" -------------");
        System.out.println("2| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
        System.out.println(" -------------");
        System.out.println("3| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" *");
        System.out.println(" -------------");
    }
    public static void main(String[] args) {
        char[][] ticTacToe = new char[3][3];
        System.out.println(" --1---2---3--");
        System.out.println("1| X | O | X |");
        System.out.println(" -------------");
        System.out.println("2| X | O | X |");
        System.out.println(" -------------");
        System.out.println("3| X | O * X *");
        System.out.println(" -------------");
    }
}
