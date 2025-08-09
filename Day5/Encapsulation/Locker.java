package assignment_5;
//Q4

public class Locker {
	private final int lockerId;
	private boolean isLocked;
	private final String passcode;
	
	private class securitymanager{
		boolean verify(String inputcode) {
			return passcode.equals(inputcode);
		}
	}
	
	public Locker(int lockerId,String passcode) {
		this.lockerId=lockerId;
		this.passcode=passcode;
		this.isLocked=true;
	}
	
	public void lock() {
		isLocked=true;
		System.out.println("Locker "+lockerId +"is now locked");
	}
	
	public boolean unlock(String code) {
		securitymanager sm=new securitymanager();
		
		if(sm.verify(code)) {
			isLocked=false;
			System.out.println("locker"+lockerId+"is now unlocked");
			return true;
		}else {
			System.out.println("incorrect passcode locker remain locked");
			return false;
		}
		
		
	}
	public boolean isLocked() {
		return isLocked;
	}
	
	public int getlockerId() {
		return lockerId;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locker loc=new Locker(100,"anish123");
		
		System.out.println("locker locked?"+loc.isLocked());
		
		loc.unlock("anish12");
		
		
		
		loc.unlock("anish123");
		
		loc.lock();

	}

}

