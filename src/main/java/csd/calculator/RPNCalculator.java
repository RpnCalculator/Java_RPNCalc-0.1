package csd.calculator;

public class RPNCalculator {

    public static void main(final String[] args) throws Exception {

        final RPNCalculator calc = new RPNCalculator();
        calc.run(new StreamTokenizer(System.in));
    }

    public void run(final StreamTokenizer streamTokenizer) {
        System.out.println("Enter your input here:");
        while (true) {
            processInput(streamTokenizer);
        }
    }

    public void processInput(final StreamTokenizer streamTokenizer) {
        streamTokenizer.waitForInput();
        while (streamTokenizer.tokenAvailable()) {
            System.out.print(streamTokenizer.nextToken() + " ");
        }
        System.out.println("");
    }
}
