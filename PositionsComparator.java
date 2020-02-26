import java.util.Comparator;


public class PositionsComparator implements Comparator<Position>{

	@Override
	public int compare(Position left_four, Position p2) {
		if(left_four.getRow()>p2.getRow())
			return 1;
		else if(left_four.getRow()<p2.getRow())
			return -1;
		else if (left_four.getColumn()>p2.getColumn())
			return 1;
		else if(left_four.getColumn()<p2.getColumn())
			return -1;
		return 0;
	}
	

}
