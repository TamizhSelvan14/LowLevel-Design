public class Shape {
    double calculateArea(){
        return 0;
    }
    double calculateVolume(){
        return 0;
    };
}

interface calculateArea{
    double calculateArea();
}

interface calculateVolume{

    double calculateVolume();
}


class cuboid implements calculateArea,calculateVolume{


    @Override
    public double calculateArea( ) {
        System.out.println("calculateArea of cuboid");

        return 0;
    }

    @Override
    public double calculateVolume() {
        System.out.println("calculateVolume of cuboid");

        return 0;
    }
}

class square implements calculateArea{

    @Override
    public double calculateArea() {
    System.out.println("calculateArea of square");
        return 0;
    }
//here we don't need volume so use interfaces precisely
//    @Override
//    public double calculateVolume() {
//        return 0;
//    }
}


