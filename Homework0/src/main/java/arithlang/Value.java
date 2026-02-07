package arithlang;

public interface Value {
    String toString();

    class NumVal implements Value {
        private final AbsVal _val;

        public NumVal(AbsVal v) {
            _val = v;
        }

        public AbsVal v() {
            return _val;
        }

        public String toString() {
            return _val.toString();
        }
    }

    class DynamicError implements Value {
        private final String _errorMsg;

        public DynamicError(String v) {
            _errorMsg = v;
        }

        public String v() {
            return _errorMsg;
        }

        public String toString() {
            return _errorMsg;
        }
    }

    /*
        AbsVal to abstract out the logic for determining the string value
        This way it can just call add or mul with the other operand to get the correct
        value easily.
     */
    enum AbsVal {
        P("p"), N("n"), Z("z"), U("u");

        private final String repr;

        AbsVal(String r) {
            repr = r;
        }

        @Override
        public String toString() {
            return repr;
        }

        /*
            Factory method for creating AbsVal from an input string
         */
        public static AbsVal fromString(String s) {
            return switch (s) {
                case "p" -> P;
                case "n" -> N;
                case "z" -> Z;
                case "u" -> U;
                default -> throw new RuntimeException("Invalid abstract value: " + s);
            };
        }
        // Method to perform the actual abstract addition based on left and right op
        public AbsVal add(AbsVal other) {
            if (this == U || other == U) return U;
            if (this == Z) return other;
            if (other == Z) return this;
            if (this == other) return this;
            return U;
        }
        // Method to perform the actual abstract multiplication based on this and right op
        public AbsVal mul(AbsVal other) {
            if (this == Z || other == Z) return Z;
            if (this == U || other == U) return U;
            if (this == other) return P;
            return N;
        }
    }
}
