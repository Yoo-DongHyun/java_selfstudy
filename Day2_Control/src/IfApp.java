import javax.swing.JOptionPane;

public class IfApp {
	public static void main(String[] args) {
		 String[][] users = {
				 {"egoing", "1111"},{"jinhuck", "2222"},{"youbin","3333"}
		 };
		 String inputId = JOptionPane.showInputDialog("아이디를 입력하세요");
		 String inputPw = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		 boolean isRight= false;
		 
		 System.out.print("Hi, ");
		 
		 for(int i=0; i<users.length;i++) {
			 if(users[i][0].equals(inputId) && users[i][1].equals(inputPw) ) {
				 isRight = true;
			 }
		 }
		 if(isRight) {
			 System.out.println("Master");
		 }
		 else {
			 System.out.println("Who are you?");
		 }
	}
}
