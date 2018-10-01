public class Calculate{
	    public static void main(String[] arg) {
        System.out.println("Calculate........and Hello World.");
        int firstInt=8458;
        int secondInt=4859;

//        int first = Integer.valueOf(arg[0]);
//        int second = Integer.valueOf(arg[1]);
        int sum = firstInt+secondInt;
        System.out.println(firstInt+" plus " +secondInt+ " is " + sum);
        float num1 = 73485.5f;
        float num2 = 2873465.523897f;
double sumFloat= num1+num2;
        System.out.println(num1+num2);
        System.out.println(sumFloat);

        System.out.println("multiply     "+num1*num2);
        System.out.println("multiply     "+firstInt*secondInt);
        System.out.println("division 1   "+num1/num2);
        System.out.println("division 1   "+firstInt/secondInt);



    }
}