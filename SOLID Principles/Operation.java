
//this way its open for modification so its prone to bugs if we introduce new operator

//public class Operation {
//
//    public double calculate(double a,double b,String operationType){
//
//        switch (operationType){
//            case "+":
//                return a+b;
//            case "-":
//                return a-b;
//            default:
//                return 0;
//
//        }
//    }
//
//
//}


public interface Operation{
    public double calculate(double a,double b);
}

class Addoperation implements Operation{

    @Override
    public double calculate(double a, double b) {
        return a+b;
    }
}

class SubtractOperation implements Operation{

    @Override
    public double calculate(double a, double b) {
        return a-b;
    }
}