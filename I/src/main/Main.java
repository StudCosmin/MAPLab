package main;

public class Main {

    // cd \src\main
    // java Main.java 3 4 5 (sau ce numere doreste sufletu tau)

    // static = nu am nevoie de un obiect de tip Main pentru a apela functia
    public static int average(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; ++i) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(average(numbers));
    }

}
