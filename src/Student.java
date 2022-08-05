
public class Student {

	private String hakbun;
	private String name;
	private int kor, eng,mat, edp,tot;
	private double avg;
	private char grade;
	
	public Student() {}
		
		public Student(String hakbun, String name, int kor, int eng, int mat, int edp) {
			this.hakbun = hakbun;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
			this.edp = edp;
		}

		public String getHakbun() {
			return hakbun;
		}

		public void setHakbun(String hakbun) {
			this.hakbun = hakbun;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMat() {
			return mat;
		}

		public void setMat(int mat) {
			this.mat = mat;
		}

		public int getEdp() {
			return edp;
		}

		public void setEdp(int edp) {
			this.edp = edp;
		}

		public int getTot() {
			return tot;
		}

		public void setTot(int tot) {
			this.tot = tot;
		}

		public double getAvg() {
			return avg;
		}

		public void setAvg(double avg) {
			this.avg = avg;
		}

		public char getGrade() {
			return grade;
		}

		public void setGrade(char grade) {
			this.grade = grade;
		}

		@Override
		public String toString() {//toString도 적을필요없이 source 활용
			return String.format(
					"%-10\t%10s\t%5d%5d%5d%5d\t\t%5d%8.2f%3c%n", //열자리를 확보후 아래의 여덟개를 입력. 
					//기본이 오른쪽 정렬이기 때문에 '-'를 넣어 왼쪽 정렬
					//%8.2f -> 8:소수점을 기준으로 왼쪽여섯자리, 2:소수점을 기준으로 오른쪽 두자리
					hakbun,name, kor, eng, mat, edp, tot, avg, grade);
		}
		
		
		
		
	}

	
