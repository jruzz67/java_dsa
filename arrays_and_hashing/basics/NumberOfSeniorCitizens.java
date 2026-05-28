// public class NumberOfSeniorCitizens {
//     public int countSeniors(String[] details) {
//         int count = 0;

//         for(String s : details) {
//             int tens = s.charAt(11) - '0';
//             int ones = s.charAt(12) - '0';

//             int age = tens * 10 + ones;

//             if(age > 60) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }
public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int res=0;
        for(String str: details){
            if(str.charAt(11)>='6')
            {
                if(str.charAt(11)=='6'&&str.charAt(12)=='0')
                res--;
                res++;
            }
        }
        return res;
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
