public class PrimitiveTypeArgsAppl {
    public static void main(String[] args) {
        /*if (args.length == 0) {
            String[] arguments = {"byte", "int", "short", "long", "char", "float", "double"};
            for (String str : arguments) {
                printMinMaxOfPrimitiveType(str);
            }
        } else if (args.length != 1) {
            System.out.println("Wrong number of args");
        } else printMinMaxOfPrimitiveType(args[0]);*/
        if (args.length == 0) {
            String[] arguments = {"byte", "int", "short", "long", "char", "float", "double"};
            args = arguments;
            for (String str : args) {
                printMinMaxOfPrimitiveType(str);
            }
        }
    }

    //    byte, int, short, long, char, float, double
    public static void printMinMaxOfPrimitiveType(String primitType) {
        switch (primitType) {
            case "byte": {
                System.out.println("min value of byte is: " + Byte.MIN_VALUE + "\nmax value of byte is: " + Byte.MAX_VALUE);
                break;
            }
            case "int": {
                System.out.println("min value of int is: " + Integer.MIN_VALUE + "\nmax value of int is: " + Integer.MAX_VALUE);
                break;
            }
            case "short": {
                System.out.println("min value of short is: " + Short.MIN_VALUE + "\nmax value of short is: " + Short.MAX_VALUE);
                break;
            }
            case "long": {
                System.out.println("min value of long is: " + Long.MIN_VALUE + "\nmax value of long is: " + Long.MAX_VALUE);
                break;
            }
            case "char": {
                System.out.println("min value of char is: " + Character.MIN_VALUE + "\nmax value of char is: " + Character.MAX_VALUE);
                break;
            }
            case "float": {
                System.out.println("min value of float is: " + Float.MIN_VALUE + "\nmax value of float is: " + Float.MAX_VALUE);
                break;
            }
            case "double": {
                System.out.println("min value of double is: " + Double.MIN_VALUE + "\nmax value of double is: " + Double.MAX_VALUE);
                break;
            }
            default:
                System.out.println("Wrong type of args");
        }
    }
}
