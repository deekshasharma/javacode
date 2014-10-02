package CodeEval;


import java.io.File;
/*
https://www.codeeval.com/open_challenges/26/
*/

public class FileSize {

    public static void main(String[] args) {
        String path = args[0];
        System.out.println(new File(path).length());
    }
}
