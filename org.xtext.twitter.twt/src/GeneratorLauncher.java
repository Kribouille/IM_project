import java.io.File;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.xtext.twitter.twt.generator.TwitterRESTAPIGenerator;

public class GeneratorLauncher {

	private static TwitterRESTAPIGenerator generator;
	private static String inputFile;
	private static String outFile;

	public static void main(String[] parameters){
		generator = new TwitterRESTAPIGenerator();
		outFile = "default.json";
		inputFile = "";

		CommandLine commandLine;

		OptionBuilder.withArgName(Resources.OPT_OUT);
		OptionBuilder.hasArg();
		OptionBuilder.withDescription("");
		//output file
		Option option_Out =	OptionBuilder.create(Resources.OPT_OUT);

		//Add options
		Options options = new Options();
		CommandLineParser parser = new GnuParser();
		options.addOption(option_Out);

		try{
			//Parse options
			commandLine = parser.parse(options, parameters);

			//Nom du fichier de sortie
			if (commandLine.hasOption(Resources.OPT_OUT)) {
				outFile = commandLine.getOptionValue(Resources.OPT_OUT);
				if(outFile.length() < ".json".length() || outFile.indexOf(".json") != outFile.length() - ".json".length())
					outFile += ".json";
			}

			//Nom du fichier en entrée
			if (commandLine.getArgs().length > 0)
				inputFile = commandLine.getArgs()[0];

		}
		catch(ParseException exception){
			System.out.print("Parse error : ");
			System.out.println(exception.getMessage());
		}

		callTwitterRESTAPIGenerator();
	}


	private static void callTwitterRESTAPIGenerator() {
		File twtFile = new File(inputFile);
		
		if(inputFile != null && !inputFile.isEmpty() && twtFile.exists()) {
			generator.generate(inputFile, outFile);
		}

	}
}
