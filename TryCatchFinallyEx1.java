public class TryCatchFinallyEx1 {
    public static void main(String[] args){
        System.out.println(fun());
    }

    public static String fun(){
        try{
            int a = 9/0;
        }catch(Exception e){
            System.out.println("in catch");
            return "C";
        }
        finally{
            System.out.println("in finally");
            return "F";
        }
        //System.out.println("end");
        //return "end";
    }
}
