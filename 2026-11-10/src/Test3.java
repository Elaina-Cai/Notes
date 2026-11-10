// 测试3: 打印水仙花数（3位数）的全部解
public class Test3 {

    protected void print3(){
        for(int i = 100;i<1000;i++){
            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c == i){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

}
