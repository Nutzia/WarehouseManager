package state;

public class StateContext {
    private State criticalState;
    private State highState;
    private State lowState;
    private State normalState;

    private State state;

    public StateContext(){
        criticalState = new CriticalState();
        highState = new HighState();
        lowState = new LowState();
        normalState = new NormalState();
        state = null;

    }

    public void incomingStock() {
        state.incomingStock(this);
    }

    public void outgoingStock() {
        state.outgoingStock(this);
    }

    public String getState() {
        return state.getState();
    }

    public State getCriticalState() {
        return criticalState;
    }

    public State getHighState() {
        return highState;
    }

    public State getLowState() {
        return lowState;
    }

    public State getNormalState() {
        return normalState;
    }
}
