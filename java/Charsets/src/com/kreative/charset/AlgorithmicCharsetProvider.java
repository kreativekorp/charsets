package com.kreative.charset;

public class AlgorithmicCharsetProvider extends AbstractCharsetProvider {
	public AlgorithmicCharsetProvider() {
		super(new NonLossyASCIICharset());
	}
}
