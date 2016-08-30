// write your program for the Exercise class here
class Exercise {

    Double[] arr;

    public Exercise() {
    }

    public Exercise(Double[] input) {
        arr = new Double[input.length];
        for (int i = 0; i < input.length; ++i) {
            arr[i] = input[i];
        }
    }

    public double sum() {
        double tot = 0.0;
        for (int i = 0; i < this.arr.length; ++i) {
            tot += this.arr[i];
        }
        return tot;
    }

    public double altdiff() {
        double tot = 0.0;
        for (int i = 0; i < this.arr.length; ++i) {
            if (i % 2 == 0) {
                tot += this.arr[i];
            } else {
                tot -= this.arr[i];
            }
        }
        return tot;
    } 
}
