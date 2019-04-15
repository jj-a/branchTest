package branchTest;

public class BranchTest {

	public static void main(String[] args) {
		
		Branch branch=new Branch();
		branch.create();

	}

}

class Branch {

	public Branch() {
		System.out.println("Start Branch Test");
	}
	
	public void create() {
		System.out.println("Create Feature Branch");
	}
	
	public void add2() {
		System.out.println("Add push 2");
	}
	
}
