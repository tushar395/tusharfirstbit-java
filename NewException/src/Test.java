
class LowmarksException extends Exception {
	public String toString() {
		return "marks Less than 0";

	}

}

class HighmarksException extends Exception {
	public String toString() {
		return "marks greater  than 100";

	}
}

class Test {
	public static void main(String[] args) {
		int marks=45;
		if(marks<0) {
			throw new LowmarksException();
			
		}
		if(marks>100) 
		{
			throw new HighmarksException();
	  }
		catch
		(LowmarksException lme) {
			System.out.println(lme);
		}
		catch(HighmarksException lme) {
			System.out.println(lme);
}
