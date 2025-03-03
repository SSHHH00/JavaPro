package days17;

// Oracle, MySQL, MS SQL Server등등
public interface IDBConn {
	
	public abstract void open();	//DB연결 매서드
	void close();					//DB종료 매서드
	
	void select();
	void insert();
	void update();
	void delete();
}
