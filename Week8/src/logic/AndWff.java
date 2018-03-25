package logic;
public class AndWff extends BinaryWff {
	public AndWff(PropVar left, PropVar right) {
		super(left, right);
		setOp(Operator.AND);
	}
	public boolean eval(Valuation val) {
		return (getLeft().eval(val) && getRight().eval(val)); 
	}
}