public class NullPointer {
	public static void main(String[] args){
		try{
			String str=null;
			if (str.equals("Testing Null Pointer Exception")){
				System.out.println("Testing Null Pointer Exception");
			}
		}
		catch(NullPointerException e){
			System.out.println("Please instantiate the new object");
		}
		catch(Exception e ){
			e.printStackTrace();
			System.out.println("Something went wrog " +e);
		}
	}
}