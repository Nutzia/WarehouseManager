package state;

public interface State {
    //Different states expected
    //Critical, Low, Normal, High

    public void incomingStock(StateContext ctx);
    public void outgoingStock(StateContext ctx);
    public String getState();
}
