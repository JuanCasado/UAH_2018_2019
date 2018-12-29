import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalizadorListener extends gFiboParserBaseListener {
	String file = "";
	private void add(String s){
		file += "<span class=\""+s+"\">";
	}
	private void end(){
     	file += "</span>";
	} 
	public String getFile(String fileName){
		return "<!DOCTYPE html PUBLIC http://www.mrblissfulgrin.com>\n"+
				"<html>\n"+
					"\t<head>\n"+
						"\t\t<meta charset=\"UTF-8\">\n"+
						"\t\t<link rel=\"icon\" type=\"image/png\" href=\"https://i2.wp.com/box2076.temp.domains/~mrblissf/wp-content/uploads/2018/08/cropped-smileuniversal@2x.png?w=200\" />\n"+
						"\t\t<title>Src: " + fileName + "</title>\n\n"+
						"\t\t<style>\n"+
							"\t\t\tbody{background-color: #444444;}\n"+
							"\t\t\th1{color: #FFFFFF;text-decoration: underline;}\n" +
							"\t\t\th2{color: #FFFFFF;font-weight:bolder;}\n" +
							"\t\t\t.palabraReservada {\n"+					// palabraReservada
								"\t\t\t\tcolor:aqua;\n"+
								"\t\t\t\tfont-weight:bolder;\n"+
							"\t\t\t}\n"+
							"\t\t\t.comentario {\n"+ 						// comentario
								"\t\t\t\tcolor:green;\n"+
							"\t\t\t}\n\n "+
							"\t\t\t.nombreFuncion {\n" + 					// nombreFuncion
								"\t\t\t\tcolor:white;\n" + 
								"\t\t\t\tfont-weight:bolder;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.nombreVariable {\n" + 					// nombreVariable
								"\t\t\t\tcolor:yellow;\n" + 
							"\t\t\t}\n\n " +
							"\t\t\t.tipoDato {\n" +							// tipoDato
							  	"\t\t\t\tcolor:red;\n" + 
							"\t\t\t}\n\n " +
							"\t\t\t.parentesisOperador {\n" +				//parentesisOperador
								 "\t\t\t\tcolor:black;\n" +
								 "\t\t\t\tfont-weight:bolder;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.asignacion {\n" + 						//asignacion
								"\t\t\t\tcolor:yellow;\n" +
								"\t\t\t\tfont-weight:bolder;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.separadorTerminador {\n" +				//separadorTerminador
								"\t\t\t\tcolor:aqua;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.other {\n" + 							// other
								"\t\t\t\tcolor:black;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.beginEnd {\n" + 						// beginEnd
								"\t\t\t\tcolor:orange;\n" + 
								"\t\t\t\tfont-weight:bolder;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.numero {\n" + 							// numero
								"\t\t\t\tcolor:blue;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.cadena {\n" + 							// cadena
								"\t\t\t\tcolor:orchid;\n" + 
								"\t\t\t\tfont-style: italic;\n" + 
							"\t\t\t}\n\n " +
							"\t\t\t.inicioComentario {\n" + 				// inicioComentario
								"\t\t\t\tcolor:teal;\n" + 
							"\t\t\t}\n\n " +
							"\t\t\t.infoComentario {\n" + 					// infoComentario
								"\t\t\t\tcolor:lightgreen;\n" +
							"\t\t\t}\n\n " +
							"\t\t\t.tag {\n" + 								// tag
								"\t\t\t\tcolor:lime;\n" 
							+ "\t\t\t}\n\n " +
							"\t\t\t.error {\n" + 							// error
								"\t\t\t\tcolor:fireBrick;\n" +
								"\t\t\t\tfont-weight:bolder;\n" +
								"\t\t\t\ttext-decoration: underline;\n"+
							"\t\t\t}\n\n " +
							"\t\t\t.escape {\n" + 							// escape
								"\t\t\t\tcolor:deepPink;\n" + 
								"\t\t\t\tfont-weight:bolder;\n" + 
							"\t\t\t}\n\n " +
							"\t\t\t.strStart {\n" + 						// strStart
								"\t\t\t\tcolor:indianRed;\n" +
								"\t\t\t\tfont-weight:bolder;\n" + 
							"\t\t\t}\n\n " +
							"\t\t\t.strVar {\n" + 							// strVar
								"\t\t\t\tcolor:purple;\n" +
								"\t\t\t\tfont-weight:bolder;\n" +
							"\t\t\t}\n\n " +
						"\t\t</style>\n\n"+
					"\t</head>\n"+
					"\t<body>\n"+
						"\t\t<h1>Src: "+ fileName + "</h1>\n"+
						"\t\t <code>\n"+
							"\t\t\t<pre>" +
								file +
							"\t\t\t</pre>\n"+
						"\t\t<h2 align=\"right\"> by Juan Casado Ballestros     \t  </h2>\n" +
						"\t\t</code>\n"+
					"\t</body>\n"+
				"</html>";
	}
	public String getFile() {
		return file;
	}


	@Override
	public void enterInit(gFiboParser.InitContext ctx) {
	}

	@Override
	public void exitInit(gFiboParser.InitContext ctx) {
	}

	@Override
	public void enterInformation(gFiboParser.InformationContext ctx) {
	}

	@Override
	public void exitInformation(gFiboParser.InformationContext ctx) {
	}

	@Override
	public void enterTag_name(gFiboParser.Tag_nameContext ctx) {
		add("tag");
	}

	@Override
	public void exitTag_name(gFiboParser.Tag_nameContext ctx) {
		end();
	}

	@Override
	public void enterTag_content(gFiboParser.Tag_contentContext ctx) {
	}

	@Override
	public void exitTag_content(gFiboParser.Tag_contentContext ctx) {
	}

	@Override
	public void enterTag_start(gFiboParser.Tag_startContext ctx) {
		add("infoComentario");
	}

	@Override
	public void exitTag_start(gFiboParser.Tag_startContext ctx) {
		end();
	}

	@Override
	public void enterTag_end(gFiboParser.Tag_endContext ctx) {
		add("infoComentario");
	}

	@Override
	public void exitTag_end(gFiboParser.Tag_endContext ctx) {
		end();
	}

	@Override
	public void enterComment(gFiboParser.CommentContext ctx) {
		add("comentario");
	}

	@Override
	public void exitComment(gFiboParser.CommentContext ctx) {
		end();
	}

	@Override
	public void enterComment_block_start(gFiboParser.Comment_block_startContext ctx) {
		add("inicioComentario");
	}

	@Override
	public void exitComment_block_start(gFiboParser.Comment_block_startContext ctx) {
		end();
	}

	@Override
	public void enterComment_block_end(gFiboParser.Comment_block_endContext ctx) {
		add("inicioComentario");
	}

	@Override
	public void exitComment_block_end(gFiboParser.Comment_block_endContext ctx) {
		end();
	}

	@Override
	public void enterInformation_start(gFiboParser.Information_startContext ctx) {
		add("inicioComentario");
	}

	@Override
	public void exitInformation_start(gFiboParser.Information_startContext ctx) {
		end();
	}

	@Override
	public void enterInformation_end(gFiboParser.Information_endContext ctx) {
		add("inicioComentario");
	}

	@Override
	public void exitInformation_end(gFiboParser.Information_endContext ctx) {
		end();
	}

	@Override
	public void enterComment_line_start(gFiboParser.Comment_line_startContext ctx) {
		add("inicioComentario");
	}

	@Override
	public void exitComment_line_start(gFiboParser.Comment_line_startContext ctx) {
		end();
	}

	@Override
	public void enterTxt(gFiboParser.TxtContext ctx) {
	}

	@Override
	public void exitTxt(gFiboParser.TxtContext ctx) {
	}

	@Override
	public void enterProg(gFiboParser.ProgContext ctx) {
	}

	@Override
	public void exitProg(gFiboParser.ProgContext ctx) {
	}

	@Override
	public void enterEnd_exp(gFiboParser.End_expContext ctx) {
		add("separadorTerminador");
	}

	@Override
	public void exitEnd_exp(gFiboParser.End_expContext ctx) {
		end();
	}

	@Override
	public void enterExp(gFiboParser.ExpContext ctx) {
	}

	@Override
	public void exitExp(gFiboParser.ExpContext ctx) {
	}

	@Override
	public void enterMathL1(gFiboParser.MathL1Context ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitMathL1(gFiboParser.MathL1Context ctx) {
		end();
	}
	@Override
	public void enterMathL2(gFiboParser.MathL2Context ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitMathL2(gFiboParser.MathL2Context ctx) {
		end();
	}

	@Override
	public void enterMathL3(gFiboParser.MathL3Context ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitMathL3(gFiboParser.MathL3Context ctx) {
		end();
	}

	@Override
	public void enterLogicL1(gFiboParser.LogicL1Context ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitLogicL1(gFiboParser.LogicL1Context ctx) {
		end();
	}

	@Override
	public void enterLogicL2(gFiboParser.LogicL2Context ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitLogicL2(gFiboParser.LogicL2Context ctx) {
		end();
	}

	@Override
	public void enterLogicL3(gFiboParser.LogicL3Context ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitLogicL3(gFiboParser.LogicL3Context ctx) {
		end();
	}

	@Override
	public void enterTrig(gFiboParser.TrigContext ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitTrig(gFiboParser.TrigContext ctx) {
		end();
	}

	@Override
	public void enterInclude(gFiboParser.IncludeContext ctx) {
	}

	@Override
	public void exitInclude(gFiboParser.IncludeContext ctx) {
	}

	@Override
	public void enterInclude_start(gFiboParser.Include_startContext ctx) {
		add("palabraReservada");
	}

	@Override
	public void exitInclude_start(gFiboParser.Include_startContext ctx) {
		end();
	}

	@Override
	public void enterLibrary(gFiboParser.LibraryContext ctx) {
	}

	@Override
	public void exitLibrary(gFiboParser.LibraryContext ctx) {
	}

	@Override
	public void enterAssigment(gFiboParser.AssigmentContext ctx) {
	}

	@Override
	public void exitAssigment(gFiboParser.AssigmentContext ctx) {
	}

	@Override
	public void enterDeclaration(gFiboParser.DeclarationContext ctx) {
	}

	@Override
	public void exitDeclaration(gFiboParser.DeclarationContext ctx) {
	}

	@Override
	public void enterAssigment_declaration(gFiboParser.Assigment_declarationContext ctx) {
	}

	@Override
	public void exitAssigment_declaration(gFiboParser.Assigment_declarationContext ctx) {
	}

	@Override
	public void enterVar_type(gFiboParser.Var_typeContext ctx) {
		add("tipoDato");
	}

	@Override
	public void exitVar_type(gFiboParser.Var_typeContext ctx) {
		end();
	}

	@Override
	public void enterVar_name(gFiboParser.Var_nameContext ctx) {
		add("nombreVariable");
	}

	@Override
	public void exitVar_name(gFiboParser.Var_nameContext ctx) {
		end();
	}

	@Override
	public void enterLieteral(gFiboParser.LieteralContext ctx) {
	}

	@Override
	public void exitLieteral(gFiboParser.LieteralContext ctx) {
	}

	@Override
	public void enterNumber(gFiboParser.NumberContext ctx) {
		add("numero");
	}

	@Override
	public void exitNumber(gFiboParser.NumberContext ctx) {
		end();
	}

	@Override
	public void enterFunction_call(gFiboParser.Function_callContext ctx) {
	}

	@Override
	public void exitFunction_call(gFiboParser.Function_callContext ctx) {
	}

	@Override
	public void enterFunction_name(gFiboParser.Function_nameContext ctx) {
		add("nombreFuncion");
	}

	@Override
	public void exitFunction_name(gFiboParser.Function_nameContext ctx) {
		end();
	}

	@Override
	public void enterSystem_function(gFiboParser.System_functionContext ctx) {
	}

	@Override
	public void exitSystem_function(gFiboParser.System_functionContext ctx) {
	}

	@Override
	public void enterSystem_function_name(gFiboParser.System_function_nameContext ctx) {
		add("palabraReservada");
	}

	@Override
	public void exitSystem_function_name(gFiboParser.System_function_nameContext ctx) {
		end();
	}

	@Override
	public void enterCustom_function(gFiboParser.Custom_functionContext ctx) {
	}

	@Override
	public void exitCustom_function(gFiboParser.Custom_functionContext ctx) {
	}

	@Override
	public void enterCustom_function_name(gFiboParser.Custom_function_nameContext ctx) {
		add("nombreFuncion");
	}

	@Override
	public void exitCustom_function_name(gFiboParser.Custom_function_nameContext ctx) {
		end();
	}

	@Override
	public void enterParameter(gFiboParser.ParameterContext ctx) {
	}

	@Override
	public void exitParameter(gFiboParser.ParameterContext ctx) {
	}

	@Override
	public void enterDev(gFiboParser.DevContext ctx) {
	}

	@Override
	public void exitDev(gFiboParser.DevContext ctx) {
	}

	@Override
	public void enterSeparator(gFiboParser.SeparatorContext ctx) {
		add("separadorTerminador");
	}

	@Override
	public void exitSeparator(gFiboParser.SeparatorContext ctx) {
		end();
	}

	@Override
	public void enterReturn_type(gFiboParser.Return_typeContext ctx) {
		add("beginEnd");
	}

	@Override
	public void exitReturn_type(gFiboParser.Return_typeContext ctx) {
		end();
	}

	@Override
	public void enterReturn_word(gFiboParser.Return_wordContext ctx) {
		add("palabraReservada");
	}

	@Override
	public void exitReturn_word(gFiboParser.Return_wordContext ctx) {
		end();
	}

	@Override
	public void enterFunction_declaration(gFiboParser.Function_declarationContext ctx) {
		add("palabraReservada");
	}

	@Override
	public void exitFunction_declaration(gFiboParser.Function_declarationContext ctx) {
		end();
	}

	@Override
	public void enterArgument_start(gFiboParser.Argument_startContext ctx) {
		add("parentesisOperador");
	}

	@Override
	public void exitArgument_start(gFiboParser.Argument_startContext ctx) {
		end();
	}


	@Override
	public void enterArgument_end(gFiboParser.Argument_endContext ctx) {
	}

	@Override
	public void exitArgument_end(gFiboParser.Argument_endContext ctx) {
	}

	@Override
	public void enterBody_start(gFiboParser.Body_startContext ctx) {
		add("beginEnd");
	}

	@Override
	public void exitBody_start(gFiboParser.Body_startContext ctx) {
		end();
	}

	@Override
	public void enterBody_end(gFiboParser.Body_endContext ctx) {
		add("beginEnd");
	}

	@Override
	public void exitBody_end(gFiboParser.Body_endContext ctx) {
		end();
	}

	@Override
	public void enterAssign(gFiboParser.AssignContext ctx) {
		add("asignacion");
	}

	@Override
	public void exitAssign(gFiboParser.AssignContext ctx) {
		end();
	}
	
	@Override public void visitTerminal(TerminalNode node) { 
		file += node.getText();
	}

	@Override
	public void enterStr(gFiboParser.StrContext ctx) {
	}

	@Override
	public void exitStr(gFiboParser.StrContext ctx) {
	}

	@Override
	public void enterStr_start(gFiboParser.Str_startContext ctx) {
		add("strStart");
	}

	@Override
	public void exitStr_start(gFiboParser.Str_startContext ctx) {
		end();
	}

	@Override
	public void enterStr_end(gFiboParser.Str_endContext ctx) {
		add("strStart");
	}

	@Override
	public void exitStr_end(gFiboParser.Str_endContext ctx) {
		end();
	}

	@Override
	public void enterStr_txt(gFiboParser.Str_txtContext ctx) {
		add("cadena");
	}

	@Override
	public void exitStr_txt(gFiboParser.Str_txtContext ctx) {
		end();
	}

	@Override
	public void enterEsc(gFiboParser.EscContext ctx) {
		add("escape");
	}

	@Override
	public void enterStr_var(gFiboParser.Str_varContext ctx) {
		add("strVar");
	}

	@Override
	public void exitStr_var(gFiboParser.Str_varContext ctx) {
		end();
	}

	@Override
	public void exitEsc(gFiboParser.EscContext ctx) {
		end();
	}
	
	@Override
	public void visitErrorNode(ErrorNode node) {
		add("error");
		file += node.getText();
		end();
	}

	@Override
	public void enterIf_start(gFiboParser.If_startContext ctx) {
		add("beginEnd");
	}

	@Override
	public void exitIf_start(gFiboParser.If_startContext ctx) {
		end();
	}

	@Override
	public void enterIf_end(gFiboParser.If_endContext ctx) {
		add("beginEnd");
	}

	@Override
	public void exitIf_end(gFiboParser.If_endContext ctx) {
		end();
	}
}