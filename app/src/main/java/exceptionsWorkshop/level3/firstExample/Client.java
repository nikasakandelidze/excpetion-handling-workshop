package exceptionsWorkshop.level3.firstExample;

public class Client {

    public static void main(String[] args) {
        /*
            Create an instance of storage
         */
        var storage = new Storage();
        /*
            Create an instance of Service with storage injected in it
         */
        var service = new Service(storage);
        try{
            var result = service.getAllUsernames(); // try to fetch all usernames
            System.out.println(result);
        }catch (Service.OurServiceException e){
            /*
             handle exceptional event gracefully, when thread comes to this point of execution
             we for sure know that an exceptional event happened which is an edge case an must be treated gracefully.
             */
            System.out.println(e.getMessage());
        }
    }
}
