public class RecursionExamples {



    public String reverse(String w , int index){

        StringBuilder sb = new StringBuilder();

        reverseChar(w, w.charAt(index), index);

        return null;


    }

    char reverseChar(String w, char c , int index){

        if(index == w.length()-1 ){
            return w.charAt(index);
        }

        return  'c';
    }

}
