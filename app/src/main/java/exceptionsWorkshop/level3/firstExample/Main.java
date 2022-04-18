package exceptionsWorkshop.level3.firstExample;

public class Main {

    public static void main(String[] args) {
        var storage = new Storage();
        var service = new Service(storage);
        try{
            var result = service.getAllUsernames();
            System.out.println(result);
        }catch (Service.OurServiceException e){
            System.out.println(e.getMessage());
        }
    }
}
