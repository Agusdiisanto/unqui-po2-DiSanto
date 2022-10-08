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
		// TODO Auto-generated method stub
		
		ArrayList<IShapeShifter> elements = new ArrayList<IShapeShifter>();
		
		if (this.deepest() >= 1) {
			for (int i = 0; i < children.size(); i++) {
				elements.add(getChildren().get(i));
				this.getChildren().remove(i);
			}
			this.setChildren(elements);
		}
		return this;
	}

	@Override
	public List<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<IShapeShifter> getChildren() {
		return children;
	}


	private void setChildren(ArrayList<IShapeShifter> children) {
		this.children = children;
	}	
	
	
	
}
