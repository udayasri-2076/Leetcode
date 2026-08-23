class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        //go through every string

        for(String str : strs){
            //convert String into Character array
            //"eat"->['e','a','t']

            char[] arr=str.toCharArray();

            //sort the characters- 'a','e','t'
            Arrays.sort(arr);

            //convert character array back to string

            String key=new String(arr); //['a','e','t']->"aet"

            //if this anagram grooup does not exist create a new list

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            //add the original strig to its anagram group

            map.get(key).add(str);


        }
        //retrun all the anagrams group

        return new ArrayList<>(map.values());
    }
}