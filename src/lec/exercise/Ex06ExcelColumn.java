package lec.exercise;

public class Ex06ExcelColumn { 
	
	public static String excelColumn(int col) {
        int excelColNum = col ;

        String colRef = "" ; 
        int colRemain = excelColNum;

        while(colRemain > 0) {
            int thisPart = colRemain % 26;
            
            if(thisPart == 0) { 
            	thisPart = 26; 
            }
            
            colRemain = (colRemain - thisPart) / 26;

            // "A" + 1   => "A1"
            // "A" + '1' => "A1"
            // "A" + "1" => "A1"
            // 'A'  + 1 => 66 
            
            // The letter A is at 65
            //char colChar = (char)( thisPart + 64 );
            char colChar = (char)( thisPart + 'A' - 1 );
            colRef = colChar + colRef;
        }

        return colRef ;
    }

	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		for( int i = 1 ; i < 101 ; i ++ ) {
			var base26 = excelColumn(i);
			System.out.println( i + " => base26 = " + base26 );
		}
	}

}
