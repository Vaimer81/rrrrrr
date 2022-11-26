public class ArrayUtil {
    public static int findelement(int[] array ,int searchelement) {
        int resultofSearch = -1;
        for (int index = 0; index < array.length; index++){
           int elementofArray =array[index];
           if (elementofArray == searchelement){
               resultofSearch = index;
               break;

           }
        }
        return resultofSearch;
    }
}
