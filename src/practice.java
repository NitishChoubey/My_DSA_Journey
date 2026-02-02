public class practice {
    public static void main(String[] args) {
        int n=0b1000010000;

     int negative = (~n)+1;
     int position= n & negative;
        String  s=Integer.toBinaryString(position);
        System.out.println(s);
        int counter =0;
        for (int i = s.length()-1; i >=0; i--) {
            counter++;
            if(s.charAt(i)=='1'){
                System.out.println(counter);
            }

        }


    }
}
