
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) throws Exception {

		String inputFile = "C:\\Users\\rt\\Documents\\Atividade\\teste.txt";

		InputStream is = System.in;

		if (inputFile != null)
			is = new FileInputStream(inputFile);

		ANTLRInputStream input = new ANTLRInputStream(is);
		LinguagemLexer lexer = new LinguagemLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LinguagemParser parser = new LinguagemParser((TokenStream) tokens);

		
		ParseTree tree = parser.programa();

		EvalVisitor eval = new EvalVisitor();

		eval.visit(tree);
	}
}
