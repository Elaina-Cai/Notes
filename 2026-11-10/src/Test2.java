// 测试2: 函数y(t)
public class Test2 {

    protected double print21(double t){
        double y;
        if(0<=t && t<1){
            y = t*t-1;
        }
        else if(1<=t && t<3){
            y = t*t*t-2*t-2;
        }
        else if(3<=t && t<5){
            y = t*t-t*Math.sin(t);
        }
        else if(5<=t && t<7){
            y = t+1;
        }
        else{
            y = t-1;
        }
        return y;
    }

    protected double print22(double t){
        double y;
        int key = (int) Math.floor(t);
        switch (key){
            case 0:
                y = t*t-1;
                break;
            case 1:
                y = t*t*t-2*t-2;
                break;
            case 3:
                y = t*t-t*Math.sin(t);
                break;
            case 5:
                y = t+1;
                break;
            default:
                y = t-1;
                break;
        }
        return y;
    }
}
