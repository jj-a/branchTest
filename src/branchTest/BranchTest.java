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
	
	public void add1() {
		System.out.println("Add push 1");
	}
	
	public void add1(int num) {
		System.out.println("Add push 1-1");
	}
	
}