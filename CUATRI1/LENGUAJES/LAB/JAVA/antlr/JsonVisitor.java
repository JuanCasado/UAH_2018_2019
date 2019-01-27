package antlr;

public class JsonVisitor extends JsonParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor grafo;
    public JsonVisitor() {
        contenedor = new HashContenedor("json");
    }
    
    @Override
    public HashContenedor visitInit(JsonParser.InitContext ctx) {
        visit(ctx.graphs());
        return contenedor;
    }

    @Override
    public HashContenedor visitGraphs(JsonParser.GraphsContext ctx) {
        for (JsonParser.ListaContext lista : ctx.lista()){
            visit(lista);
        }
        return null;
    }
    
    @Override
    public HashContenedor visitLista(JsonParser.ListaContext ctx) {
        grafo = new HashContenedor("grafo");
        System.out.println("LISTA");
        contenedor.addNode(grafo);
        return null;
    }
}