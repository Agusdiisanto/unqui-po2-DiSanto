package shapeShifter.src;

import java.util.ArrayList;
import java.util.List;

public class CompShapeShifter implements IShapeShifter {
	
	private ArrayList<IShapeShifter> children;
	
	public CompShapeShifter() {
		children = new ArrayList<IShapeShifter>();
	}
	
	
	@Override
	public IShapeShifter compose(IShapeShifter a) {
		// TODO Auto-generated method stub
		CompShapeShifter nuevo = new CompShapeShifter();
		nuevo.getChildren().add(this);
		nuevo.getChildren().add(a);
		return nuevo;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		int total = 1;
		for (IShapeShifter iShapeShifter : children) {
			int actual = total + iShapeShifter.deepest(); 
		
			if (total < actual) {
				total = actual;
			}
		}
		return total;
	}

	@Override
	public IShapeShifter flat() {
		
		if (this.deepest() < 1) {
			return  this;
		}
		
		CompShapeShifter newSS = new CompShapeShifter();
		List<Integer> values = this.values();
		
		for(Integer value : values) {
			newSS.addElements(new ShapeShifter(value));
		}
		return newSS;
	}

	@Override
	public List<Integer> values() {
		
		List<Integer> values = new ArrayList<Integer>();
		
		for(IShapeShifter children : this.getChildren()) {
			values.addAll(children.values());
		}
		return values;
	}

	public ArrayList<IShapeShifter> getChildren() {
		return children;
	}
	
	public void addElements(IShapeShifter shap) {
		children.add(shap);
	}
	
}
