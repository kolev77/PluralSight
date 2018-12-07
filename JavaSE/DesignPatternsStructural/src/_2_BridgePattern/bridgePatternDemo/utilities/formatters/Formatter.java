package _2_BridgePattern.bridgePatternDemo.utilities.formatters;

import _2_BridgePattern.bridgePatternDemo.entities.Detail;

import java.util.List;

public interface Formatter {
	String format(String header, List<Detail> details);
}
