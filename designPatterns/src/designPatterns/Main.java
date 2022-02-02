package designPatterns;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	var editor = new Editor();
	var history = new History();
	
	
	editor.setContent("first");
	history.push(editor.createState());
	editor.setContent("second");
	history.push(editor.createState());
	editor.setContent("third");
	history.push(editor.createState());

	editor.restore(history.pop());
	editor.restore(history.pop());
	editor.restore(history.pop());
	
	System.out.println(editor.getContent());
	}

}
