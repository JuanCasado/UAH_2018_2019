package antlr;

import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class CsvVisitor extends CsvParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;
    private HashContenedor row;

    public CsvVisitor() {
        contenedor = new HashContenedor("csv");
    }

    @Override
    public HashContenedor visitInit(CsvParser.InitContext ctx) {
        for (CsvParser.RowContext row : ctx.row()) {
            visit(row);
        }
        return contenedor;
    }

    @Override
    public HashContenedor visitNombre(CsvParser.NombreContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        row.addFinal("nombre", token);
        return null;
    }

    @Override
    public HashContenedor visitRutafichero(CsvParser.RutaficheroContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.json_file().getText();
        row.addFinal("fichero", token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherosalida(CsvParser.RutaficherosalidaContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.dot_file().getText();
        row.addFinal("dot", token);
        return null;
    }

    @Override
    public HashContenedor visitRutaficherografico(CsvParser.RutaficherograficoContext ctx) {
        String token = "";
        token += ctx.dir().getText();
        token += ctx.svg_file().getText();
        row.addFinal("grafico", token);
        return null;
    }

    @Override
    public HashContenedor visitRow(CsvParser.RowContext ctx) {
        row = new HashContenedor("row");

        visit(ctx.nombre());
        visit(ctx.rutafichero()); 
        visit(ctx.rutaficherosalida()); 
        visit(ctx.rutaficherografico()); 

        contenedor.addNode(row);
        return null;
    }
}