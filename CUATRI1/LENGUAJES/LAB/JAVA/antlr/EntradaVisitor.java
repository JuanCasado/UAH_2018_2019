package antlr;

import java.util.*;

public class EntradaVisitor extends EntradaParserBaseVisitor<HashContenedor> {
    private HashContenedor contenedor;

    public EntradaVisitor() {
        contenedor = new HashContenedor("entrada");
        HashContenedor hash2 = new HashContenedor("hash2");
        contenedor.addFinal("id1", "cont1");
        contenedor.addFinal("id1", "cont2");
        contenedor.addNode(hash2);
        hash2.addFinal("id3", "cont3");
        hash2.addFinal("id4", "cont4");
        hash2.addFinal("id5", "cont5");
    }

    @Override
    public HashContenedor visitInit(EntradaParser.InitContext ctx) {
        for (EntradaParser.Tipo_archivoContext tipoArchivo : ctx.tipo_archivo()) {
            // System.out.println("tipoArchivo nuevo");
            visitChildren(tipoArchivo);
        }
        for (EntradaParser.ParametrosContext parametros : ctx.parametros()) {
            System.out.println("parametro nuevo");
        }
        return contenedor;
    }

    @Override
    public HashContenedor visitWsci(EntradaParser.WsciContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitWhite_space(EntradaParser.White_spaceContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitIntro(EntradaParser.IntroContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitTipo_archivo(EntradaParser.Tipo_archivoContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitParametros(EntradaParser.ParametrosContext ctx) {
        return null;
    }

    // PARA LA RUTA DE UN ARCHIVO
    @Override
    public HashContenedor visitRutafichero(EntradaParser.RutaficheroContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitDoblepunto(EntradaParser.DoblepuntoContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitPunto(EntradaParser.PuntoContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitLetra(EntradaParser.LetraContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitDos_ptos(EntradaParser.Dos_ptosContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitVariable(EntradaParser.VariableContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitBarra(EntradaParser.BarraContext ctx) {
        return null;
    }

    // PARA EL JSON
    @Override
    public HashContenedor visitJson(EntradaParser.JsonContext ctx) {
        System.out.println("JSON");
        EntradaParser.JsonContext json = ctx;
        visitChildren(json);
        return null;
    }

    @Override
    public HashContenedor visitExtension_json(EntradaParser.Extension_jsonContext ctx) {
        System.out.println("EXTENSION_JSON");
        return null;
    }

    // PARA EL SVG
    @Override
    public HashContenedor visitSvg(EntradaParser.SvgContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitExtension_svg(EntradaParser.Extension_svgContext ctx) {
        return null;
    }

    // PARA EL DOT
    @Override
    public HashContenedor visitDot(EntradaParser.DotContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitExtension_dot(EntradaParser.Extension_dotContext ctx) {
        return null;
    }

    // PARA EL CSV
    @Override
    public HashContenedor visitCsv(EntradaParser.CsvContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitExtension_csv(EntradaParser.Extension_csvContext ctx) {
        return null;
    }

    // ---------------PARAMETROS----------------
    @Override
    public HashContenedor visitKw_edge(EntradaParser.Kw_edgeContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitKw_node(EntradaParser.Kw_nodeContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitNumero(EntradaParser.NumeroContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitCadena(EntradaParser.CadenaContext ctx) {
        return null;
    }

    @Override // NO NOS INTERESAN LAS COMILLAS
    public HashContenedor visitTexto_cadena(EntradaParser.Texto_cadenaContext ctx) {
        return null;
    }

    @Override // NO SE SI ME INTERESAN O NO?¿?¿?¿?¿?¿?¿?¿?¿?¿?¿?
    public HashContenedor visitBbaja(EntradaParser.BbajaContext ctx) {
        return null;
    }

    // PARA TIPO_ESTRCUT
    @Override
    public HashContenedor visitTipo_estruc(EntradaParser.Tipo_estrucContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitKw_relationship(EntradaParser.Kw_relationshipContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitKw_class(EntradaParser.Kw_classContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitKw_inheritance(EntradaParser.Kw_inheritanceContext ctx) {
        return null;
    }

    @Override
    public HashContenedor visitKw_inderect_use(EntradaParser.Kw_inderect_useContext ctx) {
        return null;
    }

    // PARA LEN
    @Override
    public HashContenedor visitKw_len(EntradaParser.Kw_lenContext ctx) {
        return null;
    }

    // PARA FONTCOLOR
    @Override
    public HashContenedor visitFontcolor(EntradaParser.FontcolorContext ctx) {
        return null;
    }

    // PARA FONTNAME
    @Override
    public HashContenedor visitFontname(EntradaParser.FontnameContext ctx) {
        return null;
    }

    // PARA FONTSIZE
    @Override
    public HashContenedor visitFontsize(EntradaParser.FontsizeContext ctx) {
        return null;
    }

    // PARAARROWSIZE
    @Override
    public HashContenedor visitArrowsize(EntradaParser.ArrowsizeContext ctx) {
        return null;
    }

    // PARA ARROWCOLOR
    @Override
    public HashContenedor visitArrowcolor(EntradaParser.ArrowcolorContext ctx) {
        return null;
    }

    // PARA PENWIDTH
    @Override
    public HashContenedor visitPenwidth(EntradaParser.PenwidthContext ctx) {
        return null;
    }

    // PARA FILLCOLOR
    @Override
    public HashContenedor visitFillcolor(EntradaParser.FillcolorContext ctx) {
        return null;
    }

    // PARA STYLE
    @Override
    public HashContenedor visitStyle(EntradaParser.StyleContext ctx) {
        return null;
    }

    // PARA SHAPE
    @Override
    public HashContenedor visitShape(EntradaParser.ShapeContext ctx) {
        return null;
    }
}