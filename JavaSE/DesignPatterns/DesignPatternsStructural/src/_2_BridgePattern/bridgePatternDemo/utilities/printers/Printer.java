package _2_BridgePattern.bridgePatternDemo.utilities.printers;

import _2_BridgePattern.bridgePatternDemo.entities.Detail;
import _2_BridgePattern.bridgePatternDemo.utilities.formatters.Formatter;

import java.util.List;

public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(this.getHeader(), this.getDetails());
	}
	
	abstract protected List<Detail> getDetails();
	
	abstract protected String getHeader();
}
