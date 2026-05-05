
public class ArraySequence implements MixinRequires{

    int[] data;

    public ArraySequence(int[] data) {
        this.data = data;
    }

    public ArraySequence() {
    }

    @Override
    public int get(int i) {
        return (i < this.data.length) ? this.data[i] : null;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public void swap(int i, int j) {

    }

    public void add(int j) {
        this.data[last++] = j;
    }
}
