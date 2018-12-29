import antlr.*;
import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.*;

class main {
    public static void main(String[] args) throws Exception {
        /* A ENTREGAR CON:
         * EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream( new
         * EntradaLexer(args.length > 0 ? new ANTLRInputStream(args[0]) : new
         * ANTLRInputStream(System.in))));
         */

        System.out.println("PRUEBAS DE ENTRADA:");
        EntradaParser parserEntrada = new EntradaParser(new CommonTokenStream(new EntradaLexer(new ANTLRInputStream(new FileInputStream("./../Documentos/pruebas.prog")))));
        parserEntrada.setBuildParseTree(true);
        HashContenedor entradaTable = new EntradaVisitor().visit(parserEntrada.init());
        
        ArrayList<Tag> toGetEntrada = new ArrayList<>();
        toGetEntrada.add(new Tag(Tag.State.MANDATORY, "id1"));
        toGetEntrada.add(new Tag(Tag.State.OPTIONAL, "id2"));
        toGetEntrada.add(new Tag(Tag.State.OPTIONAL, "hash2"));
        if (entradaTable.validateContentent(toGetEntrada) != null) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.println("PRUEBAS DE CSV:");
        CsvParser parserCsv = new CsvParser(new CommonTokenStream(new CsvLexer(new ANTLRInputStream(new FileInputStream("./../Documentos/ficheros_a_procesar.csv"))))); 
        parserCsv.setBuildParseTree(true);
        HashContenedor csvTable = new CsvVisitor().visit(parserCsv.init());
        

        System.out.println(csvTable.getNodeOf("row").get(0).getValueOf("nombre"));
        System.out.println(csvTable.getNodeOf("row").get(1).getValueOf("nombre"));
        ArrayList<Tag> toGetCsv = new ArrayList<>();
        toGetCsv.add(new Tag("row"));

        if (csvTable.validateContentent(toGetCsv) != null) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }

        System.out.println("PRUEBAS DE JSON:");
        JsonParser parserJson = new JsonParser(new CommonTokenStream(new JsonLexer(new ANTLRInputStream(new FileInputStream("./../Documentos/nschema-RelacionFamiliar.json")))));
        parserJson.setBuildParseTree(true);
        HashContenedor jsonTable = new JsonVisitor().visit(parserJson.init());

        ArrayList<Tag> toGetJson = new ArrayList<>();
        toGetJson.add(new Tag(Tag.State.MANDATORY, "grafo"));
        if (jsonTable.validateContentent(toGetJson) != null) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}