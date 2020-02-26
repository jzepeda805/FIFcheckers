public class King extends AbstractPiece {

	public King(String color, Position pos) {
		super(color, pos);
	}

	public boolean canMove(Position up_one) {
		return Math.abs(pos.difRow(up_one)) == Math.abs((pos.difColumn(up_one)))
				&& Math.abs(pos.difRow(up_one)) >= 1;
	}

	@Override
	public boolean canJumpOver(Position up_dos) {
		return Math.abs(pos.difRow(up_dos)) == Math.abs((pos.difColumn(up_dos)))
				&& Math.abs(pos.difRow(up_dos)) >= 2;
	}

}
