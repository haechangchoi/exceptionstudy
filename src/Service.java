public class Service {

    Client client = new Client();

    public void callCatch(){
        try{
            client.call();
        } catch (MyCheckedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("정상흐름");
    }

    public void callThrow() throws MyCheckedException{
        client.call();
    }
}
