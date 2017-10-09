public class Assessment {


    private int[] data;

    public static int squareArea(int square) {

        //Write a static method called `square(number)` accepts an integer as input and returns that number times itself.
        int squareArea = square * square;

        return squareArea;
    }

    //Write a static method `sum(number1, number2)` method that works with both integers and doubles (use method overloading) and returns the result.
    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    public double average(int numbers) {
        return 0;
    }

    //Write a `main` method on this class in order to run code that tests the above methods.
    public static double main(String[] args) {

        //square method
        int setSquare = squareArea(5);
        System.out.println("The square is = " + setSquare);


        //sum method
        double sum = sum(2, 3.2);
        System.out.println("The sum is " + sum);
        return sum;
    }

        //average method
        public static double average(double[] data) {
            double sum = 0;
            for (int i=0; i<data.length; i++) {
                sum += data[i];
            }
            return sum / data.length;
        }}








