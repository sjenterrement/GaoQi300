package gof23.composite;


public interface Component {
	void Operate();
}

interface Leaf extends Component{
	
}

interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
	
}