public class PositionClass implements Position{
	private int row, column;

	public PositionClass(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public int getRow() {
		return row;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public int difRow(Position down_three) {
		return down_three.getRow() - getRow();
	}

	@Override
	public int difColumn(Position down_three) {
		return down_three.getColumn() - getColumn();
	}

	@Override
	public boolean equals(Position down_three) {
		return down_three.getRow() == row && down_three.getColumn() == column;
	}

}
