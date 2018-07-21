
public class MultiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 0
		 * 1
		 * 2
		 * 4
		 * 8
		 * */
        String userValue = "5";
        StringBuffer resultValue=new StringBuffer();
        if (userValue != null){
            String binaryValue=Integer.toBinaryString(Integer.parseInt(userValue));
            System.out.println("binaryValue :: "+binaryValue);
            int binaryLength=binaryValue.length();
            System.out.println("binaryLength value :: "+binaryLength);
            int binaryArray[] = new int[binaryLength];
            for(int i=0 ; i< binaryValue.length() ; i++)
            {
                char value=binaryValue.charAt(i);
                binaryArray[i]=Integer.parseInt(String.valueOf(value));
            }
            Object[] attributeValuesArray= {"one","two","three","four","five"};

            for(int k=binaryLength-1;k>=0;k--){
            	System.out.println(binaryValue.charAt(k)=='1');
                if (binaryArray[k]==1) {
                    String attributeValue= (String) attributeValuesArray[(binaryLength-1)-k];
                    resultValue.append(attributeValue);
                    if(k!=0){
                        resultValue.append(",");
                    }
                }
            	
            }
	    System.out.println("resultValue :: "+resultValue);
        }
	}
	

}
