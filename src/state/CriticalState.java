package state;

public class CriticalState implements State{
    //quantity is low, can't be sold


    @Override
    public String getState() {
        return "Stock status: Critical, extra productie dringend aangevraagd";
    }

    @Override
    public void incomingStock(StateContext ctx) {

    }

    @Override
    public void outgoingStock(StateContext ctx) {

    }
}
