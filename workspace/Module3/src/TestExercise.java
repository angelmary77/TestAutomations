
public class TestExercise {

	int l;
		int i;
		static int j;

		public static void main(String[] args) {
		TestExercise t = new TestExercise();
		t.non_static();
		t.meth_static2();
		meth_static2();
		t.i=100;
		j=200;
		t.j=400;
		int o = l;
		}


		public void non_static(){
		System.out.println("pass1");
		}

		public static void meth_static2(){
		System.out.println("pass1");
		}

		}
