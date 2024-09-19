public class Computer extends Player{
    Computer(String name){
        super(name);
    }

    @Override
    protected Hand selectHand() {
        return Hand.random();
    }
}
