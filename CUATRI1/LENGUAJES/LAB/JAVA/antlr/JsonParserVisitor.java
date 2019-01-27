package antlr;

// Generated from JsonParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(JsonParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(JsonParser.ContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#descripcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescripcion(JsonParser.DescripcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(JsonParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#ampli_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmpli_info(JsonParser.Ampli_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#ruta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuta(JsonParser.RutaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(JsonParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#graphs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphs(JsonParser.GraphsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(JsonParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#objetos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetos(JsonParser.ObjetosContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(JsonParser.PropContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#pclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPclass(JsonParser.PclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(JsonParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JsonParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(JsonParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(JsonParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#inherits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherits(JsonParser.InheritsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationship(JsonParser.RelationshipContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#reverse_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse_name(JsonParser.Reverse_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#labelrn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelrn(JsonParser.LabelrnContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(JsonParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(JsonParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(JsonParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(JsonParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#languageData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageData(JsonParser.LanguageDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#typeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOf(JsonParser.TypeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#usedby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsedby(JsonParser.UsedbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#isList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsList(JsonParser.IsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(JsonParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#mulMin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulMin(JsonParser.MulMinContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#mulMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulMax(JsonParser.MulMaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#languageProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageProperty(JsonParser.LanguagePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(JsonParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#gender}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGender(JsonParser.GenderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JsonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#wordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordType(JsonParser.WordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#nombre_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_obj(JsonParser.Nombre_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#sacorchete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSacorchete(JsonParser.SacorcheteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#sccorchete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSccorchete(JsonParser.SccorcheteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(JsonParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw(JsonParser.KwContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_true(JsonParser.Kw_trueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_false(JsonParser.Kw_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_isList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_isList(JsonParser.Kw_isListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_optional(JsonParser.Kw_optionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_languageData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_languageData(JsonParser.Kw_languageDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_context(JsonParser.Kw_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_http}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_http(JsonParser.Kw_httpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_www}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_www(JsonParser.Kw_wwwContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_id(JsonParser.Kw_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_name(JsonParser.Kw_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_label(JsonParser.Kw_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_properties(JsonParser.Kw_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_inherits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_inherits(JsonParser.Kw_inheritsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_graphs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_graphs(JsonParser.Kw_graphsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_reversename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_reversename(JsonParser.Kw_reversenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_labelrn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_labelrn(JsonParser.Kw_labelrnContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_from(JsonParser.Kw_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_to(JsonParser.Kw_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_typeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_typeof(JsonParser.Kw_typeofContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_usedby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_usedby(JsonParser.Kw_usedbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_mulmax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_mulmax(JsonParser.Kw_mulmaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_mulmin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_mulmin(JsonParser.Kw_mulminContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_language(JsonParser.Kw_languageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_number(JsonParser.Kw_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_gender}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_gender(JsonParser.Kw_genderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kw_wordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKw_wordType(JsonParser.Kw_wordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#punto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunto(JsonParser.PuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#barra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBarra(JsonParser.BarraContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#alm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlm(JsonParser.AlmContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#dos_ptos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDos_ptos(JsonParser.Dos_ptosContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#sallave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSallave(JsonParser.SallaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#scllave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScllave(JsonParser.ScllaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa(JsonParser.ComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#comillas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComillas(JsonParser.ComillasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#bbaja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBbaja(JsonParser.BbajaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre(JsonParser.NombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#digito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigito(JsonParser.DigitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#intro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntro(JsonParser.IntroContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#arroba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArroba(JsonParser.ArrobaContext ctx);
}