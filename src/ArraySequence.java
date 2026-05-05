
public class ArraySequence implements MixinRequires{

    int[] data;
    int last;

    public ArraySequence(int size) {
        this.data = new int[size];
        last = 0;
    }

    public ArraySequence() {
    }

    @Override
    public int get(int i) {
        return (i < this.data.length) ? this.data[i] : null;
    }

    @Override
    public int length() {
        return last;
    }

    @Override
    public void swap(int i, int j) {
        var tmp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = tmp;
    }

    public void add(int j) {
        data[last++] = j;
    }
}
