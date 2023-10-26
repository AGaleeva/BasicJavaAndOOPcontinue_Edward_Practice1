public class PrimitiveTypeArgsAppl2 {
    static private String[] types = {"byte", "int", "short", "long", "char", "float", "double"};
    static private String[] minValues = {Byte.toString(Byte.MIN_VALUE), Integer.toString(Integer.MIN_VALUE),
            Short.toString(Short.MIN_VALUE), Long.toString(Long.MIN_VALUE), Integer.toString(Character.MIN_VALUE),
            Float.toString(Float.MIN_VALUE), Double.toString(Double.MIN_VALUE)};
    static private String[] maxValues = {Byte.toString(Byte.MAX_VALUE), Integer.toString(Integer.MAX_VALUE),
            Short.toString(Short.MAX_VALUE), Long.toString(Long.MAX_VALUE), Integer.toString(Character.MAX_VALUE),
            Float.toString(Float.MAX_VALUE), Double.toString(Double.MAX_VALUE)};

    public static void main(String[] args) {
        if (args.length == 0) {
            displayMinMax();
        } else for (int i = 0; i < args.length; i++) {
            displayMinMax(args[i]);
        }
    }

    public static void displayMinMax() {
        for (int i = 0; i < types.length; i++) {
            printResult(i);
        }
    }

    public static void displayMinMax(String type) {
        int num = findIndexOfType(type);
        if (num >= 0) {
            printResult(num);
        } else {
            System.out.println();
            System.out.println(type + " is not a primitive type");
        }
    }
    public static int findIndexOfType(String type) {
        for (int i = 0; i < types.length; i++) {
            if (type.equals(types[i])) return i;
        }
        return -1;
    }

    public static void printResult(int i) {
        System.out.println();
        System.out.println("Minimal value of the type " + types[i] + ": " + minValues[i]);
        System.out.println("Maximal value of the type " + types[i] + ": " + maxValues[i]);
    }
}
