public class BetterArray{
    

        public int size;
        public int[] array;
        public int index;
        public int item;
        public int length;

        public BetterArray(){
            size=0;
            array=new int[0];
        }
        
        public BetterArray(int length){
            size=0;
            array = new int[length];


        }

        public int size(){
            return size;
        }
        

        public boolean add(int item){
             int[] temp=new int[array.length];
            if(size<array.length){
                array[size]=item;
                size++;
                return true;
            }
            else if (array.length==0){
                array=new int[1];
                array[0]=item;
                size++;
                return true;
            }else{
                temp=array;
                
                array=new int[array.length*2];
                
                for(int i =0; i<temp.length; i++){
                    array[i]=temp[i];

                }
                array[size]=item;
                
                size++;
            }
             
            return true;
           

        }
                
            

        public void add(int index, int item){
             int[] temp=new int[array.length];
            if(size<array.length){
                for(int i =array.length-1; i>index;i--){
                    array[i]=array[i-1];
                    System.out.println(array[i]);
                }
                array[index]=item;
                
                size++;
            }
            else{
                temp=array;
                
                array=new int[array.length*2];
                
                for(int i =0; i<temp.length; i++){
                    array[i]=temp[i];

                }
                for(int i =array.length-1; i>index;i--){
                    array[i]=array[i-1];
                    
                }
                array[index]=item;
                
                size++;
                
            }
        }


        public int get(int index){
            return array[index];
        }


        public int set(int index, int item){
             int temp = array[index];
            array[index]=item;
            return temp;
        }


        public int remove(int index){
             int temp=array[index];
            for(int i =index; i<array.length-1;i++){
                array[i]=array[i+1];
            }
            size--;
            return temp;
        }
    

    
}