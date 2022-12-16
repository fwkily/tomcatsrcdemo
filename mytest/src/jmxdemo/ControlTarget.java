package jmxdemo;

public class ControlTarget {
	private long width;
	private long length;

	public ControlTarget( long width, long length) {
		this.width = width;
		this.length = length;
	}

	public long getWidth() {
		return width;
	}

	public long getLength() {
		return length;
	}
}
