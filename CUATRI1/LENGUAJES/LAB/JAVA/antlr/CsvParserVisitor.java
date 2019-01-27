package antlr;

// Generated from CsvParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsvParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsvParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(CsvParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(CsvParser.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CsvParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir(CsvParser.DirContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#json_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_file(CsvParser.Json_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#svg_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSvg_file(CsvParser.Svg_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#dot_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_file(CsvParser.Dot_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa(CsvParser.ComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(CsvParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(CsvParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#json_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_extension(CsvParser.Json_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#svg_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSvg_extension(CsvParser.Svg_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#dot_extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_extension(CsvParser.Dot_extensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre(CsvParser.NombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#rutafichero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRutafichero(CsvParser.RutaficheroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#rutaficherosalida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRutaficherosalida(CsvParser.RutaficherosalidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#rutaficherografico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRutaficherografico(CsvParser.RutaficherograficoContext ctx);
}