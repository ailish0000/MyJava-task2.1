public class Main {
    public static void main(String[] args) {

        int ticketPrice =29_875;
        int rubMile = 20;
        int bonusMile = ticketPrice / rubMile;

        System.out.println("Если стоимость билета: " + ticketPrice + " рублей, то");
        System.out.println("Количество бонусных миль: " + bonusMile);

    }
}