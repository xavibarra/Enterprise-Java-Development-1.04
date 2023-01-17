import java.util.Arrays;
public class Main {
    public static void main(String[] args){
    int[] myArray1={1,4,6};
    double num=2;
    double num2=1;
        System.out.println(getDifference(myArray1));
        System.out.println(Arrays.toString(minimum(myArray1)));
        System.out.println(calculateEq(num,num2));
    }
    public static int getDifference (int[] myArray){
        int max=myArray[0];
        int min=myArray[0];

        for (int i=0;i<myArray.length;i++){
            if (max<myArray[i]){
                max=myArray[i];
            }
            if (min>myArray[i]){
                min=myArray[i];
            }
        }
        int result=max-min;
        return result;
    }
    public static int[] minimum (int[] myArray){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int[] result={0,0};
        for (int i=0;i<myArray.length;i++){
            if (min1>myArray[i]){
                min2=min1;
                min1=myArray[i];

            }
            else if(min2>myArray[i]){
                min2=myArray[i];
            }
        }
        result[0]=min1;
        result[1]=min2;
        return result;
    }
    public static double calculateEq (double x, double y){
        double elevated =Math.pow(x,2);
        double parentheses = (((4* y)/5)-x);
        parentheses= Math.pow(parentheses,2);
        double result= elevated+parentheses;
        return result;

    }
}