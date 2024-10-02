package small.example;

public class ModifyData {
    public static void main(String[]args){
        int[] num={3};
        ModifyData mdobj=new ModifyData();
        mdobj.doModification(num[0]);

    }
    public void doModification(int[] num){
        num[0]=num[0]+1;

    }

    }
}
