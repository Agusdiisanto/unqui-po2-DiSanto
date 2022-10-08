package shapeShifter.src;

import java.util.Arrays;
import java.util.List;

public class ShapeShifter implements IShapeShifter {

private Integer value;
	
	public ShapeShifter(Integer value) {
		this.setValue(value);
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter aShapeShifter) {
		CompShapeShifter shp = new CompShapeShifter();
		
		shp.addElements(this);
		shp.addElements(aShapeShifter);
	
		return shp;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return Arrays.asList(this.getValue());
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
