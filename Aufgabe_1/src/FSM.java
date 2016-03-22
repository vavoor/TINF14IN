import java.util.HashMap;

class FSM {
  private String startName; // Name of start state
  private HashMap<String,State> states = new HashMap<>();

  public FSM(String start) {
    startName = start;
  }

  public void addState(State state) {
    State previous = states.put(state.getName(),state);
    // error if previous != null
  }
}
