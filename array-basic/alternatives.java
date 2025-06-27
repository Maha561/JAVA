
// print the alternative element of an array
// logic : very simple increment by 2
import java.util.*; //in gfg you no need to import this
class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result = new  ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            result.add(arr[i]);
            i++;
            
            
        }
        return result;
       
        
    }
}
// gfg link : https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1
// linkedin : https://www.linkedin.com/posts/mahalakshmi-anandan_java-activity-7344291914772320256-K8Bj?utm_source=social_share_send&utm_medium=android_app&rcm=ACoAAENMEOYB1-J6Fawtc7is9WMEaNWnp8t8wBc&utm_campaign=copy_link