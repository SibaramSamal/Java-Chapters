package reusability;

interface Ax {
	int x = 15;

	void showA();
}

interface Bx extends Ax {
	void show();
}

class xxx implements Bx {
	public void show() {
		System.out.println(Ax.x);
	}

	@Override
	public void showA() {
		// TODO Auto-generated method stub
		
	}
}

public class InheritanceInInterface {
	public static void main(String[] args) {
		xxx o = new xxx();
		o.showA();
	}
}

// When an interface is inherited from another interface, we have to define all the methods of parent and child in the implementing class if we implements child interface.
