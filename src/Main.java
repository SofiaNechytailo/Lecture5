public class Main {
        public static void main(String[] args) {
             int a =10;
             int b =7;
             int min;
             int max;
            if(a < b){
                min = a;
                max = b;
            }else if(b < a){
                min = b;
                max = a;
            }
             if( a %2 ==0){
                 System.out.println("A  парне число");
             } else {
                 System.out.println("A не парне число");

             }



        }



}