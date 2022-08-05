import java.util.Scanner;

public class Input {
	private Student[] array; // array는 main에서 만든 array
	private Scanner sc; // 스캐너를 바깥으로 뺀 이유:

	public Input(Student[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
	}

	public int input() {// 캡슐화를 위해 public 추가. return을 써야하므로 void 대신 int
		String io = null;
		int count = 0;
		do {
			count++;
			System.out.println("Hakbun: "); 
			String hakbun = this.sc.nextLine();
			System.out.println("name: ");
			String name = this.sc.nextLine();
			System.out.println("korean: ");
			int kor = this.sc.nextInt();
			System.out.println("english: ");
			int eng = this.sc.nextInt();
			System.out.println("math: ");
			int mat = this.sc.nextInt();
			System.out.println("EDPS: ");
			int edp = this.sc.nextInt();
			this.sc.nextLine();//buffer 날리기
			this.array[count-1]=new Student(hakbun, name, kor,eng,mat,edp);
			

			System.out.println("계속(i/o)?: ");
			io = this.sc.next();
		} while (io.equals("I") || io.equals("i"));
		return count;
	}

}
