package shapeShifter.src;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter a);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer>values();
	
}
