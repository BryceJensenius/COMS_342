package arithlang;

import java.util.List;

import static arithlang.AST.*;
import static arithlang.Value.NumVal;

public class Evaluator implements Visitor<Value> {
    final Printer.Formatter ts = new Printer.Formatter();

    Value valueOf(Program p) {
        return (Value) p.accept(this);
    }

    @Override
    public Value visit(AddExp e) {
        // semantics for add expression
        List<Exp> operands = e.all();
        NumVal val1 =(NumVal) operands.get(0).accept(this);
        NumVal val2 = (NumVal) operands.get(1).accept(this);

        return new NumVal(val1.v().add(val2.v()));
    }

    @Override
    public Value visit(NumExp e) {
        return new NumVal(e.v());
    }

    @Override
    public Value visit(MultExp e) {
        // semantics for Multiply expression
        List<Exp> operands = e.all();
        NumVal val1 =(NumVal) operands.get(0).accept(this);
        NumVal val2 = (NumVal) operands.get(1).accept(this);

        return new NumVal(val1.v().mul(val2.v()));
    }

    @Override
    public Value visit(Program p) {
        return (Value) p.e().accept(this);
    }
}
