package state;

public class NormalState implements State {
    @Override
    public String getState() {
        return "Stock status: Normal";
    }

    @Override
    public void outgoingStock(StateContext ctx) {

    }

    @Override
    public void incomingStock(StateContext ctx) {

    }
}
