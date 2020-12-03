package state;

public class HighState implements State{
    @Override
    public String getState() {
       return "Stock status: High";
    }

    @Override
    public void incomingStock(StateContext ctx) {

    }

    @Override
    public void outgoingStock(StateContext ctx) {

    }
}
