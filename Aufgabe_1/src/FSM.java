import java.util.HashMap;

class FSM {
  private String startName; // Name of start state
  private HashMap<String,State> states = new HashMap<>();

  FSM(String start) {
    startName = start;
  }

  void addState(State state) {
    State previous = states.put(state.getName(),state);
  }
}
