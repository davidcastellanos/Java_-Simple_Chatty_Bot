import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numOfShape = scanner.nextInt();
        String sq = "square";
        String cir = "circle";
        String tr = "triangle";
        String rh = "rhombus";
        String choice = "You have chosen a %s";

        switch (numOfShape) {
            case 1:
                System.out.printf(choice, sq);
                break;
            case 2:
                System.out.printf(choice, cir);
                break;
            case 3:
                System.out.printf(choice, tr);
                break;
            case 4:
                System.out.printf(choice, rh);
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}