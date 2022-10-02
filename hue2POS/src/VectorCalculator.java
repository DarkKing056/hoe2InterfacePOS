public class VectorCalculator extends AbstractCalculator{

    public VectorCalculator(){
        super((a,b)->{
            return new Number(a.getA()+b.getA(),a.getB()+b.getB());
        },(a,b)->{
            return new Number(a.getA()-b.getA(),a.getB()-b.getB());
        },(a,b)-> {return new Number(a.getA()*b.getA(),a.getB()*b.getB());
            }, (a,b) -> new Number(a.getA()/b.getA(),a.getB()/b.getB()));
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
        return multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a,b);
    }
}
