public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        Main m=new Main();
        m.singleResponsibility();//single responsibility
        m.openClosedPrinciple();//open closed
        m.liskovSubstitutionPrinciple();//liskov substitution
        m.interfaceSegregationPrinciple();//interface segregation principle
        m.dependencyInversion();//dependency inversion


    }

    public  void singleResponsibility(){
        //     Single responsibility principle
        System.out.println( "Single responsibility principle ");

        //book class only can be used to add books and search if we add print func it violates and it will be a mess
        Book sr=new Book();

        String name="test";

        sr.InitializeVariables(name,name,name);

        System.out.println( sr.findByAuthor("tamizh") );
        System.out.println(sr.findByName("tamizh") );

        // bad practise so single responsibility states
        //moving to separate class
        //        sr.printToConsole();

        // this way is satisfies the single responsibility principle
        BookPrinter b=new BookPrinter();

      b.printTextToConsole(sr.getBookName());
        System.out.println( "Single responsibility principle End");

    }

    public void openClosedPrinciple(){

    //open closed principle should be open for extension and closed for modification
        System.out.println( "----Open Closed principle----");

//        Operation oc=new Operation();
//        System.out.println( oc.calculate(1,2,"+") ); //this will work fine but if we implement another operator we need to modify  existing class so its prone to bugs

        //correct way
        Addoperation add=new Addoperation();
        System.out.println( add.calculate(1,2));
        SubtractOperation sub=new SubtractOperation();
        System.out.println( sub.calculate(1,2));

        System.out.println( "----Open Closed principle end----");

    }

    public void liskovSubstitutionPrinciple(){
        System.out.println( "----liskov substitution principle----");

        //derived classes should be substitutable for their base classes

        VehicleMonitor vm=new VehicleMonitor();

        vm.startvechicles();//this is a problem as there might be exception error so make as separate interface to overcome this

//        we can fix this by calling another 2 class like vehiclewithengine and vehiclewithoutengine

//        so car will bbe child of vehiclewithengine and cycle will be child of vehiclewithoutengine



        System.out.println( "----liskov substitution principle end----");

    }


    public void interfaceSegregationPrinciple(){
        System.out.println( "----interfaceSegregationPrinciple----");

        cuboid c=new cuboid();
        square s=new square();

        c.calculateArea();
        c.calculateVolume();

        s.calculateArea();



        System.out.println( "----interfaceSegregationPrinciple end ----");

    }
    public void dependencyInversion(){
        System.out.println( "----dependencyInversion----");




        System.out.println( "----dependencyInversion end ----");

    }



}