import java.util.HashMap;

class State {
  private String name;
  private String action;
  private HashMap<String,Transition> transitions = new HashMap<>();

  State(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addAction(String action) {
    this.action = action;
  }

  public void addTransition(Transition transition) {
  	  Transition previous = transitions.put(transition.getEvent(),transition);
  	  // error if previous != null
  }
}
