public class Tester {
    public static void main(String[] args) {
        int start=1;
        int destination=2;
        int number=0;
        if (start == 1){
            if(destination==2){
                System.out.println("ticket:"+number+" "+"price:"+600*number);
            }
            else{
                System.out.println("ticket:"+number+" "+"price:"+1500*number);
            }
        }
        else if(start==3){
            if(destination==2){
                System.out.println("ticket:"+number+" "+"price:"+900*number);
            }
            else{
                System.out.println("ticket:"+number+" "+"price:"+1500*number);
            }
        }
    }
}
