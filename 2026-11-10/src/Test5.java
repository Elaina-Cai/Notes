// 测试5: 求1000之内的所有完全数，完全数是指一个数等于它的所有因子（不包括它本身）的和的数
public class Test5 {

    protected void print5(){
        for(int i=1;i<=1000;i++){
            int sum = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i+"是完全数");
            }
        }
        System.out.println();
    }
}
