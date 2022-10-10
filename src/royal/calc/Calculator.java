package royal.calc;

import royal.basic.BasicCalc;
import royal.scientific.SciCalc;

public class Calculator {

	// containerShip -> object of one class created into another class's instance
	// variable

	BasicCalc b = new BasicCalc();// has a
	SciCalc c = new SciCalc();// has a

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.b.add();
		calc.b.sub();
		calc.c.sqr();
		calc.c.cube();

		BasicCalc bb = new BasicCalc();
		bb.add();
	}
}
//

//
