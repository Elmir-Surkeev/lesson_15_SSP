abstract class Player {
    final String name;
    int score = 0;
    Hand lastHand = null;

    Player(String name){
        this.name = name;
    }

    void reset(){
        score = 0;
        lastHand = null;
    }

    Hand drawHand(){
        lastHand = selectHand();
        return lastHand;
    }

    protected abstract Hand selectHand();
}
