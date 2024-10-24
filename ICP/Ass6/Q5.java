public class Q5 {
    public static void main(String[] args) {
        Q5 t=new Q5();
        int count=0;
        for(int i=1;i<=10000;i++){
            if(t.isPrime(i)==true)  count++;
        }
        System.out.println(count);
    }
    public boolean isPrime(int number){
        int count=0;
        for(int i=1;i<=number;i++){
           if((number%i)==0) count++;
        }
        if(count>2)  return false;
        else  return true;
    }
}
