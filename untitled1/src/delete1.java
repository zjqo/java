import java.util.Arrays;

//删除数组元素
public class delete1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        a = new delete1().init(a,2);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
    int []init (int []a ,int x){
        int [] b = new int[a.length-1];
        int index=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=x){
                b[index] = a[i];
                index++;
            }
        }
        return b;
    }
    int []init2 (int []a ,int x){
        int index=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=x){
                a[index] = a[i];
                index++;
            }
        }
        int [] b = Arrays.copyOf(a,index);
        return b;
    }

}


