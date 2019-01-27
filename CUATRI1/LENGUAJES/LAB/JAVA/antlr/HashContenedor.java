package antlr;

import java.util.*;

class HashContenedor extends Contenedor {
    private final HashMap<String,ArrayList<Contenedor>> content;

    public HashContenedor (String id) {
        super(Node.CONTAINER, id);
        this.content = new HashMap<>();
    }
    public ArrayList<String> validateContentent(ArrayList<Tag> data){
        ArrayList <String> result = new ArrayList<>();
        for (Tag asked : data){
            if (asked.getState()==Tag.State.MANDATORY){
                if (!content.containsKey(asked.getValue())){
                    return null;
                }
                result.add(asked.getValue());
            }else if (asked.getState() == Tag.State.OPTIONAL){
                if (!content.containsKey(asked.getValue())) {
                    result.add(null);
                }else{
                    result.add(asked.getValue());
                }
            }
        }
        boolean scape = true;
        for (String key:content.keySet()){
            scape = true;
            for (Tag tag : data){
                if (tag.getValue()==key){
                scape = false;
                }
            }
            if (scape){
                return null;
            }
        }
        return  result;
    }

    public String getValueOf(String id){
        if (content.containsKey(id)){
            String token = "";
            for (Contenedor maybeToken:content.get(id)){
                if (maybeToken.getType() == Contenedor.Node.FINAL) {
                    token+= ((DatoContenedor)maybeToken).getValue();
                }else{
                    return null;
                }
            }
            return token;
        }
        return null;
    }
    public ArrayList<HashContenedor> getNodeOf (String id){
        if (content.containsKey(id)) {
            ArrayList<HashContenedor> node = new ArrayList<>();
            for (Contenedor maybeNode : content.get(id)) {
                if (maybeNode.getType() == Contenedor.Node.CONTAINER) {
                    node.add((HashContenedor) maybeNode);
                } else {
                    return null;
                }
            }
            return node;
        }
        return null;
    }
    
    public void addNode(HashContenedor content) {
        if (!this.content.containsKey(content.getId())) {
            this.content.put(content.getId(), new ArrayList<>());
        }
        this.content.get(content.getId()).add(content);
    }
    
    public void addFinal(String id, String content) {
        if (!this.content.containsKey(id)){
            this.content.put(id, new ArrayList<>());
        }
        this.content.get(id).add(new DatoContenedor(id,content));
    }
}