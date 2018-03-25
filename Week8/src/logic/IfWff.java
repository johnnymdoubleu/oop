package logic;
public class IfWff extends BinaryWff {
	public IfWff(PropVar left, PropVar right) {
		super(left, right);
		setOp(Operator.IF);
	}
	public boolean eval(Valuation val) {
		return (!(getLeft().eval(val)) || getRight().eval(val)); 
	}
}
