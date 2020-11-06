package chapter1;




public class ShiftArray {


    public static void main(String[] args) {
        ShiftArray az  = new ShiftArray();

        String s  = "a1a2a3a4";
        char temp = s.charAt(0);
        String reminder = s.substring(1);
        System.out.println(reminder);
       
    }

    public int [] shiftAllElementByPosition(int [] input, int position) {

        for(int i = input.length -1-1; i >=position ; i--) {
            input[i+1] = input[i];
            if(i == position){
                input[i] = 0;
            }
        }
        return input;
    }

    public int [] shiftZeroWithNextNUmber(int [] input) {

        for(int i = 0; i < input.length; i++ ){

            if(input[i] == 0){
                i++;
                shiftAllElementByPosition(input, i);
            }
        }
        return  input;
    }

}
