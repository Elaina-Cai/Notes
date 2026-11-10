// 测试6: 求e=1+1/1!+1/2!+1/3!+...1/n!的近似值，当1/n!小于0.0001时停止计算
public class Test6 {

    protected void print6(){
        double e = 1; // e的近似值
        double factorial = 1; // n!
        int n = 1; // 计算项数
        while(1/factorial >= 0.0001){ // 当1/n!小于0.0001时停止计算
            e += 1/factorial; // 累加项
            factorial *= n; // 计算n!
            n++; //n增加
        }
        System.out.println("e的近似值为:"+e);
    }

}
