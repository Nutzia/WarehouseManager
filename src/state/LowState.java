package state;

public class LowState implements State {
    @Override
    public String getState() {
        return "Stock status: Low, extra levering werd aangevraagd";
    }

    @Override
    public void incomingStock(StateContext ctx) {

    }

    @Override
    public void outgoingStock(StateContext ctx) {

    }
}
