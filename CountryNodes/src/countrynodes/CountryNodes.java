package countrynodes;

public class CountryNodes {
    
public static void main(String[] args) {
        
        // Initiates new classes which serves as the Nodes in the LinkedList.
        Node n1 = new Node("England", "London");
        Node n2 = new Node("Australia", "Perth");
        Node n3 = new Node("America", "NewYork");
        Node n4 = new Node("Taiwan", "Kaohsiung");
		
	
        // Sets up Linked List.
        n1.setPrev(null);
        n1.setNext(n2);
        n2.setPrev(n1);
        n2.setNext(n3);
        n3.setPrev(n2);
        n3.setNext(n4);
        n4.setPrev(n3);
        n4.setNext(null);
        
		
        // Print out of the linked list.
        System.out.println("Value in n1 :  " + n1.getData1() + "  " + n1.getData2());
        System.out.println("Value in n1 :  " + n2.getData1() + "  " + n2.getData2());
        System.out.println("Value in n1 :  " + n3.getData1() + "  " + n3.getData2());
        System.out.println("Value in n1 :  " + n4.getData1() + "  " + n4.getData2());
         
    }
    
}

// Node class to represent the different elements of the Linked List.
 class Node{

    /**
     * @return the data1
     */
    public String getData1() {
        return data1;
    }

    /**
     * @param data1 the data1 to set
     */
    public void setData1(String data1) {
        this.data1 = data1;
    }

    /**
     * @return the data2
     */
    public String getData2() {
        return data2;
    }

    /**
     * @param data2 the data2 to set
     */
    public void setData2(String data2) {
        this.data2 = data2;
    }

        /**
         * @return the prev
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * @param prev the prev to set
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * @return the next
         */
        public Node getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * @return the data
         */
        

        
        
        // Node Pointers to find the next / previous node in the list.
        private Node prev;
        private Node next;
        // Values to go into the list itself as the Data.
        private String data1;
        private String data2;
        
        // Default constructor for Node Class.
        public Node(){
            // Constructor
        }
        
        // Main Constructor for node class. Creates a new Country instance and passes the data.
         public Node(String data1, String data2){
        Country c = new Country(data1, data2);
        
        this.data1 = data1;
        this.data2 = data2;
        
         }
        
    }
            
        
    // External Class example. 
     class Country{

    /**
     * @return the countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName the countryName to set
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return cityName;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.cityName = city;
    }
    
    
        // Setting values of the Country.
        private String countryName;
        private String cityName;
        //Create new City instance and pass the City name to it.
        City c = new City(getCity());
        
        //Default Constructor.
        public Country(){
            
        }
        
        // Main Constructor to pass values.
        public Country(String countryName, String cityName){
            
            this.countryName = countryName;
            this.cityName = cityName;
        }
        // Internal Class. Hidden and private to contain secret information.
        private class City{

      
            public String getCityName() {
                return cityName;
            }

            /**
             * @param cityName the cityName to set
             */
            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            // Defined value privately in the private Internal Class.
            private String cityName;
            
            //Default Constructor
            private City(){
                
            }
            //Main Constructor to pass value.
            private City(String cityName){
                
                this.cityName = cityName;
                
            }
		
        }
    }
