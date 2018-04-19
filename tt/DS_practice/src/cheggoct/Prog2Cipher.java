package cheggoct;


import java.util.Arrays;

/**
 * CLASS DESCRIPTION COMMENT
 */
public class Prog2Cipher {
    // INSTANCE VARIABLES
    char [ ] keyList; // Use standard alphabet as array
    char [ ][ ] cipherTable = new char[26][26]; // Use keyList.length and set the 2d array to it.
    char [] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    // METHODS
    /**
     * METHOD DESCRIPTION COMMENT
     * @param message;
     * @return result;
     */
    String encode( String message ) {
        String result = "";
        int ascii = -65;
        String[ ] mesArray = message.split("");
        int i = 0;
        for ( String letterString: mesArray ) {
            if ( !" ".equals(letterString) ) {
                char letter = letterString.toUpperCase().charAt(0);
                int j = (int)keyList[ i ] + ascii;
                int k = (int)letter + ascii;
                result += Character.toString( cipherTable[ j ][ k ] );
            } else {
                result += " ";
            }
            i++;
            i = i == keyList.length ? 0: i;
        }
        return result;
    }

    /**
     * METHOD DESCRIPTION COMMENT
     * @param message
     * @return result
     */
    String decode( String message ) {
        String result = "";
        message = message.toUpperCase();
        String[] messageArray = message.split("");
        int i = 0;
        int rows = 0;
        int colmns = 0;
        for(String str: messageArray){
            if( !" ".equals(str) ){
                rows = Arrays.binarySearch(alphabet, keyList[i]);
                for(int k = 0; k < cipherTable[0].length; k++ ){
                    if(cipherTable[rows][k] == str.charAt(0)) {
                        colmns = k;
                    }
                }
                result += Character.toString(alphabet[colmns]);
            }else{
                result += " ";
            }
            i++;
            i = i == keyList.length ? 0: i;
        }
        return result;
    }

    // CONSTRUCTORS
    /**
     * CONSTRUCTOR DESCRIPTION COMMENT
     * @param code
     * @param key
     */

    public Prog2Cipher( char code, String key ) {
        int a;
        int startIndex = Arrays.binarySearch(alphabet, code);
        int b = startIndex;

        //Create the table with shift of b
        //b will be equal to the i of keyList if code == keyList[i]
        for(int i = b; i < alphabet.length; i++){
            for(int j = 0; j < alphabet.length; j++){
                cipherTable[i][j] = j + b >= alphabet.length ? alphabet[ j + b - 26 ]: alphabet[ j + b ];
                b++;
                b = b == alphabet.length ? 0: b;
                System.out.println(cipherTable[i][j]);
            }
        }

        //removes any spaces from the key
        char[ ] tArray = key.toCharArray();
        int i = 0;
        for ( char c: tArray ) {
            if ( c == ' ' ) {
                continue;
            }
            tArray[ i ] = c;
            i++;
        }
        keyList = tArray;
        System.out.println(keyList);
    }



    // MAIN (TEST) Method
    /**
     * METHOD DESCRIPTION COMMENT
     * @param args
     */
    public static void main( String[ ] args ) {
        // Testing only works if using VM argument -ea
        Prog2Cipher self = new Prog2Cipher( 'H', "BABBAGE" );
        assert "PHXXF MQYBPKNJ".equals( self.encode( "Happy Birthday" ) );
        assert "HAPPY BIRTHDAY".equals( self.decode( "PHXXF MQYBPKNJ" ) );
        System.out.println(self.encode("Happy Birthday"));
        System.out.println(self.decode( "PHXXF MQYBPKNJ" ));
    }
} // END OF CLASS --------------------------------------------------------