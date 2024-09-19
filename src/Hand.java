import java.util.Map;
import java.util.Random;
import java.util.Set;

enum Hand{
    ROCK, SCISSORS, PAPER, LIZARD, SPOK;

    private static Map<Hand, Set<Hand>> beatsMap = Map.of(
            ROCK, Set.of(SCISSORS),
            SCISSORS, Set.of(PAPER),
            PAPER, Set.of(ROCK),
            LIZARD, Set.of(SPOK, PAPER),
            SPOK, Set.of(SCISSORS, ROCK)
    );

    private static Random random = new Random();

    boolean beats(Hand other){
        return beatsMap.get(this).contains(other);
    }

    static Hand random(){
        Hand[] options = Hand.values();
        int selected = random.nextInt(options.length);
        return  options[selected];
    }
}