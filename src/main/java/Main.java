import task.*;

public class Main {
    public static void main(String[] args) {
        int result = calc.add(5, 5);
        view.viewConsole(result);
        result = calc.sub(5, 5);
        view.viewConsole(result);
        result = calc.multi(5, 5);
        view.viewConsole(result);
        result = calc.div(5, 5);
        view.viewConsole(result);
    }
}