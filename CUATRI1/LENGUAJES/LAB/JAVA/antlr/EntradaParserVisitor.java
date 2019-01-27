package antlr;

// Generated from EntradaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EntradaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EntradaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EntradaParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(EntradaParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(EntradaParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#authorcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorcom(EntradaParser.AuthorcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#descrcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescrcom(EntradaParser.DescrcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#targcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargcom(EntradaParser.TargcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#texto_comen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto_comen(EntradaParser.Texto_comenContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#rutafichero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRutafichero(EntradaParser.RutaficheroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#tipo_archivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_archivo(EntradaParser.Tipo_archivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(EntradaParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#svg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSvg(EntradaParser.SvgContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(EntradaParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv(EntradaParser.CsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#wsci}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsci(EntradaParser.WsciContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#white_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhite_space(EntradaParser.White_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#barra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBarra(EntradaParser.BarraContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#intro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntro(EntradaParser.IntroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetra(EntradaParser.LetraContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(EntradaParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(EntradaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#sap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSap(EntradaParser.SapContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#scp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScp(EntradaParser.ScpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(EntradaParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#opasig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpasig(EntradaParser.OpasigContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#opblt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpblt(EntradaParser.OpbltContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#opbgt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpbgt(EntradaParser.OpbgtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa(EntradaParser.ComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#dos_ptos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDos_ptos(EntradaParser.Dos_ptosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#punto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunto(EntradaParser.PuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#doblepunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoblepunto(EntradaParser.DoblepuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#texto_cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto_cadena(EntradaParser.Texto_cadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#cadena_abrir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena_abrir(EntradaParser.Cadena_abrirContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#cadena_cerrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena_cerrar(EntradaParser.Cadena_cerrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(EntradaParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#bbaja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBbaja(EntradaParser.BbajaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#cor_abrir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor_abrir(EntradaParser.Cor_abrirContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#cor_Cerrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCor_Cerrar(EntradaParser.Cor_CerrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_json(EntradaParser.Kw_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#extension_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_json(EntradaParser.Extension_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_svg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_svg(EntradaParser.Kw_svgContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#extension_svg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_svg(EntradaParser.Extension_svgContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_dot(EntradaParser.Kw_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#extension_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_dot(EntradaParser.Extension_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_csv(EntradaParser.Kw_csvContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#extension_csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_csv(EntradaParser.Extension_csvContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(EntradaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(EntradaParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#fontcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontcolor(EntradaParser.FontcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#fontname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontname(EntradaParser.FontnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#fontsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontsize(EntradaParser.FontsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#arrowsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowsize(EntradaParser.ArrowsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#arrowcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowcolor(EntradaParser.ArrowcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#penwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenwidth(EntradaParser.PenwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#fillcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillcolor(EntradaParser.FillcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(EntradaParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(EntradaParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#tipo_estruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estruc(EntradaParser.Tipo_estrucContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_edge(EntradaParser.Kw_edgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_node(EntradaParser.Kw_nodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_relationship(EntradaParser.Kw_relationshipContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_class(EntradaParser.Kw_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_property(EntradaParser.Kw_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_inheritance(EntradaParser.Kw_inheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_inderect_use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_inderect_use(EntradaParser.Kw_inderect_useContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_len(EntradaParser.Kw_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_fontcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fontcolor(EntradaParser.Kw_fontcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_fontname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fontname(EntradaParser.Kw_fontnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_fontsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fontsize(EntradaParser.Kw_fontsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_arrowsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_arrowsize(EntradaParser.Kw_arrowsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_arrowcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_arrowcolor(EntradaParser.Kw_arrowcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_penwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_penwidth(EntradaParser.Kw_penwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_fillcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_fillcolor(EntradaParser.Kw_fillcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_style(EntradaParser.Kw_styleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EntradaParser#kw_shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_shape(EntradaParser.Kw_shapeContext ctx);
}