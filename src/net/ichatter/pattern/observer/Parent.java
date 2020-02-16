package net.ichatter.pattern.observer;

public abstract class Parent implements Observer {

	private Subject subject;

	protected void setSubject(Subject subject) {
		this.subject = subject;
	}

	protected Subject getSubject() {
		return subject;
	}

}
