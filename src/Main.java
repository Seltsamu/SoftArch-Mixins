void main() {
    MixinProvides mixin = new Mixin();
    ArraySequenceWithMixin arr = new ArraySequenceWithMixin(mixin);

    arr.add(5);
    arr.add(2);
    arr.add(8);
    arr.add(1);

    System.out.println((arr.print()));
    arr.sort();
    System.out.println((arr.print()));
}