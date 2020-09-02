package LabArray;

class SwapElements {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};

        // Swap the first element with the last

        // temporary variable to hold elements[0]
        int temp = elements[0];
        // set index 0 of elements to equal the value of the last index
        elements[0] = elements[elements.length - 1];
        // set the last index to our temp variable (elements[0])
        elements[elements.length - 1] = temp;
    
    
        // print each element of the elements array
        for (int i = 0; i < elements.length; i++) {
            
            System.out.println(elements[i]);
        }

    }
}