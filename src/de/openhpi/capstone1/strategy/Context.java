package de.openhpi.capstone1.strategy;
public class Context {

	public static void main(String[] args) {
		
		StrategySelector selector = new StrategySelector();
		Strategy strategy = selector.getStrategy(1);
		strategy.operation();
		
		strategy = selector.getStrategy(2);
		strategy.operation();
		
		strategy = selector.getStrategy(3);
		strategy.operation();
	}

}