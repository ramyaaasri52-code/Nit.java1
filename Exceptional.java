public class Exceptional {
    public static void main(String[] args) {
        System.out.println("program started");
        int result=10/0;
        System.out.println("error");
        }
        catch(Exception e) {                               
            System.out.println(e.getmessage());                    
        }                                             
        System.out.println("program ended");          
}