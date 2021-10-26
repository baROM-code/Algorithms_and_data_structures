package pr2;
import java.util.Arrays;

public class MyArr {
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void setRandom() {
        for (int i = 0; i < this.size; i++) {
            this.arr[i] = (int) (Math.random() * 99999);
        }
    }

    public void sortBubble() {
        int out, in, tmp;
        for (out = 0; out < this.size - 1; out++) {
            for (in = 0; in < this.size - out - 1; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    tmp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = tmp;
                }
            }
        }
    }

    private void change(int a, int b) {
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }

    public void sortSelect() {
        int out, in, mark;
        for (out = 0; out < this.size; out++) {
            mark = out;
            for (in = out + 1; in < this.size; in++) {
                if (this.arr[in] < this.arr[mark]) {
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public void sortInsert() {
        int in, out;
        for (out = 1; out < this.size; out++) {
            int temp = this.arr[out];
            in = out;
            while (in > 0 && this.arr[in - 1] >= temp) {
                this.arr[in] = this.arr[in - 1];
                --in;
            }
            this.arr[in] = temp;
        }
    }

    public void display() {
        System.out.println(Arrays.toString(arr));
    }

}

