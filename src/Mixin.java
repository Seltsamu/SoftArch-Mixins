public class Mixin implements MixinProvides{

    private MixinRequires mixinRequires;

    @Override
    public void bubblesort() {
        for (var i = mixinRequires.length() - 1; i >= 0; i--) {
            for (var j = 0; j < i; j++) {
                if (mixinRequires.get(j) > mixinRequires.get(j + 1)) {
                    mixinRequires.swap(j, j+1);
                }
            }
        }
    }

    @Override
    public String print() {
        StringBuilder buf = new StringBuilder("[ ");
        for (var i = 0; i < mixinRequires.length(); i++) {
            buf.append(mixinRequires.get(i));
            buf.append(" ");
        } return buf + "]";
    }

    @Override
    public void setSequence(MixinRequires mixinRequires) {
        this.mixinRequires=mixinRequires;
    }
}
