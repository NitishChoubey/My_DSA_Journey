package Hashing ;
import java.util.* ;

public class HashMapCode{
    static class HashMap<K , V>{ //generics
        private class Node{
            K key ;
            V value ;

            public Node(K key , V value){
                this.key = key ;
                this.value = value ;
            }
        }

        private int n ; //n --> nodes
        private int N ; //N --> total no. of buckets
        private LinkedList<Node>[] buckets ; //this is JAVA declaration of any array .....C language-type declaration --> private LinkedList<Node> buckets[]
        //yhaa pe array "buckets" ka type hai LinkedList<Node> ....jaise int[] array apn likhte hai n ussi tarah se...
        @SuppressWarnings("unchecked") // output window me warnings line ko hatane ke liye isko likha gya h...
        public HashMap(){
            this.N = 4 ;
            this.buckets = new LinkedList[4] ;  //array ko initialize kr diyaa gya h ..
            for(int i = 0 ; i < 4 ; i++){
                this.buckets[i] = new LinkedList<>();  // buckets array ke har index pe empty LinkedList create kraa gyaa h yhaa pe ....ye LinkedList aage chl kr node ko store karega..
            }
        }
        private int hashFunction(K key){ //bucket index return karega..
               int bucketIndex =  key.hashCode(); //it can return both positive and negative values
               return (Math.abs(bucketIndex) % N) ;  // bucket index should be between 0  to N-1
        }

        private int searchInLinkedList(K key , int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex] ;

            for(int  i = 0 ; i < ll.size() ; i++){
                if(ll.get(i).key == key){
                    return i; //dataIndex
                }
            }
            return -1 ;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){  //ye function rehashing perform kregaa .... array ki size ko increase kr dega puraane size ke double kr dega ..
            LinkedList<Node>[] oldBucket = buckets ;
            buckets = new LinkedList[N*2] ;

            for(int i = 0 ; i < N*2 ; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0 ; i < oldBucket.length ; i++){
                LinkedList<Node> ll = oldBucket[i] ;
                for(int  j= 0 ; j < ll.size() ;j++){
                    Node node = ll.get(j) ;
                    put(node.key , node.value);
                }
            }
        }
        public void put(K key , V value){
            int bucketIndex = hashFunction(key) ;  //this function is like a blackbox which returns the bucket Index...if key exists then it will return the bucket index and if not exist then also it will return the bucketIndex aur whaa pe jo linkedlist hogaa uske kisi node pe wo key insert ho jaaega..
           int dataIndex =  searchInLinkedList(key , bucketIndex) ; //dataIndex ---> ye data Index ko store karega aur search fucntion me hm key aur bucketIndex pass krenge aur wo uss bucket index pe jo linked list h usme jaa ke key ko search karega ...agrr key hogaa to uss data Index ko ye searcxh function return kr dega
            //dataIndex --> linked list ke andrr hmko nodes ki index bataega.. copy me diagram h dekh skte ho..

            if(dataIndex == -1){ //key doesnt exist
                buckets[bucketIndex].add(new Node(key , value)); // yhaa pe bucket index pe jaa ke new node ko add kraa jaa rha h..
                n++ ; // new node add hua hai toh n ka value bhi badega
            }else{ //key exists
              Node node =  buckets[bucketIndex].get(dataIndex) ;  //ye node de degaa ...agrr node phele se hai whaa pe toh ..
              node.value = value ;  // node ki value ko stroe kraa gyaa..
            }

            double lambda = (double)n/N ;
            if(lambda > 2.0){   // yhaa pe lambda = n/N ..check kraa jaa rha h khi lambda ki value constant se badi toh nhi hai....aur agrr badi hai toh rehashing kr do..
                //rehashing
                rehash() ;
            }
        }
        public boolean containsKey(K key){
            int bucketIndex = hashFunction(key) ;
            int dataIndex =  searchInLinkedList(key , bucketIndex) ; //dataIndex

            if(dataIndex == -1){ //key doesnt exist
                return false ;
            }else{ //key exists
                return true ;
            }
        }
        public V remove(K key){
            int bucketIndex = hashFunction(key) ;
            int dataIndex =  searchInLinkedList(key , bucketIndex) ; //dataIndex

            if(dataIndex == -1){ //key doesnt exist
                return null ;
            }else{ //key exists
                Node node =  buckets[bucketIndex].remove(dataIndex) ;
                n-- ;
                return  node.value ;
            }
        }

        public V get(K key){
            int bucketIndex = hashFunction(key) ;
            int dataIndex =  searchInLinkedList(key , bucketIndex) ; //dataIndex

            if(dataIndex == -1){ //key doesnt exist
                return null ;
            }else{ //key exists
                Node node =  buckets[bucketIndex].get(dataIndex) ;
               return  node.value ;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>() ;

            for (int i = 0; i < buckets.length; i++) { // bucketIndex
                LinkedList<Node> ll  = buckets[i] ;
                for(int j = 0 ; j < ll.size() ; j++){ //dataIndex
                    Node node = ll.get(j) ;
                    keys.add(node.key) ;
                }
            }
            return keys ;
        }
        public boolean isEmpty(){
            return n == 0 ;
        }
    }

    public static void main(String[] args) {
        HashMap<String , Integer>  map = new HashMap<>() ;
        map.put("India" , 190) ;
        map.put("China" , 200) ;
        map.put("USA" , 50) ;

       ArrayList<String> keys = map.keySet() ;
       for(int i = 0 ; i < keys.size() ; i++){
           System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
       }

       map.remove("India") ;
        System.out.println(map.get("India"));


    }
}
