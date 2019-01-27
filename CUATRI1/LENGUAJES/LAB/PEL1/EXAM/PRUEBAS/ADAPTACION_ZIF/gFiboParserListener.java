// Generated from gFiboParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gFiboParser}.
 */
public interface gFiboParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gFiboParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(gFiboParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(gFiboParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#information}.
	 * @param ctx the parse tree
	 */
	void enterInformation(gFiboParser.InformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#information}.
	 * @param ctx the parse tree
	 */
	void exitInformation(gFiboParser.InformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void enterTag_name(gFiboParser.Tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void exitTag_name(gFiboParser.Tag_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#tag_content}.
	 * @param ctx the parse tree
	 */
	void enterTag_content(gFiboParser.Tag_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#tag_content}.
	 * @param ctx the parse tree
	 */
	void exitTag_content(gFiboParser.Tag_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#tag_start}.
	 * @param ctx the parse tree
	 */
	void enterTag_start(gFiboParser.Tag_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#tag_start}.
	 * @param ctx the parse tree
	 */
	void exitTag_start(gFiboParser.Tag_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#tag_end}.
	 * @param ctx the parse tree
	 */
	void enterTag_end(gFiboParser.Tag_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#tag_end}.
	 * @param ctx the parse tree
	 */
	void exitTag_end(gFiboParser.Tag_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(gFiboParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(gFiboParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#comment_block_start}.
	 * @param ctx the parse tree
	 */
	void enterComment_block_start(gFiboParser.Comment_block_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#comment_block_start}.
	 * @param ctx the parse tree
	 */
	void exitComment_block_start(gFiboParser.Comment_block_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#comment_block_end}.
	 * @param ctx the parse tree
	 */
	void enterComment_block_end(gFiboParser.Comment_block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#comment_block_end}.
	 * @param ctx the parse tree
	 */
	void exitComment_block_end(gFiboParser.Comment_block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#information_start}.
	 * @param ctx the parse tree
	 */
	void enterInformation_start(gFiboParser.Information_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#information_start}.
	 * @param ctx the parse tree
	 */
	void exitInformation_start(gFiboParser.Information_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#information_end}.
	 * @param ctx the parse tree
	 */
	void enterInformation_end(gFiboParser.Information_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#information_end}.
	 * @param ctx the parse tree
	 */
	void exitInformation_end(gFiboParser.Information_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#comment_line_start}.
	 * @param ctx the parse tree
	 */
	void enterComment_line_start(gFiboParser.Comment_line_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#comment_line_start}.
	 * @param ctx the parse tree
	 */
	void exitComment_line_start(gFiboParser.Comment_line_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#txt}.
	 * @param ctx the parse tree
	 */
	void enterTxt(gFiboParser.TxtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#txt}.
	 * @param ctx the parse tree
	 */
	void exitTxt(gFiboParser.TxtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gFiboParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gFiboParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#mem}.
	 * @param ctx the parse tree
	 */
	void enterMem(gFiboParser.MemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#mem}.
	 * @param ctx the parse tree
	 */
	void exitMem(gFiboParser.MemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#end_exp}.
	 * @param ctx the parse tree
	 */
	void enterEnd_exp(gFiboParser.End_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#end_exp}.
	 * @param ctx the parse tree
	 */
	void exitEnd_exp(gFiboParser.End_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gFiboParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gFiboParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#mathL1}.
	 * @param ctx the parse tree
	 */
	void enterMathL1(gFiboParser.MathL1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#mathL1}.
	 * @param ctx the parse tree
	 */
	void exitMathL1(gFiboParser.MathL1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#mathL2}.
	 * @param ctx the parse tree
	 */
	void enterMathL2(gFiboParser.MathL2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#mathL2}.
	 * @param ctx the parse tree
	 */
	void exitMathL2(gFiboParser.MathL2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#mathL3}.
	 * @param ctx the parse tree
	 */
	void enterMathL3(gFiboParser.MathL3Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#mathL3}.
	 * @param ctx the parse tree
	 */
	void exitMathL3(gFiboParser.MathL3Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#logicL1}.
	 * @param ctx the parse tree
	 */
	void enterLogicL1(gFiboParser.LogicL1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#logicL1}.
	 * @param ctx the parse tree
	 */
	void exitLogicL1(gFiboParser.LogicL1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#logicL2}.
	 * @param ctx the parse tree
	 */
	void enterLogicL2(gFiboParser.LogicL2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#logicL2}.
	 * @param ctx the parse tree
	 */
	void exitLogicL2(gFiboParser.LogicL2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#logicL3}.
	 * @param ctx the parse tree
	 */
	void enterLogicL3(gFiboParser.LogicL3Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#logicL3}.
	 * @param ctx the parse tree
	 */
	void exitLogicL3(gFiboParser.LogicL3Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#trig}.
	 * @param ctx the parse tree
	 */
	void enterTrig(gFiboParser.TrigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#trig}.
	 * @param ctx the parse tree
	 */
	void exitTrig(gFiboParser.TrigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(gFiboParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(gFiboParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#include_start}.
	 * @param ctx the parse tree
	 */
	void enterInclude_start(gFiboParser.Include_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#include_start}.
	 * @param ctx the parse tree
	 */
	void exitInclude_start(gFiboParser.Include_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#library}.
	 * @param ctx the parse tree
	 */
	void enterLibrary(gFiboParser.LibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#library}.
	 * @param ctx the parse tree
	 */
	void exitLibrary(gFiboParser.LibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(gFiboParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(gFiboParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gFiboParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gFiboParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#assigment_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAssigment_declaration(gFiboParser.Assigment_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#assigment_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAssigment_declaration(gFiboParser.Assigment_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(gFiboParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(gFiboParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(gFiboParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(gFiboParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#lieteral}.
	 * @param ctx the parse tree
	 */
	void enterLieteral(gFiboParser.LieteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#lieteral}.
	 * @param ctx the parse tree
	 */
	void exitLieteral(gFiboParser.LieteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(gFiboParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(gFiboParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(gFiboParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(gFiboParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#str_start}.
	 * @param ctx the parse tree
	 */
	void enterStr_start(gFiboParser.Str_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#str_start}.
	 * @param ctx the parse tree
	 */
	void exitStr_start(gFiboParser.Str_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#str_end}.
	 * @param ctx the parse tree
	 */
	void enterStr_end(gFiboParser.Str_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#str_end}.
	 * @param ctx the parse tree
	 */
	void exitStr_end(gFiboParser.Str_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#str_txt}.
	 * @param ctx the parse tree
	 */
	void enterStr_txt(gFiboParser.Str_txtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#str_txt}.
	 * @param ctx the parse tree
	 */
	void exitStr_txt(gFiboParser.Str_txtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#esc}.
	 * @param ctx the parse tree
	 */
	void enterEsc(gFiboParser.EscContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#esc}.
	 * @param ctx the parse tree
	 */
	void exitEsc(gFiboParser.EscContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#str_var}.
	 * @param ctx the parse tree
	 */
	void enterStr_var(gFiboParser.Str_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#str_var}.
	 * @param ctx the parse tree
	 */
	void exitStr_var(gFiboParser.Str_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(gFiboParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(gFiboParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(gFiboParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(gFiboParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#system_function}.
	 * @param ctx the parse tree
	 */
	void enterSystem_function(gFiboParser.System_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#system_function}.
	 * @param ctx the parse tree
	 */
	void exitSystem_function(gFiboParser.System_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#system_header}.
	 * @param ctx the parse tree
	 */
	void enterSystem_header(gFiboParser.System_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#system_header}.
	 * @param ctx the parse tree
	 */
	void exitSystem_header(gFiboParser.System_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#while_header}.
	 * @param ctx the parse tree
	 */
	void enterWhile_header(gFiboParser.While_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#while_header}.
	 * @param ctx the parse tree
	 */
	void exitWhile_header(gFiboParser.While_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#if_header}.
	 * @param ctx the parse tree
	 */
	void enterIf_header(gFiboParser.If_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#if_header}.
	 * @param ctx the parse tree
	 */
	void exitIf_header(gFiboParser.If_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#switch_header}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_header(gFiboParser.Switch_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#switch_header}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_header(gFiboParser.Switch_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#system_body}.
	 * @param ctx the parse tree
	 */
	void enterSystem_body(gFiboParser.System_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#system_body}.
	 * @param ctx the parse tree
	 */
	void exitSystem_body(gFiboParser.System_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#while_body}.
	 * @param ctx the parse tree
	 */
	void enterWhile_body(gFiboParser.While_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#while_body}.
	 * @param ctx the parse tree
	 */
	void exitWhile_body(gFiboParser.While_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(gFiboParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(gFiboParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(gFiboParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(gFiboParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#case_closure}.
	 * @param ctx the parse tree
	 */
	void enterCase_closure(gFiboParser.Case_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#case_closure}.
	 * @param ctx the parse tree
	 */
	void exitCase_closure(gFiboParser.Case_closureContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#system_function_name}.
	 * @param ctx the parse tree
	 */
	void enterSystem_function_name(gFiboParser.System_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#system_function_name}.
	 * @param ctx the parse tree
	 */
	void exitSystem_function_name(gFiboParser.System_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(gFiboParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(gFiboParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(gFiboParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(gFiboParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#custom_function}.
	 * @param ctx the parse tree
	 */
	void enterCustom_function(gFiboParser.Custom_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#custom_function}.
	 * @param ctx the parse tree
	 */
	void exitCustom_function(gFiboParser.Custom_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#custom_header}.
	 * @param ctx the parse tree
	 */
	void enterCustom_header(gFiboParser.Custom_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#custom_header}.
	 * @param ctx the parse tree
	 */
	void exitCustom_header(gFiboParser.Custom_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#custom_body}.
	 * @param ctx the parse tree
	 */
	void enterCustom_body(gFiboParser.Custom_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#custom_body}.
	 * @param ctx the parse tree
	 */
	void exitCustom_body(gFiboParser.Custom_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#custom_function_name}.
	 * @param ctx the parse tree
	 */
	void enterCustom_function_name(gFiboParser.Custom_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#custom_function_name}.
	 * @param ctx the parse tree
	 */
	void exitCustom_function_name(gFiboParser.Custom_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(gFiboParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(gFiboParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#dev}.
	 * @param ctx the parse tree
	 */
	void enterDev(gFiboParser.DevContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#dev}.
	 * @param ctx the parse tree
	 */
	void exitDev(gFiboParser.DevContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(gFiboParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(gFiboParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(gFiboParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(gFiboParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#return_word}.
	 * @param ctx the parse tree
	 */
	void enterReturn_word(gFiboParser.Return_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#return_word}.
	 * @param ctx the parse tree
	 */
	void exitReturn_word(gFiboParser.Return_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(gFiboParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(gFiboParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#argument_start}.
	 * @param ctx the parse tree
	 */
	void enterArgument_start(gFiboParser.Argument_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#argument_start}.
	 * @param ctx the parse tree
	 */
	void exitArgument_start(gFiboParser.Argument_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#argument_end}.
	 * @param ctx the parse tree
	 */
	void enterArgument_end(gFiboParser.Argument_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#argument_end}.
	 * @param ctx the parse tree
	 */
	void exitArgument_end(gFiboParser.Argument_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#body_start}.
	 * @param ctx the parse tree
	 */
	void enterBody_start(gFiboParser.Body_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#body_start}.
	 * @param ctx the parse tree
	 */
	void exitBody_start(gFiboParser.Body_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#if_start}.
	 * @param ctx the parse tree
	 */
	void enterIf_start(gFiboParser.If_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#if_start}.
	 * @param ctx the parse tree
	 */
	void exitIf_start(gFiboParser.If_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#switch_}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_(gFiboParser.Switch_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#switch_}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_(gFiboParser.Switch_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#case_}.
	 * @param ctx the parse tree
	 */
	void enterCase_(gFiboParser.Case_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#case_}.
	 * @param ctx the parse tree
	 */
	void exitCase_(gFiboParser.Case_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(gFiboParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(gFiboParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#deafault_}.
	 * @param ctx the parse tree
	 */
	void enterDeafault_(gFiboParser.Deafault_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#deafault_}.
	 * @param ctx the parse tree
	 */
	void exitDeafault_(gFiboParser.Deafault_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#switch_end}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_end(gFiboParser.Switch_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#switch_end}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_end(gFiboParser.Switch_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(gFiboParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(gFiboParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#if_end}.
	 * @param ctx the parse tree
	 */
	void enterIf_end(gFiboParser.If_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#if_end}.
	 * @param ctx the parse tree
	 */
	void exitIf_end(gFiboParser.If_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#body_end}.
	 * @param ctx the parse tree
	 */
	void enterBody_end(gFiboParser.Body_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#body_end}.
	 * @param ctx the parse tree
	 */
	void exitBody_end(gFiboParser.Body_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(gFiboParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(gFiboParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link gFiboParser#trash}.
	 * @param ctx the parse tree
	 */
	void enterTrash(gFiboParser.TrashContext ctx);
	/**
	 * Exit a parse tree produced by {@link gFiboParser#trash}.
	 * @param ctx the parse tree
	 */
	void exitTrash(gFiboParser.TrashContext ctx);
}