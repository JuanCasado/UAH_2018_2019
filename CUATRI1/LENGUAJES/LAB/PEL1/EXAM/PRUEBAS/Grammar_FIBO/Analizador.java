import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.lang.reflect.Method;

public class Analizador {
	public static void main(String[] args) throws Exception{
		AnalizadorListener listener = new AnalizadorListener();
		new ParseTreeWalker().walk(listener, new gFiboParser(new CommonTokenStream(new gFiboLexer(new ANTLRInputStream(args.length > 0 ? new FileInputStream(args[0]) : System.in)))).init());
		if (args.length > 1){
			String filename = args[1]+".html";
			FileWriter fichero = new FileWriter ("./" +filename);
			BufferedWriter bfwriter = new BufferedWriter(fichero);
			bfwriter.write(listener.getFile(args[0]));
			bfwriter.close();
			fichero.close();
			abrirURL("file://" + System.getProperty("user.dir")+"/"+filename);
		}else{
			System.out.print(listener.getFile());
		}
	}

	public static void abrirURL(String url) {
		String nombreSO = System.getProperty("os.name");
		try {
			if (nombreSO.startsWith("Mac OS")) {
				Class manager = Class.forName("com.apple.eio.FileManager");
				Method openURL = manager.getDeclaredMethod("openURL", new Class[] { String.class });
				openURL.invoke(null, new Object[] { url });
			}
			else if (nombreSO.startsWith("Windows"))
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			else {
				String[] navegadores = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape","safari","Safari","Chrome","chrome", "Google Chrome","google chrome"};
				String navegador = null;
				for (int contador = 0; contador < navegadores.length && navegador == null; contador++) {
					if (Runtime.getRuntime().exec(new String[] { "which", navegadores[contador] }).waitFor() == 0)
						navegador = navegadores[contador];
				}
				if (navegador != null){
					Runtime.getRuntime().exec(new String[] { navegador, url });
				}
			}
		} catch (Exception e) {}
	}
}