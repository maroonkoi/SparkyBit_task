public class Main {

    //    public static final String inputPath = "src\\input1000.txt";
    public static final String inputPath = "src\\input.txt";
    public static final String outputPath = "src\\output.txt";
    public static final myIO myInterface = new myIO(inputPath, outputPath);

    public static void main(String[] args) {
        fibonacciIO();
        System.out.println("Done!");
    }

    static void fibonacciIO() {
        int prevFibonacci, nextFibonacci, line;
        prevFibonacci = nextFibonacci = line = 1;
        for (String s = myInterface.readLine(); s != null; s = myInterface.readLine(), line++) {
            if (line == nextFibonacci) {
                int sum = prevFibonacci + nextFibonacci;
                prevFibonacci = nextFibonacci;
                nextFibonacci = sum;
                myInterface.writeLine(reverse(s) + "\n");
                continue;
            }
            myInterface.writeLine(s + "\n");
        }
    }

    static String reverse(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'o') {
                sb.append("a");
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
