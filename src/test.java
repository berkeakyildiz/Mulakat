import java.io.*;
import java.util.StringTokenizer;
public class test
{
    public static void main(String[] args)throws Exception
    {
        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)
        File file = new File("C:\\Users\\MONSTER\\studio-projects\\Mülakat\\src\\test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String word;
        String[] arr=new String[15];
        int i=0;
        while ((word = br.readLine()) != null ) {
            StringTokenizer st = new StringTokenizer(word," ");
            while (st.hasMoreTokens()&& i < arr.length) {
                arr[i]=st.nextToken();
                i++;
                //arr[i] = st.nextToken();
                //System.out.println(st.nextToken());
                // }
            }
        }
        int count=0;
        String[] arr2=new String[15];
        for(int a=0;a<arr.length;a++) {
            arr2[a] = arr[a];

        }
        for(int k=0;k<arr.length;k++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[k].equals(arr2[j])) {
                    count++;
                    arr2[j] = "";
                }
            }
            if (count != 0)
                System.out.println(arr[k] + " " + count);
            count=0;
        }
    }

}