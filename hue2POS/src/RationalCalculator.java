public class RationalCalculator extends AbstractCalculator{
    public RationalCalculator() {
        super((a, b) -> {
            return new Number(a.getA()*b.getB()+(b.getA()*a.getB()),a.getB()*b.getB());
        }, (a,b)->{
            return new Number(a.getA()*b.getB()-(b.getA()*a.getB()),a.getB()*b.getB());
        }, (a,b)->{return new Number(a.getA()*b.getA(),a.getB()*b.getB());},
                (a,b)-> new Number(a.getA() * b.getB(), a.getB() * a.getA()));
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a,b);
    }
}
