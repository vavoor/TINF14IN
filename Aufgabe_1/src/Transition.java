class Transition {
	private String event;
	private String target;

	public Transition(String event, String target) {
		this.event = event;
		this.target = target;
	}

	public String getEvent() {
		return event;
	}
}
