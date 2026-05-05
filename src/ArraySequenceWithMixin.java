public class ArraySequenceWithMixin extends ArraySequence{

    MixinProvides mixinProvides;
    ArraySequence sequence;

    public ArraySequenceWithMixin(MixinProvides mixinProvides) {
        sequence = new ArraySequence(100);
        this.mixinProvides = mixinProvides;
        this.mixinProvides.setSequence(sequence);
    }

    public void add(int j) {
        sequence.add(j);
    }

    public void sort() {
        mixinProvides.bubblesort();
    }

    public String print() {
        return mixinProvides.print();
    }
}
