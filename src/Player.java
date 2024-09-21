public abstract class Player {
    private String name;
    private int score;
    private int defeats;
    private int draw;
    private int all_mathes;
    private int win_persentage;
    public Player() {}
    public Computer[] setScore(int score) {
        this.score = score;
        return new Computer[0];
    }

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


    public void setName(String name) {
        this.name = name;
    }

    public int getAll_mathes() {
        return all_mathes;
    }

    public void setAll_mathes(int all_mathes) {
        this.all_mathes = all_mathes;
    }

    public int getWin_persentage() {
        return win_persentage;
    }

    public void setWin_persentage(int win_persentage) {
        this.win_persentage = win_persentage;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public Hand getLastHand() {
        return lastHand;
    }

    public void setLastHand(Hand lastHand) {
        this.lastHand = lastHand;
    }


    @Override
    public String toString() {
        int computerWins = all_mathes - score - draw;
        double playerWinPercentage = (double) score / all_mathes * 100;
        double computerWinPercentage = (double) computerWins / all_mathes * 100;

        return String.format(
                "%-20s | %-20s\n" +
                        "--------------------------------------------\n" +
                        "Общее кол-во матчей:  %-10d | Компьютер\n" +
                        "Победы игрока:        %-10d | Победы компьютера: %-10d\n" +
                        "Проигрыши игрока:     %-10d | Ничьи: %-10d\n" +
                        "Процент побед игрока: %-10.2f%% | Процент побед компьютера: %-10.2f%%",
                name, "Компьютер", all_mathes, score, computerWins, defeats, draw, playerWinPercentage, computerWinPercentage
        );
    }



}
