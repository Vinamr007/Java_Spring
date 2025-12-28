package day5;

public class ExceptionDemo {
    public static void main(String[] args) {
try {
    int a = 10 / 0;
}catch(Exception e){
    System.out.println(e.fillInStackTrace());
}finally {
    System.out.println("done" );
}

    }
}
