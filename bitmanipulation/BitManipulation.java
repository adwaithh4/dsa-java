package bitmanipulation;

public class BitManipulation {

    public static void oddOrEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n & bitMask) == 0 ? 0 : 1;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n & ~bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n){
        int count =0 ;
        while(n>0){}
        if ((n&1) != 0 ){
            count++;
        }
        n= n>>1;
        return count;
    }

        
        public static void main(String[] args) {
        int n = 7;
        oddOrEven(n);

        int i = 2;
        System.out.println(getIthBit(n, i));
        System.out.println(setIthBit(n, i));
        System.out.println(clearIthBit(n, i));

        int newBit = 0;
        System.out.println(updateIthBit(n, i, newBit));

        System.out.println(clearLastIBits(n, i));

        int j = 1;
        System.out.println(clearRangeOfBits(n, i, j));

        System.out.println(isPowerOfTwo(8));

        System.out.println(countSetBits(15));
    }
}