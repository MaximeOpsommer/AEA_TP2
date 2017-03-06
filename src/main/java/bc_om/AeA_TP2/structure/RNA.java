package bc_om.AeA_TP2.structure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum RNA {
	
	A('U'),
	C('G'),
	G('C'),
	U('A');
	
	private char opposite;

	private static final List<RNA> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	RNA(char opposite) {
		this.opposite = opposite;
	}
	
	public char getOpposite() {
		return this.opposite;
	}
	
	public static RNA randomLetter()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

}
