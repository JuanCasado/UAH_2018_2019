package antlr;

class Tag {
    public enum State{
        OPTIONAL,
        MANDATORY
    };
    
    private final State state;
    private final String value;
    Tag (State state, String value){
        this.state = state;
        this.value = value;
    }
    
    Tag(String value) {
        this.state = State.MANDATORY;
        this.value = value;
    }
    
    public State getState (){
        return state;
    }
    public String getValue () {
        return value;
    }
}