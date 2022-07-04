import java.util.Arrays;

/**
 * @author zhuicat
 * @date 2022/6/24 7:19
 * @Description
 */
public class MyTest {
    public static void main(String[] args) {
        int[] array = new int[]{24,69,80,57,13};
        quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {
        if(start < end) {
            int pviot = getIndex(array,start,end);
            quickSort(array,start,pviot -1);
            quickSort(array,pviot+1,end);
        }
    }

    private static int getIndex(int[] array, int start, int end) {
        int i = start,j = end,x = array[i];

        while (i < j) {
            while (i < j && array[j] >= x) {
                j--;
            }
            if(i < j) {
                array[i] = array[j];
                i++;
            }
            while (i<j&&array[i] <= x) {
                i++;
            }
            if (i < j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = x;
        return i;
    }
}
















