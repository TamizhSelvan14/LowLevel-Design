import javax.management.monitor.Monitor;

public class Desktop {

    private Monitor monitor;
    private Keyboard keyboard;

    public Desktop(Keyboard keyboard,Monitor monitor){
        this.monitor=monitor;
        this.keyboard=keyboard;
    }
}

interface Keyboard{

}


class QueryKeyboard implements Keyboard{

}