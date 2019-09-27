public class ArrayCopy {
    public static void main(System[] args){
        int[] src =  {0,2,4,6,8,10};

        int[] dest = new int[5];

        System.arraycopy(src,0, dest, 0, 5);

        for(int i=0;i<dest.length;i++){

            System.out.print("->"+dest[i]);

        }
    }
}