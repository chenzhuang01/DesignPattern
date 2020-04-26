package pattern16_FacadePattern;

public class ClientDemo {

    public static void main(String[] args){
       GeneralSwitchFacade gsf = new GeneralSwitchFacade();
       gsf.on();
       System.out.println("---------------------");
       gsf.off();
    }

}
