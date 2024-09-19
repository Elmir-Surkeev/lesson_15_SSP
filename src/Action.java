import java.util.*;


public class Action {
    static Hand fromInt(int choice) {
        switch (choice) {
            case 1: return Hand.ROCK;
            case 2: return Hand.SCISSORS;
            case 3: return Hand.PAPER;
            case 4: return Hand.LIZARD;
            case 5: return Hand.SPOK;
            default: throw new IllegalArgumentException("Неверный выбор: " + choice);
        }
    }
//    static void selectHands(Player[] players){
//        players[0].drawHand();
//        players[1].drawHand();
//    }
//
//    //метод, который определяет победителя
//    static Player evaluteRaond(Player[] players){
//        Hand first = players[0].lastHand;
//        Hand second = players[1].lastHand;
//        if (first == second){
//            return null;
//        }
//        if (first.beats(second)){
//            return players[0];
//        }
//        else {
//            return players[1];
//        }
//    }
//
//    static void showSelectedHands(Player[] players){
//        for (Player player: players){
//            System.out.printf("%s, drawed \n", player.name, player.lastHand);
//        }
//    }
//
//    static void play(int maxScore, Player one, Player two){
//        int round = 0;
//    }
//    static void showWinner(Player winner){
//        if (winner == null){
//            System.out.println("Ничья");
//        }
//        else{
//            System.out.printf("%s wins round" , winner.name);
//            winner.score ++;
//
//        }
//    }
////    static void printScore(Player[] players){
////        System.out.printf("Score: %s, %d : %s %d", players[0].name,
////                players[0].score,
////                players[0].name,
////                players[1].score,
////                players[1].name
////                );
////    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите: \n1 - ROCK\n2 - SCISSORS\n3 - PAPER\n4 - LIZARD\n5 - SPOK");

        int choice = scanner.nextInt();
        try {
            Hand userHand = fromInt(choice);
            Hand computerHand = Hand.random();

            if (userHand.beats(computerHand)){
                System.out.printf("%s победил %s ", userHand.name(), computerHand.name());
                System.out.println("\n Вы победили компьютер");
            }else if(computerHand.beats(userHand)){
                System.out.printf("%s победил %s ", computerHand.name(), userHand.name());
                System.out.println("\n Компьютер победил вас");
            }else {
                System.out.printf("%s ничья %s ", computerHand.name(), userHand.name());
                System.out.println("\n Ничья");
            }
        }catch (IllegalArgumentException e){
            e.getMessage();
        }
//        Player left = new Computer("Elmirbek");
//        Player right = new Computer("Computer");
//
//        Player[] players = new Player[] {left, right};
//        selectHands(players);
//        showSelectedHands(players);
//        Player winner = evaluteRaond(players);
//        System.out.println(winner.name);
//        showWinner(winner);
//        //printScore(players);


//
//        System.out.println(left.drawHand());
//        System.out.println(right.drawHand());
//        System.out.println(left.lastHand.beats(right.lastHand));




        //System.out.printf("%s %s %b", first, second, first.beats(second));


        //System.out.println(Hand.ROCK.beats(Hand.PAPER));
//        System.out.println("Выберите режим игры 0=SPP и 1 = SPPlP");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        if (choice == 0){
//            StartProgrammSPP start = new StartProgrammSPP();
//            start.main();
//        } else if (choice == 1) {
//            StartProgrammSPPLP start = new StartProgrammSPPLP();
//            start.main();
//        }
    }

}
