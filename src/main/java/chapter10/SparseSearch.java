package chapter10;

public class SparseSearch {

    public int  sparseSearch(String [] array, String key, int first, int last ) {



        if(first > last) return  -1;
        int mid = (first+ last)/2;
        if(array[mid].isEmpty()){
            int left = mid-1;
            int right = mid +1;
            while(true){
                if(left < first && right > last){
                    return -1;
                } else if(right <= last && !array[right].isEmpty()){
                    mid = right;
                    break;
                } else if (left >= first && array[left].isEmpty()){
                    mid = left;
                    break;
                }
                right++;
                left--;
            }
        }

        if(key.equals(array[mid])) return mid;
        else if(array[mid].compareTo(key) < 0){
            return sparseSearch(array, key, mid+1, last);
        }else return sparseSearch(array,key, first,mid-1);


    }


    public int sparseSearch(String [] array , String key){
        if(array == null || key == null || key.isEmpty()) return -1;
        return sparseSearch(array, key,0, array.length-1);
    }
    private int getNewMid( int start ,int  end ,String []  array , int
            mid) {


        int leftP = mid - 1;
        int rightP = mid + 1;

        while (leftP >= start && rightP <= end) {

            if (leftP < start && rightP > end) return -1;
            else if (leftP >= start && !array[leftP].isEmpty()) {
                mid = leftP;
                return mid;

            } else if (rightP <= end && !array[rightP].isEmpty()) {
                mid = rightP;
                return mid;
            }
            rightP++;
            leftP--;
        }

            return mid;
    }

}
