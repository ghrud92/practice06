package prob6;

import java.util.LinkedList;
import java.util.List;

public class BoardDao {
	
	List<Board> list;
	
	public BoardDao(){
		list = new LinkedList();
		for(int i=0;i<3;i++){
			Board b = new Board();
			b.setTitle("제목"+(i+1));
			b.setContent("내용"+(i+1));
			list.add(b);
		}
	}
	
	public List getBoardList(){
		
		return list;
	}

}
