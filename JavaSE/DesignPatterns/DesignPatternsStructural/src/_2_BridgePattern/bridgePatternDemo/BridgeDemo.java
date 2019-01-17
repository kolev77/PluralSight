package _2_BridgePattern.bridgePatternDemo;

import _2_BridgePattern.bridgePatternDemo.entities.Movie;
import _2_BridgePattern.bridgePatternDemo.utilities.formatters.Formatter;
import _2_BridgePattern.bridgePatternDemo.utilities.formatters.HtmlFormatter;
import _2_BridgePattern.bridgePatternDemo.utilities.formatters.PrintFormatter;
import _2_BridgePattern.bridgePatternDemo.utilities.printers.MoviePrinter;
import _2_BridgePattern.bridgePatternDemo.utilities.printers.Printer;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");

		Movie movie2 = new Movie();
		movie2.setClassification("Comedy");
		movie2.setTitle("Little monkey");
		movie2.setRuntime("2:24");
		movie2.setYear("2016");

		// initialize Formatter
		Formatter printFormatter = new PrintFormatter();

		Printer moviePrinter1 = new MoviePrinter(movie);
		String printedMaterial1 = moviePrinter1.print(printFormatter);

		Printer moviePrinter2 = new MoviePrinter(movie2);
		String printedMaterial2 = moviePrinter2.print(printFormatter);

		System.out.println(printedMaterial1);
		System.out.println(printedMaterial2);

		Formatter htmlFormatter = new HtmlFormatter();

		String htmlMaterial = moviePrinter1.print(htmlFormatter);

		System.out.println(htmlMaterial);
	}

}
