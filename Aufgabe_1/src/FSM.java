import java.util.HashMap;
import java.io.PrintStream;

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

  public void check() throws IllegalInputException {
  	  if (!states.containsKey(startName)) {
  	  	  throw new IllegalInputException("Start state "+startName+" is not defined");
  	  }
  }

  public void generateInterface() {
  	  PrintStream out = System.out;

  	  out.println("interface FSMActions {");
  	  for (State st : states.values()) {
  	  	  st.generateInterface(out);
  	  }
  	  out.println("}");
  }

  public void generateClass() {

  }
}
