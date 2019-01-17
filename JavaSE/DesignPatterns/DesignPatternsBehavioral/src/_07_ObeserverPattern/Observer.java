package _07_ObeserverPattern;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
