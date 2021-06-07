package kodlama.hrms.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;
	public DataResult(T data,boolean isSuccess) {
		super(isSuccess);
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	public DataResult(T data,boolean isSuccess,String message) {
		super(isSuccess,message);
		this.data=data;
		// TODO Auto-generated constructor stub
	}
	public T getData() {
		return data;
	}

}
