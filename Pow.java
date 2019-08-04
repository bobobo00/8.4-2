package day16;

/**
 * @ClassName Pow
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/4 22:48]
 * @Version 1.0
 **/

public class Pow {
        public double pow(int x,int y){
            int m=0;
            int temp=y;
            int result=1;
            int a=x;
            if(x==0){
                return 0;
            }else if(y==0){
                return 1;
            }else if(y<0){
                if(x==0){
                    System.err.println("分母不可为0");
                    return -1;
                }
                m=1;
            }
            while(temp>1){
                a*=a;
                result=a;
                temp>>=1;
            }
            if(y%2==1){
                result*=x;
            }else if((y/2)%2==1){
                x*=x;
                result*=x;
            }
            return m>0? 1/result:result;
        }

        public static void main(String[] args) {
            Pow p=new Pow();
            System.out.printf("%f",p.pow(2,-10));
        }
    }



