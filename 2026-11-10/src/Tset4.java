// 测试4: 先生成一个的随机数n（0<n<10），再生成n个0~100的随机数，输出这n个随机数的和
public class Tset4 {

    protected void print4(){
        int n = (int)(Math.random()*9+1); //Math.random()*9得到0~8的随机数，再+1得到1~9的随机数
        int sum = 0;
        for(int i=0;i<n;i++){
            int random = (int)(Math.random()*101);
            sum += random;
        }
        System.out.println("n = "+n);
        System.out.println("这"+n+"个随机数的和为: "+sum);
    }

}
