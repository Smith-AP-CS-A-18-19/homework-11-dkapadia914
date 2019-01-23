import java.util.ArrayList;

public class Homework11A extends Homework11 {

private ArrayList<Integer> arr1;

	public Homework11A() {
		arr1 = new ArrayList<Integer>();
	}

  public int problem4() {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }

  public void problem2(int n) {
    int count = 0;
    while (count < arr.size()) {
        int num = arr.get(count);
  			if ((n % num) != 0) {
  				arr.remove(count);
  			} else {
  				count += 1;
  		}
  	}
  }
}
