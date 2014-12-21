//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
package org.muzir.book.solution.Polymorphism;

import org.muzir.book.solution.Commons.CommonBase;

class Glyph extends CommonBase {
	void draw() {
		print("Glyph.draw()");
	}

	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}

	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
} /*
 * Output: Glyph() before draw() RoundGlyph.draw(), radius = 0 Glyph() after
 * draw() RoundGlyph.RoundGlyph(), radius = 5
 */// :~
