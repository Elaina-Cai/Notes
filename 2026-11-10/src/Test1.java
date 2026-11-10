// 测试1: 输出start到end之间的所有素数
public class Test1 {

    protected void print1(int start,int end){
        int count = 0;
        for(int i=start;i<=end;i++){
            boolean isPrime = true;
            for(int j=2;j*j<i;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i>=2){
                System.out.print(i+" ");
                count++;

                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

}
