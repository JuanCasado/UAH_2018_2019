package antlr;

abstract class Contenedor {
    private final String id;
    public enum Node {
        FINAL, CONTAINER
    };
    final private Node type;
    Contenedor (Node type, String id){
        this.type = type;
        this.id = id;
    }
    public Node getType(){
        return type;
    }
    public String getId() {
        return id;
    }
}