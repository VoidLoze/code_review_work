public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Дaun?");
        }
        return a / b;
    }


    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int result = add(10, 5); // 15
        result = times(result, 2); // 30
        result = div(result, 3); // 10
        result = dif(result, 4); // 6
        return result;
    }
}
